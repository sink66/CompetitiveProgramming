import java.util.Scanner;

public class AOJ2006 {
	static char[][] map = {
			{},
			{ '.', ',', '!', '?', ' ' },
			{ 'a', 'b', 'c' },
			{ 'd', 'e', 'f' },
			{ 'g', 'h', 'i' },
			{ 'j', 'k', 'l' },
			{ 'm', 'n', 'o' },
			{ 'p', 'q', 'r', 's' },
			{ 't', 'u', 'v' },
			{ 'w', 'x', 'y', 'z' }
	};
	static int cnt = 0;
	static char buttonNumber = '0';
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int run = s.nextInt();
		for(int i=0; i<run; i++){
			char[] in = s.next().toCharArray();
			for(int j=0; j<in.length; j++){
				if(in[j]=='0'){
					flush(Integer.parseInt(""+buttonNumber), cnt-1);
				}else{
					buttonNumber = in[j];
					cnt++;
				}
			}
			System.out.println();
		}
	}
	
	static void flush(int buttonNumber, int outChar){
		if(buttonNumber!=0){
			System.out.print(map[buttonNumber][outChar%map[buttonNumber].length]);
		}
		init();
	}
	
	static void init(){
		cnt = 0;
		buttonNumber = '0';
	}
	
}
