package Operators;
import java.util.Scanner;
public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int summ = 0;
        int i = 3;
        if(n<3){
            System.out.println(1);
            return;
        }
        while(i<=n){
            summ=a+b;
            a=b;
            b=summ;
            i++;
            
                
        }
        System.out.println(summ);

	}

}
