public class Recursion_DoubleElementsArray {

    public static void main(String []args) {
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9,11};
        doubleTheElements(nums);

    }

    public static void doubleTheElements(int[] nums) {
        doubleTheElementsHelper(nums,0);
    }

    private static void doubleTheElementsHelper(int[] nums, int index) {
        if (index >= nums.length) {
            return;
        } else {
            //nums[index] = nums[index] * 2;
            //System.out.println(nums[index]);
            System.out.println(nums[index]*2);
            doubleTheElementsHelper(nums,index+1);

        }
    }
}
