package Operators;
import java.util.Scanner;
public class CheckNumSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        boolean check=true;
        int i;
        for (i=0;i<n-1;i++)
        {
            if (arr[i]<=arr[i+1])
            {
                break;
            }
        }        
            for (int j=i;j<n-1;j++)
        	{
            	if (arr[j]>=arr[j+1])
            	{
                	check=false;
                	break;
            	}
        	}
        System.out.println(check);  

	}

}
