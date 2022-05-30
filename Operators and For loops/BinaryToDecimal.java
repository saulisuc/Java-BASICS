package Operators;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int summ = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n % 10;
            if(lastDigit == 0){
                summ+=0;
                n = n/10;
                c+=1;
            }
            else{
                summ+= (int)Math.pow(2, c);
                n = n/10;
                c+=1;
                    
                
            }
        }
        System.out.println(summ);

	}

}
