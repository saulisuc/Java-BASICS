package patterns2;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int j,k,l;
        int c=0;
        while(i<=n){
            j=1;
            c=(2*i)-1;
            l=1;
                
            while(j<=n-i+1){
                System.out.print(c);
                c+=2;
                j+=1;
            }
            k=1;
            while(k<=i-1){
                System.out.print(l);
                l+=2;
                k+=1;
            }
            System.out.println();
            i+=1;
        }

	}

}
