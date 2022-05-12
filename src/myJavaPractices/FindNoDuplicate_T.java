package myJavaPractices;

import java.util.*;

public class FindNoDuplicate_T {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int result = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] == nums[j])
                    counter++;
            }
            if (counter != 1)
                result = nums[i];
            else
                counter = 0;
        }
        System.out.println("result = " + result);
    }
}

/*
TASK:
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:



nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */
