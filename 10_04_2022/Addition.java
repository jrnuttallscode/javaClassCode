public class Addition {
    public static void main(String[] args) {

        // Addition is being performed
        // Default values will be allocated to the variable as soon as you declare
        // Byte, short, int, long: 0 is the default
        // Double, float: 0.0 is default
        // Char is null by default
        // Boolean is false by default
        // Initialization or assignment operator

        int a = 100; // 4 bytes
        int b = 200; // 4 bytes
        int sum = 0;

        sum = a + b;
        System.out.println("a + b = " + sum);
    }    
}
