package it.develhope.arraysandlists;

import java.util.Arrays;

public class Start{

    public static void main(String[] args) {

        String carBrands[] = new String[]{
                "Mercedes", "Fiat", "Audi", "Nissan", "Bmw"
        };

        System.out.println("Number of car brands: " + carBrands.length);
        System.out.println("This is the print of the third brand: " + carBrands[2]);

        int primeNumbers[] = new int[6];
        primeNumbers[0] = 56;
        primeNumbers[1] = 71;
        primeNumbers[2] = 2;
        primeNumbers[3] = 12;
        primeNumbers[4] = 4;
        primeNumbers[5] = 37;

        System.out.println("These are the Prime numbers: " + Arrays.toString(primeNumbers));





    }
}


    

        // remember that array's index start from 0, not from 1!
        

        // here we use `new` to initialise an empty array of 6 items
        

        // populating the array
        

        // we use the method toString() from java.utils.Arrays
        

