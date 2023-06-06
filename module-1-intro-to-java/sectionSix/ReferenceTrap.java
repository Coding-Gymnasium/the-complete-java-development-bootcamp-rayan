package sectionSix;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYearBad = staffLastYear;

        System.out.println(staffLastYear + " - original array: " + Arrays.toString(staffLastYear));
        System.out.println(staffThisYearBad + " - 'new array':  " + Arrays.toString(staffThisYearBad));
        staffThisYearBad[1] = "Abby";

        System.out.println(staffLastYear + " - original array: " + Arrays.toString(staffLastYear)); // original array
        // gets modified because the 'new' array is just a reference to the original and NOT a new one.
        System.out.println(staffThisYearBad + " - 'new array':  " + Arrays.toString(staffThisYearBad));

        // To avoid this pitfall, we have to create a new array.
        System.out.println("\nBetter Way using Arrays.copyOf: ");

        String[] staffLastYear2 = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYearGood = Arrays.copyOf(staffLastYear2,staffLastYear2.length);

        System.out.println(staffLastYear2 + " - original array: " + Arrays.toString(staffLastYear2));
        System.out.println(staffThisYearGood + " - new array:  " + Arrays.toString(staffThisYearGood));

        System.out.println("\n Change element at index one");
        staffThisYearGood[1] = "Abby";

        System.out.println(staffLastYear2 + " - original array: " + Arrays.toString(staffLastYear2));
        System.out.println(staffThisYearGood + " - new array:  " + Arrays.toString(staffThisYearGood));

    }
}