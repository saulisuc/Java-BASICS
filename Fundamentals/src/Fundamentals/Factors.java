package Fundamentals;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<=(n-1)){
            if(n % i == 0){
                System.out.print(i + " ");
                i+=1;
            }
            else{
                i+=1;
            }
        }

	}

}
