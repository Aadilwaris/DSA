class Solution {
    public int[] runningSum(int[] nums) {
      int sum[]=new int[nums.length];  
      int add=0;
      for(int i=0;i<nums.length;i++){
        add=add+nums[i];
        sum[i]=add;
      }
       return sum;
    }
}
