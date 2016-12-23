
public class Test {
     public String inputString(String str){
			int l=str.length();
			
			String s=new String();
			for(int i=0;i<l-1;i++){
				String s1=compareString(str,i,i);
				if(s1.length()>s.length()){
					s=s1;
				}
				
				String s2=compareString(str,i,i+1);
				if(s2.length()>s.length()){
					s=s2;
				}
			}
			return s;		
		}
		
		public String compareString(String str,int i,int j){
			int n=str.length();		
			while(i>=0&&j<=n-1&&str.charAt(i)==str.charAt(j)){
				i--;
				j++;
			}		
			return str.substring(i+1, j);		
		}
		
		public static void main(String[] args){
			Integer i = new Integer(8);
			int n =8;
			Integer j = new Integer(8);
			System.out.println(i==n);System.out.println(n==j);
		}
	}






