// 12S24008 - Rospika Sarah Yosefin Siregar
// 12S24013 - Adryan Julianto Panjaitan

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, hargasementara, hargaterkecil, totalharga;

        hargaterkecil = 100;
        hargabuku = 0;
        hargasementara = 0;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                if (hargaterkecil < hargabuku) {
                } else {
                    hargaterkecil = hargabuku;
                }
                hargasementara = hargabuku + hargasementara;
            }
        } while (hargabuku != 0);
        if (hargasementara >= 100) {
            totalharga = hargasementara - hargaterkecil;
        } else {
            totalharga = hargasementara;
        }
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
