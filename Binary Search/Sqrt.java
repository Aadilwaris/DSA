class Solution {
    public int mySqrt(int n) {
        if(n==0||n==1) return n;
                long l=1;
                long r=n/2;
                long ans=0;
                while(l<=r){
                        long mid=l+(r-l)/2;
                        if(mid*mid==n) return (int)mid;
                        if(mid*mid<n) {
                                ans=mid;
                                l=mid+1;
                        }
                        else{
                                r=mid-1;
                        }
                }
        return (int)ans;
    }
}
