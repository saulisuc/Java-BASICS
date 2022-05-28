package patterns2;
import java.util.Scanner;
public class ParallogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int j,k;
        while(i<n){
            j=0;
            while(j<i){
                System.out.print(" ");
                j+=1;
            }
            k=1;
            while(k<=n){
                System.out.print("*");
                k+=1;
            }
            System.out.println();
            i+=1;
        }


	}

}
