package patterns2;
import java.util.Scanner;
public class MirrorImageNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 0;
	        int j;
	        int k;
	        int c;
	        while(i<n){
	            j=1;
	            while(j<n-i){
	                System.out.print(" ");
	                j+=1;
	            }
	            k=0;
	            c=1;
	            while(k<=i){
	                System.out.print(c);
	                k+=1;
	                c+=1;
	            }
	            System.out.println();
	            i+=1;
	        }

	}

}
