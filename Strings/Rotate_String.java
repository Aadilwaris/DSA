class Solution {
    public boolean rotateString(String s, String goal) {
        String temp = goal+goal;
        if(s.length()!=goal.length()) return false;
        return temp.contains(s);
    }
}
