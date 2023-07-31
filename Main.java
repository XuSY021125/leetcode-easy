public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2};
        int len = remove(array);
        System.out.println(len);
    }
    public static int remove(int[] array){
        int slow = 0,fast = 0;
        while (fast < array.length){
            if (array[slow] != array[fast]){
                slow++;
                array[slow] = array[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}