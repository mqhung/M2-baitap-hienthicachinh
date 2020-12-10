package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i =1; i<=5;i++){
                        for (int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i = 1; i<=5;i++){
                        for (int j = i; j<=5;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 1;i<=5;i++){
                        for(int j = 1;j <=(5-i);j++){
                            System.out.print(" ");
                        }
                        for(int k=1; k<=i; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 1;i<=5;i++){
                        for(int j = 1;j <=(i-1);j++){
                            System.out.print(" ");
                        }
                        for(int k=i; k<=5; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nothing");
            }
        }
    }
}