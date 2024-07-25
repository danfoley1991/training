// All code is contained inside a concept called "a class"
// A class is a blueprint which contains instructions and data
// Public = visibility modifier which says to Java anything can create 
public class Main {
    public static void main(String[] args) {

        // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int imAnInteger = 0;

        // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float imAFloat = 2.2f;

        // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        double imADouble = 5.5;

        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long imALong = 12345L;

        // char	2 bytes	Stores a single character/letter or ASCII values
        char imALetter = 'L';

        // boolean	1 bit	Stores true or false values
        boolean imABoolean = true;
        String imALineOfTest = "Line of text";

        // short	2 bytes	Stores whole numbers from -32,768 to 32,767
        short imAShort = 123;

        // byte	1 byte	Stores whole numbers from -128 to 127
        byte aByte = 10;

        // How to output to the console
        System.out.println("Hello world!");

        // A basic if statement to check if the arguments provided contains more than 0 arguments
        if(args.length > 0) {
            // If it does, we output "Args are populated"
            System.out.println("Args are populated");

            // This is how we return out of a function/method
            return;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }

        for(String arg : args) {
            System.out.println("Arg is " + args);
        }

        int i = 0;
        do {
            System.out.println("Arg " + i + " is " + args[i]);
            i++;
        } while(i < args.length);

        i = 0;
        while(i < args.length) {
            System.out.println("Arg " + i + " is " + args[i]);
            i++;
        }
    }
}