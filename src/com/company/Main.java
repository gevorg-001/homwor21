package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number");
        int number = scanner.nextInt();


        switch (number / 30) {
            case 0:
                System.out.println("gtnvum e minchev 30");
                break;
            case 1:
                System.out.println("gtnvum e  30 ic michev 60");
                break;
            case 2:
                System.out.println("gtnvum e 60 ic 90 um");
            default:
                System.out.println("gtnvum e 90 ic  mec");
        }


    }
}
