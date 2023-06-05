package sectionSix;

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Esspresso", "Ice Coffee", "Macchiato"};
        System.out.println("Original menu: " + Arrays.toString(menu));
        menu[2] = "Latte";
        System.out.println("New menu: " + Arrays.toString(menu));

        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length ; i++) {
           newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));

    }
}