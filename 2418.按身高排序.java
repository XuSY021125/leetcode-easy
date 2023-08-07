import java.util.Arrays;

//2418.按身高排序
public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"Mary","John","Emma","Ming"};
        int[] heights = new int[]{178,165,175,180};
        insertsort(heights,names);
        System.out.println("按身高降序排序为："+ Arrays.toString(names));
    }
    public static void insertsort(int[] array,String[] names){
        for (int i = 1; i < array.length; i++) {
            if (array[i]>array[i-1]){
                int j = i-1;
                int m = array[i];
                String min = names[i];
                while (j>-1 && m>array[j]){
                    array[j+1] = array[j];
                    names[j+1] = names[j];
                    j--;
                }
                array[j+1] = m;
                names[j+1] = min;
            }
        }
    }
}
