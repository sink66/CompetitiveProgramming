import java.util.LinkedList;
import java.util.Scanner;

public class AOJ0087 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			LinkedList<String> input = new LinkedList<String>();
			String[] in = s.nextLine().split("\\s");
			for (int i = 0; i < in.length; i++) {
				if ("+".equals(in[i])) {
					Double right = Double.parseDouble(input.pop());
					Double left = Double.parseDouble(input.pop());
					input.push(left + right + "");
				} else if ("-".equals(in[i])) {
					Double right = Double.parseDouble(input.pop());
					Double left = Double.parseDouble(input.pop());
					input.push(left - right + "");
				} else if ("*".equals(in[i])) {
					Double right = Double.parseDouble(input.pop());
					Double left = Double.parseDouble(input.pop());
					input.push(left * right + "");
				} else if ("/".equals(in[i])) {
					Double right = Double.parseDouble(input.pop());
					Double left = Double.parseDouble(input.pop());
					input.push(left / right + "");
				} else {
					input.push(in[i]);
				}
			}
			System.out.println(input.pop());
		}
	}
}
