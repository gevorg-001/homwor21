package com.company;


import java.util.Scanner;

public class homework27 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double radeus = 5;
        System.out.println("""
                ------------MENU-----------
                -- enter 1 for calculating area of the circle
                -- enter 2 for calculating perimeter of the circle
                -- enter 3 for exit.""");

        int number = scanner.nextInt();

        switch (number){
            case 1:
               double area = Math.pow(radeus,2) * Math.PI;
                System.out.println(area);
               break;
            case 2:
                double perimeter = 2 * Math.PI * radeus;
                System.out.println(perimeter);
                break;
            case 3:
                System.out.println(Math.pow(radeus,2) * Math.PI);
                System.out.println(2 * Math.PI * radeus);
                break;
        }



    }
}
