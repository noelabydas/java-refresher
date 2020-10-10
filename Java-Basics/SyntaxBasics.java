import java.util.Scanner;

class SyntaxBasics {
    public static void main(String[] args) {
        /***** Declaring variables *****/
        int i;
        float f;
        double d;
        String s;

        /*****  Initializing variables *****/
        i = 10;
        d = 99.6;

        /*****  Initialization at declaration *****/
        float percentage = 0.85F;
        String name = "John Doe";

        /*****  Printing to console *****/
        System.out.println("Hello, world!");

        /*****  Taking user input *****/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int value");
        i = sc.nextInt();
        System.out.println("Enter a float value");
        f = sc.nextFloat();

        System.out.println("Value of i: " + i);
        System.out.println("Value of f: " + f);

        /***** Conditional statements *****/

        // if-else
        double temperature = 19.5;
        if (temperature < 15.0) {
            System.out.println("Cold");
        }
        else if (temperature < 32.0) {
            System.out.println("Moderate");
        }
        else {
            System.out.println("Hot");
        }

        // switch-case
        int flavor = 2;
        switch(flavor) {
            case 1:
                System.out.println("Vanila");
                break;
            case 2:
                System.out.println("Chocolate");
                break;
            case 3:
                System.out.println("Strawberry");
                break;
            case 4:
                System.out.println("Mango");
                break;
            default:
                System.out.println("Choice invalid :(");
        }

        /*****  Loops *****/

        // while loop
        int num = 1;
        while (num <= 10) {
            System.out.println("Inside while : " + num);
            num ++;
        }

        // do-while loop
        num = 1;
        do {
            System.out.println("Inside do-while : " + num);
            num ++;
        } while(num <= 10);

        // for loop
        for(num = 1; num <= 10; num ++){
            System.out.println("Inside for : " + num);
        }

        /*****  Function *****/
        int a = 4;
        int b = square(a);
        System.out.println("Square of " + a + " = " + b);
    }

    // function definition
    public static int square(int n) {
        return n * n;
    }
}