package strings;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch = {'D','J', 'K'};
		char k = 'B';
		
		int ascii = k;
		
		for(int i=0; i<ch.length; i++) {
			int ascii2 = ch[i];
			
			if(ascii<ascii2) {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
