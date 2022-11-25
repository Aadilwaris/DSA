class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        int n =s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
                arr.remove(arr.size()-1);
            } 
            else if(ch == '(' || ch == ')'){
                st.push(ch);
                arr.add(i);
            }
            
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        String sb = "";
        for(int i=0;i<n;i++){
            if(!arr.contains(i)) sb+=s.charAt(i);
        }
        return sb;
    }
}
