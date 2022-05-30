package Operators;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int x = sc.nextInt();
        int i = 1;
        int res;
        int j = 1;
        while(i<=x){
            res= (3*j + 2);
            if(res%4 == 0){
                j+=1;
            }
            else{
                System.out.print(res + " ");
                j+=1;
                i+=1;
            }
        }
       

	}

}
