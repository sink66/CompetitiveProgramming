package paiza;

import java.util.Scanner;

public class Mission2 {
    public void solve() throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int result = 0;
    	for(int i=0; i<N; i++){
        	int T = s.nextInt();
        	int S = s.nextInt();
        	int P = s.nextInt();
        	if(!(T<=S)){
        		result += (T-S)*P;
        	}
        }
    	System.out.println(result);
    }
}
