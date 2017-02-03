/**
 * Created by Guillaume Gingembre on 03/02/2017.
 */

import java.util.Random; // to populate the array with random numbers
import java.util.Arrays; // to print array

public class Module2_Homework1 {
    public static void main(String[] args) {

        int [ ]  myArray = new int [10];   // instantiate the array, size 10, type int
        Random rand = new Random(); // initiate the random method
        int i; // index for array
        int n; // random number, type int to keep the product smaller
        int mySum, myMin, myMax, myMaxPos, myModulus, mySecondLargest; // computed values from array
        double myProduct; // double as value can get high

        for (i = 0; i < 10; i++ ) {
            n = rand.nextInt(100) -49; // generate random number of type int, positive or negative
            myArray[ i ] = n; // fill the array
        }

        System.out.println(Arrays.toString(myArray)); // print array

        mySum = sum(myArray);   // invoke method to find sum
        System.out.println("The sum is " +mySum + ".");

        myMin = min(myArray); // invoke method to find min
        System.out.println("The min is " +myMin + ".");

        myMax = max(myArray); // invoke method to find max
        System.out.println("The max is " +myMax + ".");

        myMaxPos = maxPositive(myArray); // invoke method to find max positive and return error if no positive
        if (myMaxPos > 0) {
            System.out.println("The max positive is " +myMaxPos + ".");
        } else {
            System.out.println("There is no positive number in this random array. Try again");
        }

        myProduct = multiplication(myArray); // invoke method to find product
        System.out.println("The product is " +myProduct + ".");

        myModulus = modulus(myArray); // invoke method to find product
        System.out.println("The modulus of the first and last elements is " +myModulus + ".");

        mySecondLargest = secondLargest(myArray); // invoke method to find product
        System.out.println("The second largest elements is " +mySecondLargest + ".");

        System.out.println("First Assignment of Module 2 done, thank you for your attention!");

    }

    public static int  sum(int [ ] value)  //method definition to find sum
    {
        int i, total = 0;
        for(i=0; i<10; i++)
        {
            total += value[ i ];
        }

        return (total);
    }

    public static int  min(int [ ] value)  //method definition to find sum
    {
        int i, total;
        total = value [0];
        for(i=0; i<10; i++)
        {
            if (value [i] < total) {total = value[ i ];}
        }

        return (total);
    }

    public static int  max(int [ ] value)  //method definition to find sum
    {
        int i, total;
        total = value [0];
        for(i=0; i<10; i++)
        {
            if (value [i] > total) {total = value[ i ];}
        }

        return (total);
    }

    public static int  maxPositive(int [ ] value)  //method definition to find sum
    {
        int i, total;
        total = value [0];
        for(i=0; i<10; i++)
        {
            if (value [i] > total && value[i] > 0) {total = value[ i ];}
        }

        return (total);
    }

    public static double  multiplication(int [ ] value)  //method definition to find sum
    {
        int i;
        double total;
        total = 1;
        for(i=0; i<10; i++)
        {
            total *= value [i];
        }
        return (total);
    }

    public static int  modulus(int [ ] value)  //method definition to find sum
    {
        int i, j, total;
        i = value [0];
        j = value [9];
        total = i%j;

        return (total);
    }

    public static int secondLargest(int [ ] value)  //method definition to find second largest
    {
        int i, total, largest;
        total = value [0];
        largest = value[0];
        for(i=0; i<10; i++)
        {
            if (value [i] > largest) {
                total = largest;
                largest = value[ i ];
            } else if (value[i] > total) {
                total = value[i];
        }
        }
        return (total);
    }

}



