import java.util.Scanner;

public class AOJ0136 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		double[] result = new double[6];
		
		for(int i=0; i<n; i++){
			double tmp = s.nextDouble();
			if(tmp<165.0){
				result[0]++;
			}else if(tmp<170.0){
				result[1]++;
			}else if(tmp<175.0){
				result[2]++;
			}else if(tmp<180.0){
				result[3]++;
			}else if(tmp<185.0){
				result[4]++;
			}else{
				result[5]++;
			}
		}
		
		for(int i=0; i<6; i++){
			System.out.print((i+1)+":");
			for(int j=0; j<result[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
