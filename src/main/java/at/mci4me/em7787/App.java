package at.mci4me.em7787;

import java.util.Scanner;


public class App {
    public static int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Enter first value");
        int x = myObj.nextInt();
        System.out.println("Enter second value");
        int y = myObj.nextInt();

        int summe = sum(x,y);
        System.out.println("The sum is: " +summe);
        myObj.close();
    }
}
