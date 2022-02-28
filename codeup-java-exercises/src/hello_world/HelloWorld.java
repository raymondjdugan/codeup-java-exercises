package hello_world;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World");

// TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
// TODO: Create a String variable named myString and assign a string value to it, then print the variable       out to the console.
//        Change your code to assign a character value to myString
//        Change your code to assign the value 3.14159 to myString. What happens?
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out              myNumber to the console. What happens?
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        Change your code to assign the value 123 to myNumber.
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an              integer value does?
//        Change your code to declare myNumber as a float. Assign the value 3.14 to it. What                            happens? What are two ways we could fix this?
        String myString = "Raymond Dugan";
        System.out.println(myString);

        float myNumber = (float) 3.14;
//        System.out.println(myNumber);

// TODO: Copy and paste the following code blocks one at a time and execute them
        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);
// TODO: Rewrite the following expressions using the relevant shorthand assignment operators:

        int z = 4;
//        x = x + 5;
          z += 5;
        System.out.println(z);

        int a = 3;
        int b = 4;
//        b = b * a;
        b *= a;
        System.out.println(b);

        int d = 10;
        int e = 2;
//        d = d / e;
//        e = e - d;
        d /= e;
        e -= d;
        System.out.println(d);
        System.out.println(e);
    }
}
