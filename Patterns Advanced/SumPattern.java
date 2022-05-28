package patterns2;
import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        outer_loop:for(int i=1;i<=N;i++)
        {
            int sum=1;
            if (i==1)
            {
                System.out.println("1=1");
                continue outer_loop;
            }
            else
            {
                System.out.print("1+");
            }
            
            inner:for (int j=2;j<=i;j++)
            {
                sum=sum+(j);
                System.out.print(j);
                if (j<i)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.println("="+sum);
                    break inner;
                }
            }
        }

	}

}
