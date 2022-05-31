package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.print("Bir kundu beriniz: ");
        Scanner kundor = new Scanner(System.in);
        String kundorInput = kundor.nextLine();

        switch (Kundor.valueOf(kundorInput.toUpperCase(Locale.ROOT))) {
            case DUISHOMBU -> System.out.println("Tehnicheskyi sabak bolot! ");
            case SHEYSHEMBI -> System.out.println("Practicalyk sabak. ");
            case SHARSHEMBI -> System.out.println("Tehnicale lession! ");
            case BEISHENBI -> System.out.println("Soft Skils ");
            case JUMA -> System.out.println("Teorya okuim! ");
            case ISHEMBI -> System.out.println("Exstra session ");
            case JEKSHEMBI -> System.out.println("Vyhodnoi! ");
            default -> System.out.println("Mynday kun jok! ");

        }
    }
}
