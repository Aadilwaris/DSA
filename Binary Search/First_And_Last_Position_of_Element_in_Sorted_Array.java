class Solution {
    public int[] searchRange(int[] a, int t) {
        int n=a.length;
        int l=0,r=n-1;
        int arr[]={-1,-1};
        if(n==1 && t==a[0]){
            arr[0]=0;
            arr[1]=0;
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==t) {
               arr[0]=mid;
               r=mid-1;
            }
            else if(t<a[mid]) r=mid-1;
            else l=mid+1;
        }
        l=0;
        r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==t){
                arr[1]=mid;
                l=mid+1;
            }
            else if(a[mid]<t) l=mid+1;
            else r=mid-1;
        }
        return arr;
    }
}
