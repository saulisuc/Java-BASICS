package Fundamentals;
import java.util.Scanner;
public class FarhenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int i = S;
        while(i<=E){
            int c = (int)((5.0/9) *(i - 32));
            System.out.println(i + " " + c);
            i = i + W;
        }

	}

}
