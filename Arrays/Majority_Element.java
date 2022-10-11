class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int ans=0;
        Arrays.sort(nums);
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>(nums.length/2)){
                    ans=nums[i];
                }
            }else count=1;
        }
        return ans;
    }
}
