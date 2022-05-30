package Operators;
import java.util.Scanner;
public class ReverseOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // int i;
        long temp=n;
        long revNum = 0;
        long lastDigit;
        while(temp>0){
            lastDigit= temp % 10;
            temp = (temp/10);
            revNum = revNum * 10 + lastDigit;            
        }
        System.out.println(revNum);

	}

}
