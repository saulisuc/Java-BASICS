package functions;
import java.util.Scanner;
public class Fibonacci {
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
        int a=0;
        int b = 1;
        int c;
        while(a<n){
            c=a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;
        }
        else{
            return false;
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println(Fibonacci.checkMember(n));
		}

	}

