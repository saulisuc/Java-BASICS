package Operators;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        if(n==0){
            System.out.println(0);
            return;
        }
        while(i<=(n/2)){
            if(i*i == n){
                System.out.println(i);
                break;
            }
            else if(i*i < n){
                i+=1;
            }
            else{
                System.out.println(i - 1);
                break;
            }
        }

	}

}
