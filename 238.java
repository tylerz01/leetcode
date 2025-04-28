class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[3,4,5,6]
        //[120, 90, 72, 60]
        //4*5*6, 3*5*6, 3*4*6, 3*4*5
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < nums.length ; i++){
            result[i] = result[i - 1] * nums[i-1];
        }
        System.out.println(Arrays.toString(result));
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
}