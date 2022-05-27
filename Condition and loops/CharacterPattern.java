package squarepattern;
import java.util.Scanner;
public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            int k = i;
            while(j<=i){
                char c = (char)(65 + k);
                System.out.print(c);
                k+=1;
                j+=1;
            }
            System.out.println();
            i+=1;
        }

	}

}
