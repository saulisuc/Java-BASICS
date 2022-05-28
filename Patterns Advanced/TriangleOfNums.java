package patterns2;
import java.util.Scanner;
public class TriangleOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j,k,c,l,p;
        while(i<n){
            j=1;
            while(j<n-i){
                System.out.print(" ");
                j+=1;
            }
            k=0;
            l=i+1;
            while(k<=i){
                System.out.print(l);
                l+=1;
                k+=1;
            }
            p=l-2;
            c=0;
            while(c<i){
                System.out.print(p);
                p-=1;
                c+=1;
            }
            System.out.println();
            i+=1;
        }

	}

}
