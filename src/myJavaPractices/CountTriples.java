package myJavaPractices;

import java.util.Scanner;

public class CountTriples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

            int count = 0;

      //0 1 2 3 4 5 6 7 8 9 10 11
     // x x x a b y y y y c  d c
        for (int i = 0; i < str.length(); i++) {    //     i0=x  i1=x   i2=x    i3=a  i4=b i5= y   i6=y .. i7=y   i8=y
                int temCounter=1;
                for (int j = i+1; j <str.length(); j++) {//j1=x  j2=x   j3=a    j4=b  j5=y  j6=y   j7=y .. j8=y  j9=c
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                } else {
                    temCounter++;  // 2,3// 2,3
                }
                if (temCounter == 3) {
                  count++; //  1,2
                    break;
                }
            }

        }
        System.out.println(count);

        }
    }



/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
Example:

input: java

output: 0

 */