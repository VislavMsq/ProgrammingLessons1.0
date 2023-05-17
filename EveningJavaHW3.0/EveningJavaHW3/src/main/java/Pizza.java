public class Pizza {
    // Формула для нахождения площади пиццы: S =  Pi * (r ^ 2)

    // проводим вычесления разности и умножаем на наши каллории

    // выводим результат на консоль
    public double displayInit(double res){
        display(res);
        return res;
    }

    public double result(double r1, double r2) {
       double pizza1 = area(r1);
       double pizza2 = area(r2);
       double res = (pizza1 - pizza2) * 40;
       
       return displayInit(res);

    }

    // метод для вычисления площади пиццы с заданным радиусом
    public double area(double r) {
        mul(pow(r));  // формула площади
        return r;
    }

    // создаем методы для формулы площади
    // начинаем со скобок
    public double pow(double r) {
        return r * r;
    }

    // Pi * на результат скобок
    public double mul(double pow) {
        return Math.PI * pow;
    }

    // форматируем наш результат
    public void display(double t){
        System.out.println("У тебя получится на " + t + " калорий больше, если ты сьешь пиццу диаметром 28см");
    }

}
