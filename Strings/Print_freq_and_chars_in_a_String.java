public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String s = "QQQQQQQQQQTTTTTTTTTT";
		int count = 1;
		String ans = "";
		for(int i=0;i<s.length()-1;i++){
		    if(s.charAt(i)==s.charAt(i+1) && count!=9) count++;
		    else {
		            ans = ans+""+count+s.charAt(i);
		            count=1;
		    }
		}ans += ""+count+s.charAt(s.length()-1);
		System.out.print(ans);
	}
}
