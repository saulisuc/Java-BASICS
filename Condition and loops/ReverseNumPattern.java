package squarepattern;
import java.util.Scanner;
public class ReverseNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 0;
            int c = i;
            while(j<i){
                System.out.print(c);
                c-=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }	

	}

}
