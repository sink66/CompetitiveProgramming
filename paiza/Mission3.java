package paiza;

import java.util.Scanner;

public class Mission3{
    public void solve() throws Exception {
        Scanner s = new Scanner(System.in);
        int result = 0;
    	int sum = 0;
        int t = s.nextInt();
    	int n = s.nextInt();
        int[] m = new int[n];
    	for(int i=0; i<m.length; i++){
    		m[i] = s.nextInt();
    	}
    	for(int i=0; i<t; i++){
    		sum+=m[i];
    	}
    	result = sum;
        for(int i=t;i<n;i++){
            sum-=m[i-t];
            sum+=m[i];

            result = Math.max(result, sum);
        }
    	System.out.println(result);
    }
}
