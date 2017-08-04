package paiza;

import java.util.Scanner;

public class Mission1 {
    public void solve() throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int result = 0;
    	for(int i=0; i<N; i++){
        	result += s.nextInt();
        }
    	System.out.println(result);
    }
}
