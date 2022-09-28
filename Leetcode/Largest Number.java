class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String ans = "";
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                String s1 = s[j]+s[j+1];
                String s2 = s[j+1]+s[j];
                if(s1.compareTo(s2)<1){
                    String str = s[j];
                    s[j]=s[j+1];
                    s[j+1]=str;
                }
            }
        }
        if(s[0].equals("0")) return "0";
        for(int i=0;i<n;i++){
           ans+=s[i]; 
        }
        return ans;
    }
}
