package Operators;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int summ=0;
        int prod=1;
        if(c>2){
            System.out.println(-1);
            return;
        }
        else if(c==1){
                for(int i = 1;i<=n;i++){
                    summ+=i;
                    
                }
            System.out.println(summ);
            }
            else if(c==2){
                for(int i = 1;i<=n;i++){
                    prod*=i;
                    
                }
                System.out.println(prod);
            }

	}

}
