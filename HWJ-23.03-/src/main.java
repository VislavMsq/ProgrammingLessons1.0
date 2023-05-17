import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        byte = 10;
//        short  = 10203;
//        int = 1234567;
//        char = 7;
//        long = 123456789;
//        float = 2.12f;
//        double = 32.32;
//        boolean = true;



        System.out.println("Переменная Byte: ");
        byte bt = sc.nextByte();
        System.out.println("Byte: " + bt);

        System.out.println("Переменная Short: ");
        short sr = sc.nextShort();
        System.out.println("Short: " + sr);

        System.out.println("Переменная Int: ");
        int i =  sc.nextInt();
        System.out.println("Int: " + i);

        System.out.println("Переменная Char: ");
        char chr = sc.next().charAt(0);
        System.out.println("Char: " + chr);

        System.out.println("Переменная Long: ");
        long lng = sc.nextLong();
        System.out.println("Long: " + lng);

        System.out.println("Переменная Float: ");
        float flt = sc.nextFloat();
        System.out.println("Float: " + flt);

        System.out.println("Переменная Double: ");
        double dbl = sc.nextDouble();
        System.out.println("Double: " + dbl);

        System.out.println("Переменная Boolean: ");
        boolean bln = sc.nextBoolean();
        System.out.println("Boolean: " + bln);


        System.out.println("|--------|---------|-----------|------|------------|---------|----------|---------|");
        System.out.println("|--Byte--|--Short--|----Int----|-Char-|----Long----|--Float--|--Double--|-Boolean-|");
        System.out.printf("|%8d| %8d| %10d| %5c| %11d| %8.2f| %9.2f| %8b|\n", bt, sr, i, chr, lng, flt, dbl, bln);
        System.out.println("|--------|---------|-----------|------|------------|---------|----------|---------|");
    }
}
