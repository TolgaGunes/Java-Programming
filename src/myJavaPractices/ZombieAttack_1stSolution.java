package myJavaPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack_1stSolution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        int[] inhabitantsZero = new int[inhabitants.length];
        boolean[]flag = new boolean[inhabitants.length];
        int day = 0;
        do {
            System.out.println("Day " + day + " "+Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                if (i == 0) {
                    if (inhabitants[i] != 0) {
                        if (inhabitants[i + 1] == 0) {
                            flag[i]=true;
                        }
                    }
                } else if (i == inhabitants.length - 1) {
                    if (inhabitants[i] != 0) {
                        if (inhabitants[i - 1] == 0) {
                            flag[i]=true;
                        }
                    }
                } else {
                    if (inhabitants[i] != 0) {
                        if (inhabitants[i+1]==0||inhabitants[i-1]==0) {
                            flag[i]=true;
                        }
                    }
                }
            }
            for (int i = 0; i < inhabitants.length; i++) {
                if (flag[i]==true) {
                    inhabitants[i]=inhabitants[i]/2;
                }
            }
            day++;
        } while (!Arrays.equals(inhabitants, inhabitantsZero));

        System.out.println("Day " + day + " "+ Arrays.toString(inhabitants)+"\n---- EXTINCT ----");

    }


}
