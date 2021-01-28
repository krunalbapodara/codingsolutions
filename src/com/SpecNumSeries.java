package com;

/*** print series of special numbers with difference of 1 in all digits
 * 1, 10, 12, 21, 23, 32, 34, ..... , 121, 123, 210, 212, 232, 234
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecNumSeries {
	
	static List<Integer> arr = new ArrayList<Integer>();
    
    static void printSeries(int num){
        if(num < 100){
            int lastDigit = num % 10;
            if(lastDigit != 0){
                int prevNum = num * 10 + (lastDigit - 1);
                arr.add(prevNum);
                printSeries(prevNum);
            }
            if(lastDigit != 9){
                int nextNum = num * 10 + (lastDigit + 1);
                arr.add(nextNum);
                printSeries(nextNum);
            }
        }
    }

	public static void main(String[] args) {
		int n = 1;
	    while (n < 10) {
	        printSeries(n);
	        n++;
	    }
	    Collections.sort(arr);
	    System.out.print(arr);
    }
}
