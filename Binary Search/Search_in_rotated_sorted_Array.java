class Solution {
    public int search(int[] a, int k) {
        int l=0;
        int r = a.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==k) return mid;
            if(a[l]<=a[mid]){
                if(k>=a[l]&&k<=a[mid]) r=mid;
                else l=mid+1;
            }else{
                if(k>=a[mid]&&k<=a[r]) l=mid+1;
                else r=mid;
            }
        }
        return -1;
    }
}
