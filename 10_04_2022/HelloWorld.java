public class HelloWorld {
    public static void main(String[] args) {
        // datatypes --> 2 types
        // primitive and non- primitive or reference type
        // primitive ->
        // byte = -128 to +127 -> -2^7 to + 2^7-1 -> 1byte or 8bits
        // short = -> -2^15 to + 2^15-1-> 2byte or 16bits
        // int = -> -2^31 to + 2^31-1-> 4byte or 32bits
        // long= -> -2^63 to + 2^63-1-> 8byte or 64bits suffixed or prefixed with a l or
        // L
        // float= -> -2^31 to + 2^31-1-> 4byte or 32bits it can hold decimal values
        // suffixed or prefixed with a f or F
        // double -> -2^63 to + 2^63-1-> 8byte or 64bits it can hold decimal values
        // char = -> -2^15 to + 2^15-1-> 2byte or 16bits just one character and in ''
        // single quote
        // boolean -> true or false value and memory to be 1byte
        // syntax for defining a variable
        // datatype variable_name = value;
        // semicolon is important or else its gong to throw compilation error

        byte a = 127; // error is 128 which is out of range
        short b = 1234;
        int c = 132424;
        long d = 12312432235l; // error if l is not suffixed or prefixed
        float e = 23144.24324F; // error if f is not suffixed or prefixed
        double f = 123424.4235423;
        char vidya = 'h'; // error if h is not in single quotes
        boolean h = false; // can hold only true or false value

        // System is a class in java by looking at the naming convention as it starts
        // from a uppercase
        // if you want to print something on the screen you should use this statement
        System.out.println("Good morning guys, welcome to blit " + a + " " + b
                + " " + c + " " + d + " " + e + " " + f + " " + vidya + " " + h);

    }
} 