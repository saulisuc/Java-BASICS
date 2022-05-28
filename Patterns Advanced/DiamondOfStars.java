package patterns2;
import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j,c,k,s,x;
        int n1 = (int)((n/2) + 1);
        int n2 = n - n1;
        while(i<n1){
            j = 1;
            while(j<n1-i){
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
        i=n2;
        while(i>=1){
            s=1;
            while(s<=n2-i+1){
                System.out.print(" ");
                s+=1;
            }
            j=1;
            x=(2*i) - 1;
            while(j<=x){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i-=1;
        }

	}

}
