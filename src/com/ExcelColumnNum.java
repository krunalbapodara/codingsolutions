package com;

/***
 * Program for return excel column number from column name and vice versa
 * e.g., A - 1, B - 2, Z - 26, AA - 27,...
 * 1 - A, 28 - AB,...
 */
import java.util.Scanner;

public class ExcelColumnNum {
	static int giveNumber(String name) {
        name = name.toUpperCase();
        int result = 0;
        for (int index = 0; index < name.length(); index++) {
            result *= 26;
            result += (int)name.charAt(index) - 'A' + 1;
        }
        return result;
    }

    static String giveName(int number) {
        String str = "";
        while (number > 0) {
            int reminder = number % 26;
            if (reminder == 0) {
                str += 'Z';
                number = (number / 26) - 1;
            } else {
                str += (char)((reminder - 1) + 'A');
                number = (number / 26);
            }
        }
        return str;
    }
    
    public static void main(String[] args) {	
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter column name : ");
    	String cname = s.next();
    	System.out.println("Number is " + giveNumber(cname));
    	System.out.println("Enter column number ");
    	int cnum = s.nextInt();
    	System.out.println("Name is " + giveName(cnum));
    	s.close();
	}

}
