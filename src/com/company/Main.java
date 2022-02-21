package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random dice = new Random();
        int number;
        boolean hy = true;
        while (hy == true) ;
        {

            for (int counter = 1; counter <= 10; counter++) {
                number = 1 + dice.nextInt(10);
                System.out.println(number + " ");
            }

            {
                if (number == 7) ;
                hy = false;

            }
        }
    }
}
