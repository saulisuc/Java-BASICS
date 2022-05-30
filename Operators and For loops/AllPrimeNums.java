package Operators;
import java.util.Scanner;
public class AllPrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean flag;
        while(i<=n){
            flag=true;
            for(int j = 2;j<i;j++){
                if (i%j == 0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
            i+=1;
        }

	}

}
