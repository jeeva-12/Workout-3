// Java program to find all substrings of a string.

import java.util.Scanner;

public class substring {
    public static void main(String a[]) {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        //Nested loop to iterate between the strings
        for(int i=0; i<stringValue.length(); i++) {
            String subStr = "";
            for(int j=i; j< stringValue.length(); j++) {
                subStr = subStr + stringValue.charAt(j);
                System.out.println(subStr + "\n");
            }
        }
    }
}