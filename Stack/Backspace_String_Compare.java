class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#') s1.push(s.charAt(i));
            else if(s1.isEmpty()==false) s1.pop();
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#') s2.push(t.charAt(i));
            else if(s2.isEmpty()==false) s2.pop();
        }
        boolean ans = false;
        if(s1.isEmpty()==true&&s2.isEmpty()==true) return true;
        if(s1.size()==s2.size()){
            for(int i=s1.size()-1;i>=0;i--){
                if(s1.peek()==s2.peek()){
                    ans=true;
                    s1.pop();
                    s2.pop();
                }else{
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
