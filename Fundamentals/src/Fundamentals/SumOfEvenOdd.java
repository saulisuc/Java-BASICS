package Fundamentals;
import java.util.Scanner;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int sumEven=0;
        int sumOdd=0;
        while(n>0){
            r = n % 10;
            if (r%2==0){
                sumEven+=r;
            }
            else{
                sumOdd+=r;
            }
            n = (int)(n/10);
        }
        System.out.println(sumEven + " " + sumOdd);

	}

}
