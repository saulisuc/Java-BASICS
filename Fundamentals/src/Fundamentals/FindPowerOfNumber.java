package Fundamentals;
import java.util.Scanner;
public class FindPowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res;
        res = (int)Math.pow(x,n);
        System.out.println(res);

	}

}
