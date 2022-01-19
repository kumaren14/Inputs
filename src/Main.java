import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double doubleOne, doubleTwo;
        float floatOne, floatTwo;
        short shortOne, shortTwo;
        String stringOne, stringTwo, stringThree, stringFour;

        System.out.print("Enter an integer (-2B to 2B)--> ");
        intOne = keyboard.nextInt();
        System.out.print("Enter a second integer (-2B to 2B)--> ");
        intTwo = keyboard.nextInt();

        System.out.print("Enter a double value (up to 15 decimal places)--> ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter a second double value (up to 15 decimal places)--> ");
        doubleTwo = keyboard.nextDouble();

        System.out.print("Enter a float value (up to 7 decimal places)--> ");
        floatOne = keyboard.nextFloat();
        System.out.print("Enter second float value (up to 7 decimal places)--> ");
        floatTwo = keyboard.nextFloat();

        System.out.print("Enter a short value (-32768 to 32767)--> ");
        shortOne = keyboard.nextShort();
        System.out.print("Enter a second short value (-32768 to 32767)--> ");
        shortTwo = keyboard.nextShort();

        System.out.print("Enter a string (just one word!)--> ");
        stringOne = keyboard.next();
        System.out.print("Enter a second string (just one word!)--> ");
        stringTwo = keyboard.next();
        keyboard.nextLine(); /* so let me explain why I have this line here
        for some reason, after finishing the stringTwo = keyboard.next() line above it,
        my first System.out.print("Enter a multi line string"); is skipped
        i looked it up, and that happens when you have a next(); or a nextInt(); above a nextLine();
        it told me to input this line, and it worked
        I'm not 100% sure on why it worked, something to do with new lines and whitespace
        but if it ain't broke, don't fix it*/

        System.out.print("Enter a string (as many words as you want)--> ");
        stringThree = keyboard.nextLine();
        System.out.print("Enter a second string (as many words as you want)--> ");
        stringFour = keyboard.nextLine();


        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo);
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println("one-word string one = " + stringOne);
        System.out.println("one-word string two = " + stringTwo);
        System.out.println("multi-word string one = " + stringThree);
        System.out.println("multi-word string two = " + stringFour);

        //add output for all variables

    }
}
