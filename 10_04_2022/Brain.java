public class Brain {

    // What is a method? The behavior performed by the property.
    // e.g. hand and mouth together perform eating
    // All of the methods have to be inside the class body but it 
    // should not be inside another method.
    // We cannot have two methods with the same name inside the class body.
    // Naming convention: Starts with a lower case and if you want to combine 2 or more words,
    
    // Syntax of a method: public static return_type method_name(any number of parameters) {
    //    body of this method => logic
    // }

    // This is my program's brain and I want to keep it clean.
    // I only want controlling done here in the main method.
    // All of the program execution starts from the main method.

    public static void addition() {
        int a = 100;
        int b = 200;
        int sum = 0;
        sum = a + b; // 300
        System.out.println(sum);
    }

    public static void division() {
        int a = 100;
        int b = 200;
        int sum = 0;
        sum = a / b; // 0
        System.out.println(sum);
    }

    public static void multiplication() {
        int a = 100;
        int b = 200;
        int sum = 0;
        sum = a * b; // 20000
        System.out.println(sum);
    }

    public static void modulo() {
        int a = 100;
        int b = 200;
        int sum = 0;
        sum = a % b; // 100
        System.out.println(sum);
    }


    // Method I use to subtract one number from another.
    // Method name has to me relevant to the logic you write inside the method.
    public static void subtraction() {
        int a = 100;
        int b = 200;
        int sum = 0; // Using the same variable name in different methods is okay.
                     // but for convenience, have a proper name, like subtracted_value or sub
        sum = a - b; // -100
        System.out.println(sum);
    }

    public static void main(String[] args) {

        // Method call is performed by the main method.
        // It's going to look for the addition method in the Class.
        // If found, it will enter the method. 

        addition();
        subtraction();
        multiplication();
        division();
        modulo();
    }
    
}


// + addition: 10 + 20 = 30
// - subtraction: 10 - 20 = -10
// * multiplication: 10 * 20 = 200
// / division: 20 / 10 = 2 quotient
// % modulo operator: 20 % 10 = 2 remainder