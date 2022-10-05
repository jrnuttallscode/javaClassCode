public class IncrDecr {
    public static void main(String[] args) {
        // unary operator ++ increament and -- decreament
        // post and pre increament
        // post and pre decreament

        // increament = normally if you just do ++ its adding one to any number
        // decreament = normally if you just do -- its subtract one to any number
        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a);// 11

        int b = 10;
        System.out.println(b++); // 10
        System.out.println(b);// 11

        int c = 10;
        System.out.println(--c); // 9
        System.out.println(a);// 9

        int d = 10;
        System.out.println(d--); // 10
        System.out.println(d);// 9

    }
}