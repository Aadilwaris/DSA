class Solution {
    public int countNegatives(int[][] a) {
        //int l=0;
        int n=a.length;
        int m=a[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            int l=0;
            int r = a[i].length-1;
            int temp=-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(a[i][mid]<0) {
                    temp=mid;
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
                //System.out.print(count);  
            }
            if(temp!=-1) count=count+(m-temp);
            
        }
        return count;
    }
}
