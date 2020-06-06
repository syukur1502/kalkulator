package com.bootcamp.assesmentFinal;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        int nr; //nominator result
        int dr; //denomitor result
        System.out.println("THIS IS CALCULATOR PROGRAM");
        System.out.println("Enter the operation +, -,/,* or q to quit");
        Scanner read = new Scanner(System.in);
        String opr = read.next();
        System.out.println("Enter first fraction");
        String fract1 = read.next();
        String[] number1 = fract1.split("/");
        int n1 = Integer.parseInt(number1[0]);
        int d1 = Integer.parseInt(number1[1]);
        System.out.println("Enter second fraction");
        String fract2 = read.next();
        String[] number2 = fract2.split("/");
        int n2 = Integer.parseInt(number1[0]);
        int d2 = Integer.parseInt(number1[1]);
        switch (opr) {
            case "+":
                nr = n1 * d2 + n2 * d1;
                dr = d1 * d2;
                System.out.println(n1+"/"+d1 +" " +"  + " +" "+n2+"/"+d2+ " = "+nr + "/"+dr);
                break;
            case "*":
                nr = n1 * n2;
                dr = d1 * d2;
                System.out.println(n1+"/"+d1 +" " +"*" +" "+n2+"/"+d2+ " = "+nr + "/"+dr);
                break;
            case "-":
                nr = n1 * d2 + n2 * d1;
                dr = d1 * d2;
                System.out.println(n1+"/"+d1 +" " +" -" +" "+n2+"/"+d2+ " = "+nr + "/"+dr);
                break;
            case "/":
                nr = n1 * d2;
                dr = d1 * n2;
                System.out.println(n1+"/"+d1 +" " +"/" +" "+n2+"/"+d2+ " = "+nr + "/"+dr);
                break;
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("You must input the operator");
                break;
        }

    }
}
