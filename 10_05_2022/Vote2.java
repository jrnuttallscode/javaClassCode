public class Vote2 {
    public static void main(String[] args) {

        int age = 19;
        char gender = 'f';

        if (age >= 18) {
            if (gender == 'M') {
                System.out.println("You can vote. Go to Room 1.");
            } else if (gender == 'F') {
                System.out.println("You can vote. Got to Room 2.");
            } else {
                System.out.println("Please enter either M or F as gender.");
            }
            }
        else {
        System.out.println("Cannot vote.");
        }
    }
}
