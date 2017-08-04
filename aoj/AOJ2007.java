import java.util.Scanner;

public class AOJ2007 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;){
			int pay = s.nextInt();
			if(pay==0){
				break;
			}
			int y10 = s.nextInt()*10;
			int y50 = s.nextInt()*50;
			int y100 = s.nextInt()*100;
			int y500 = s.nextInt()*500;
			
			int mony = y10+y50+y100+y500;
			int change = mony-pay;
			int c = mony - change;
			
			int [] result = new int[4];
			while(c>0){
				if(c>=500 && y500!=0){
					result[3]++;
					c-=500;
					y500-=500;
				}else if(c>=100 && y100!=0){
					result[2]++;
					c-=100;
					y100-=100;
				}else if(c>=50 && y50!=0){
					result[1]++;
					c-=50;
					y50-=50;
				}else{
					result[0]++;
					c-=10;
					y10-=10;
				}
			}
			
			if(result[0]!=0){
				System.out.println("10 "+result[0]);
			}
			if(result[1]!=0){
				System.out.println("50 "+result[1]);
			}
			if(result[2]!=0){
				System.out.println("100 "+result[2]);
			}
			if(result[3]!=0){
				System.out.println("500 "+result[3]);
			}
			System.out.println();
		}
	}
}