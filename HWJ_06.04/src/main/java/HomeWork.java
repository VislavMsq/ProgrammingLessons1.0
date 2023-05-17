public class HomeWork {
    public static void main(String[] args) {

        System.out.println("Пример сложение: " + addition(3, 5));
        System.out.println("Пример вычетание: " + subtraction(5, 3));
        System.out.println("Пример умножения: " + multiplication(3, 3));
        System.out.println("Пример деления: " + division(9, 3));

        Car car = new Car("Audi", "A7", 110000, 450);
        Car car1 = new Car("BMW", "M5", 120000, 580);
        Car car2 = new Car("Tesla", "Model S", 70000, 510);

        System.out.println(car.getBrand());
        car.setPrice(95000);
        System.out.println(car.getPrice());

        car1.setBrand("Volkswagen");
        System.out.println(car1.getBrand());
        car1.setModel("Golf VII GTI");
        System.out.println(car1.getModel());
        car1.setPrice(65000);
        System.out.println(car1.getPrice());

        int sum = car.getPrice() + car1.getPrice() + car2.getPrice();
        System.out.println("Сумма всех авто: " + sum + "\n");


        car.out();
        car1.out();
        car2.out();

        System.out.println(addition(5, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(10, 5));

        int q = 10;
        int w = 5;
        int e = 3;

        System.out.println(moreThanTwo(10, 5, 3));
        System.out.println(moreThanOne(10, 5, 3));
        System.out.println(moreThanJustOne(10,5,3));

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static boolean moreThanTwo(int a, int b, int c) {
        return a > b && a > c;
    }

    public static boolean moreThanOne(int a, int b, int c) {
        return a >= b || a >= c;
    }

    public static boolean moreThanJustOne(int a, int b, int c){
        return (a > b && a <= c) || (a > c && a <= b);
    }

}
