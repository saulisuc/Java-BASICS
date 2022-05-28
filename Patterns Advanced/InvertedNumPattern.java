package patterns2;
import java.util.Scanner;
public class InvertedNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 0;
	        int j;
	        while(i<n){
	            j=0;
	            while(j<n-i){
	                System.out.print(n-i);
	                j+=1;
	            }
	            System.out.println();
	            i+=1;
	        }

	}

}
