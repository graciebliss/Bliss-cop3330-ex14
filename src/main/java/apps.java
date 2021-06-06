/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");

        String order=in.nextLine();

        System.out.print("What is the state? ");

        String state=in.nextLine();

        double subtotal=Double.parseDouble(order);

        double tax=.055;

        double total=subtotal;

        if(state.equals("WI")){
            double actualTax=subtotal*tax;
            actualTax=Math.round(actualTax*100.0)/100.0;
            total+=(subtotal*tax);
            System.out.println("The subtotal is $"+String.format("%.2f",subtotal)+".\nThe tax is $"+String.format("%.2f",actualTax)+".");
        }

        total=Math.round(total*100.0)/100.0;
        System.out.print("The total is $"+String.format("%.2f",total)+".");
    }
}
