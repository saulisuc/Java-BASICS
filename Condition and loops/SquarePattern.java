package squarepattern;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                System.out.print(n);
                j+=1;
            }
            System.out.println("\n");
            i+=1;
        }

	}

}
