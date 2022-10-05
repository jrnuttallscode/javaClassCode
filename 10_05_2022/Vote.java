// > greater than  (10 > 20 ?) false
// < less than  (10 < 20 ?) true
// >= greater than or equal to (10 >= 10 ?) true
// <= less than or equal to (10 <= 10 ?) true
// != not equal to (10 != 10 ?) false

public class Vote {
    public static void main(String[] args) {
        // We are designing a voting system.
        // We are taking a variable with name AGE which is of type int
        // Check that AGE with 18 and if it is true, do something.
        // If not, do something else.

        int age = 25;
        // Syntax of writing if which is a condition checking keyword in Java
        // if(condition check) {
        // statement to be printed if the condition is true
        // }
        // if (age >= 18) {
        // System.out.println("Go and vote.");
        // }
        // if (age < 18) {
        // System.out.println("Cannot vote.");
        // }

        // if else condition
        // if(condition check) {
        // statement to be printed if the condition is true
        // }
        // else {
        // statement if the condition is false
        // }

        if (age >= 18) {
            System.out.println("Go and vote.");
        } else {
            System.out.println("Cannot vote.");
        }
    }
}
