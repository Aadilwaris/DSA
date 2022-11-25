class Solution {
    public int missingNumber(int[] a) {
        int n = a.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int e:a){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int i=0;i<=n;i++){
            if(!map.containsKey(i)) return i;
        }
        return -1;
    }
}
