package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("cosie");

        for (int i = 1; i <11 ; i++) {
            System.out.println(i);
        }
        System.out.println("podaj imie: ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();
        System.out.println("Twoje imie to: " + imie);
    }
}
