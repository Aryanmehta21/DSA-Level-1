/* 1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.*/
import java.util.*;

public class Digit_Frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
		scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
		int c=0;
        while(n>0){
			if(n%10==d)
				c++;
			n/=10;
		}
		return c;
    }
}