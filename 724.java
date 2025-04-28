import java.util.Arrays;

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int result = -1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        int[] suffix = new int[n];
        suffix[n-1] = 0;
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i + 1];
        }
        System.out.println(Arrays.toString(suffix));
        for (int i = 0; i < n; i++){
            if(prefix[i] == suffix[i]){
                return i;
            }
        }
        return result;
    }
}

//#2
// class Solution {
//     public int pivotIndex(int[] nums) {
//         int total = 0;
//         for (int num : nums) {
//             total += num;
//         }
        
//         int leftSum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (leftSum == total - leftSum - nums[i]) {
//                 return i;
//             }
//             leftSum += nums[i];
//         }
        
//         return -1;
//     }
// }