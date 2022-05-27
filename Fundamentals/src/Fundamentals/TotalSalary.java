package Fundamentals;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int basic = sc.nextInt();
	        char grade = sc.next().charAt(0);
	        int allow;
	        double hra = 0.2 * basic;
	        double da = 0.5 * basic;
	        double pf = 0.11 * basic;
	        if(grade == 'A'){
	            allow = 1700;
	        }
	        else if(grade == 'B'){
	            allow = 1500;
	        }
	        else{
	            allow = 1300;
	        }
	        double totalSalary = (basic + hra + da + allow - pf);
	        int ans = (int) Math.round(totalSalary);
	        System.out.println(ans);

	}

}
