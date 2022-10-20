class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int n=a.length;
        int l=1,r=n-1;
        int peak=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]>a[mid+1]){
                r=mid-1;
                if(a[peak]<a[mid]) peak = mid;
            }else {
                l=l+1;
            }
        }return peak;
    }
}
