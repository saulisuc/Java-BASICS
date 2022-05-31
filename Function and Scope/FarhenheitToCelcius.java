package functions;
import java.util.Scanner;
public class FarhenheitToCelcius {
	public static void printFahrenheitTable(int start, int end, int step) {
		// TODO Auto-generated method stub
				int c = start;
		        while(c<=end){
		            int f = (int)((5.0/9)*(c - 32));
		            System.out.println(c + "\t" + f);
		            c+=step;
		        }
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		FarhenheitToCelcius.printFahrenheitTable(start, end, step);

	}

}
