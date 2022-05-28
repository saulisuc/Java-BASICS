package patterns2;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j,k,c;
        while(i<n){
            j=1;
            while(j<n-i){
                System.out.print(" ");
                j+=1;
            }
            k=0;
            while(k<=i){
                System.out.print("*");
                k+=1;
            }
            c=0;
            while(c<i){
                System.out.print("*");
                c+=1;
            }
            System.out.println();
            i+=1;
        }

	}

}
