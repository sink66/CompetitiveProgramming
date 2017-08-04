import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solveB();
	}
	
	static void sovleA() {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		int K = s.nextInt();
		int S = s.nextInt();
		int T = s.nextInt();
		
		int child = A*S;
		int adult = B*T;
		
		int result = 0;
		
		if(S+T >= K){
			result = child + adult - ((S+T)*C);
		}else{
			result = child + adult;
		}
		
		System.out.println(result);
	}
	
	static void solveB(){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int T = s.nextInt();
		
		int result = 0;
		
		int currentTime = 0;
		int oldTime = 0;
		for(int i=0; i<N; i++){
			currentTime = s.nextInt();
			if(currentTime-oldTime > T || oldTime==0){
				result+=T;
			}else{
				result += currentTime-oldTime;
			}
			oldTime = currentTime;
		}
		System.out.println(result);
	}
}
