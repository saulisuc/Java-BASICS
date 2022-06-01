package array;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArraySum {
	public static int sum(int[] arr) {
		//Your code goes here
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int s = 0;
        for(int i = 0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().trim().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] input = takeInput();
            System.out.println(ArraySum.sum(input));
            t -= 1;
        }
    }
}
