class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum;
        int rightSum;
        int pivot=-1;
        for(int i=0;i<nums.length;i++){
            leftSum=0;
            rightSum=0;
            for(int j=0;j<i;j++){
                leftSum=leftSum+nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rightSum=rightSum+nums[j];
            }
            if(leftSum==rightSum) {
                pivot=i;
                break;
            }
        }return pivot;
        
    }
}
