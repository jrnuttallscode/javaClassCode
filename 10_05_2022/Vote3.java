public class Vote3 {
    public static void main(String[] args) {
        int age = 20;
        char gender = 'e';
        if (age >= 18 && gender == 'M') {
            System.out.println("you can vote go to room1");
        } else if (age >= 18 && gender == 'F') {
            System.out.println("you can vote go to room 2");
        } else if (age >= 18 && (gender != 'M' && gender != 'F')) {
            System.out.println("enter either M or F as gender");
        } else {
            System.out.println("cannot vote");
        }

    }
}

// AND logical operator
// true && true = true
// true && false = false
// false && true = false
// false && false = false

// OR logical operator
// true && true = true
// true && false = true
// false && true = true
// false && false = false

// NOT logical operator (its just opposite)
// true = false
// false = true