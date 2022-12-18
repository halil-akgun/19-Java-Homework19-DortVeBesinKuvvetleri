package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=input.nextInt();

        System.out.println("dördün kuvvetleri:");
        for(int i=4;i<=num; i*=4){
                System.out.print(i + ", ");
        }
        System.out.println("\n");
        System.out.println("beşin kuvvetleri:");
        for(int j=5;j<=num;j*=5){
                System.out.print(j+", ");
        }

    }
}