package Operators;
import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int revNum = 0;
        int lastDigit = 0;
        while(temp>0){
            lastDigit = temp % 10;
            temp = temp/10;
            revNum = revNum * 10 + lastDigit;
        }
        if (revNum == n){
            System.out.println(true);
            
        }
        else{
            System.out.println(false);
        }

	}

}
