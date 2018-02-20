package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		System.out.println();
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}

	private static char[] reverse(String string) {
		char[] chars=string.toCharArray();
		
		for(int i=0; i<chars.length/2; i++) {
			if(i> (chars.length-1)-i)break;
			char tmp=chars[i];
			chars[i]=chars[(chars.length-1)-i];
			chars[(chars.length-1)-i]=tmp;
		}
		
		
		return chars;
	}

	public static void printCharArray(char[] source) {
		for (char c : source) {
			System.out.print(c);
		}
	}
}
