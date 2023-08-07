import java.util.Arrays;

//977.有序数组的平方
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{-3,2,3,5,6,7};
        int[] array2 = Arrays.copyOf(array1,array1.length);
        for (int i = 0; i < array2.length; i++) {
            array2[i] *=array2[i];
        }
        bubblesort(array2);
        System.out.println(Arrays.toString(array2));
    }
    public static void bubblesort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int key = 0;
            for (int j = 0; j+1 < array.length - i; j++) {
                if (array[j] > array[j+1]){
                    key = 1;
                    swap(array,j,j+1);
                }
            }
            if (key == 0){
                break;
            }
        }
    }
    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
