class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                char a = s.charAt(i);
                char b = t.charAt(i);
                hm1.put(a,hm1.getOrDefault(a,0)+1);
                hm2.put(b,hm2.getOrDefault(b,0)+1); 
            }
        }else return false;
        return hm1.equals(hm2);
    }
}
