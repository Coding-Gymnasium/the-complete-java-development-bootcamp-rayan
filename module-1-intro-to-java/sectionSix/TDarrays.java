package sectionSix;

import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
//        int[][] grades = new int[3][4];
        int[][] grades = {{72, 74, 79, 76}, {65, 64, 61, 67}, {95, 98, 99, 100}};
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("\tHarry: ");
                    break;
                case 1:
                    System.out.print("\tRon: ");
                    break;
                case 2:
                    System.out.print("\tHermione: ");
                    break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");
        }

        // using for each
        for (int[] grade : grades) {
            for (int i : grade) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
}