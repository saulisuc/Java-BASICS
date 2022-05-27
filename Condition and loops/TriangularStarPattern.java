package squarepattern;
import java.util.Scanner;
public class TriangularStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 0;
            while(j<i){
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            i+=1;
        }

	}

}
