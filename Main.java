import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{-1,0,3,5,9,12};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目标值：");
        int target = scan.nextInt();
        int i = BinarySearch(array,target);
        System.out.println(i);
    }
    public static int BinarySearch(int[] array,int target){
        int left = 0,right = array.length-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (array[mid]==target){
                return mid;
            }else if (array[mid]<target){
                left = mid + 1;
            }else if (array[mid]>target){
                right = mid - 1;
            }
        }
        return -1;
    }
}