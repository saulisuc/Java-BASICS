
package Fundamentals;
import java.util.Scanner;
public class AverageOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int avg = (int)(m1 + m2 + m3)/3;
        System.out.println(name);
        System.out.println(avg);

	}

}
