package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        int n = inp.nextInt();

        System.out.println();

        int saveN = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * saveN) - 1; k++) {
                System.out.print("*");
            }
            saveN -= 1;
            System.out.println();
        }
    }
}
