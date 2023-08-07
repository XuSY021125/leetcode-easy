import java.util.Arrays;

//1502.判断是否形成等差数列
public class Main {
    public static void main(String[] args) {
        int[] array=new int[]{1,7,9,5,3,11,5};
        int i;
        System.out.println("原数组为：");
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("排序后数组为：");
        System.out.println(Arrays.toString(array));
        System.out.println();
        if (AP(array)){
            System.out.println("该数组为等差数列");
        }else{
            System.out.println("该数组不是等差数列");
        }
    }
    public static void swap(int[] array,int low,int high){
        int temp;
        temp=array[low];
        array[low]=array[high];
        array[high]=temp;
    }
    public static int quick(int[] array,int low,int high){
        int k=array[low];
        while (true){
            while (low<high && array[low]<k){
                low++;
            }
            while(low<high && array[high]>k){
                high--;
            }
            if(low>=high){
                break;
            }
            else{
                swap(array,low,high);
            }
            if(array[low]==array[high]){
                low++;
            }
        }
        return low;
    }

    public static void quickSort(int[] array,int low,int high){
        if(low<high){
            int k=quick(array,low,high);
            quickSort(array,low,k-1);
            quickSort(array,k+1,high);
        }
    }
    public static boolean AP(int[] array){
        int a = array[1]-array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]-array[i-1] != a){
                return false;
            }
        }
        return true;
    }
}
