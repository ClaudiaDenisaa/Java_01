package _3_;

public class Test {
    public static void main(String[] args) {
        Nr_complex nr1 = new Nr_complex(-2,3);
        Nr_complex nr2 = new Nr_complex(3,-7);
        Nr_complex nr3 = new Nr_complex(-3);
        Nr_complex nr4 = new Nr_complex();
        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
        System.out.println(nr4);

        double d = nr1.modul();
        String formatat = String.format("%.2f", d);
        System.out.println(formatat);
        System.out.println(nr1.adunare(nr2));
        System.out.println(nr1.adunare(nr4));
        System.out.println(nr1.produs(nr3));
        System.out.println(nr1.produs(nr2));

        double d2 = nr3.modul();
        String f2 = String.format("%.2f",d2);
        System.out.println(f2);

    }
}
