import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,7,7,7,7,8,8,10};
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目标值：");
        int target = scan.nextInt();
        int i = left_bound(array,target);
        int flat = 0;
        while (i < array.length){
            if (array[i]==target){
                flat++;
            }
            i++;
        }
        System.out.println("出现了"+flat+"次");
    }

    public static void count(int[] array,int left,int right){
        int mid = left + (right - left)/2;
    }
    public static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 搜索区间为 [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 搜索区间变为 [mid+1, right]
                left = mid + 1;
            } else if (nums[mid] > target) {
                // 搜索区间变为 [left, mid-1]
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 收缩右侧边界
                right = mid - 1;
            }
        }
        // 判断 target 是否存在于 nums 中
        // 如果越界，target 肯定不存在，返回 -1
        if (left < 0 || left >= nums.length) {
            return -1;
        }
        // 判断一下 nums[left] 是不是 target
        return nums[left] == target ? left : -1;
    }
}
