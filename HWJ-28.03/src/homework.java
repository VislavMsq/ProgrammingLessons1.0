/*
ДЗ:
1) Создать методы(функции), которые будут возвращать сумму, произведение, частное и разность переменных типа double
2) Создать класс Car, в котором будет конструктор и метод(процедура) для вывода значения полей класса
3) Создать методы процедуры, которые будут выводить на консоль: "Я люблю Java" и "Учить программирование весело"
ДЗ со звездочкой
1) Создать класс - аналог ArrayList
2) Продемонстрировать работу всех модификаторов доступа в Java
 */


public class homework {
    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(mult(5, 5));
        System.out.println(div(111, 10));
        System.out.println(min(99, 33));

        Car car = new Car("Audi", "A3", 2.0, 2017, "Limousine");
        car.out();

        ILoveJava();
        Learning();

    }

    public static void ILoveJava (){
        System.out.println("Я люблю Java!");
    }
    public static void Learning(){
        System.out.println("Учить программирование весело!");
    }


    public static double sum(double a, double b) {
       return a + b;
    }

    public static double mult(double c, double d) {
        return c * d;
    }

    public static double div(double e, double g) {
        return e / g;
    }

    public static double min(double k, double l) {
        return k - l;
    }

    public static class SecretCars{
        protected static int secretCars = 0;
    }
}
