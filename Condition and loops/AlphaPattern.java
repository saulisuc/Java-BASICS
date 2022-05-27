package squarepattern;
import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            char c = (char)(65 + i);
            while(j<=i){
                System.out.print(c);
                j+=1;
            }
            System.out.println();
            i+=1;
        }	

	}

}
