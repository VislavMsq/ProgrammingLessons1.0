import java.util.Scanner;

public class holidays {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//Сделать класс Cat с полями: age, weigth и name. Добавить конструктор для инициализации полей, сделать методы акссессоры(геттеры и сеттеры) и метод out для вывода на консоль всех значений объекта.
//Создать объект класса Cat и показать работу всех его методов.

        //создаем перемееную наших параметров для класса Cat и задаем их характеристики
        Cat myCat = new Cat(8, 9, "Mars");
        Cat catFriend = new Cat(3, 5, "Boris");

        // выводим в консоль наших котов, через точку обращаемся к параметрам
        // через геттре мы получаем данные
        System.out.println("friend's cat age: " + catFriend.getAge() + "\n" +
                "friend's cat weigth: " + catFriend.getWeigth() + "\n" +
                "friend's cat name: " + catFriend.getName() + "\n");
        System.out.println("my cat age: " + myCat.getAge() + "\n" +
                "my cat weigth: " + myCat.getWeigth() + "\n" +
                "my cat name: " + myCat.getName());
        // выставил пробел для читаемости
        System.out.println();

        // через сеттер мы можем изменить данные, в нашем примере изменили возраст кота myCat и имя кота catFriend
        myCat.setAge(5);
        System.out.println("new age myCat: " +  myCat.getAge());

        catFriend.setName("Jora");
        System.out.println("new name catFriend: " + catFriend.getName());


//Сделать логический метод, который проверяет на равенство два числа
        //запрашиваем данные из консоли и записываем их в переменные
        System.out.println("Enter 1th number!");
        int r = sc.nextInt();
        System.out.println("Enter 2th number!");
        int t = sc.nextInt();

        // с помощью if else мы сравниваем данные из переменных знаком равенства ==, если результат true, то выводим
        // сообщение "Entered numbers are equal!", если числа не равны, то ответ false  и выводим сообщение
        //"Entered numbers are not equal"
        if (t == r) {
            System.out.println("Entered numbers are equal!");
        } else {
            System.out.println("Entered numbers are not equal");
        }

        // мой любимый вариант цикла) Используется если нужно проделать определенную задачу какое-то колличество раз
        // если нужно провести какие-то циклические вычисления с вашей i, он очень компактно смотриться в коде
        System.out.println("Введите цифру 1!");
        int i = sc.nextInt();
        for (; i < 10; i++) {
            System.out.println(i + 1);
        }

        System.out.println();

        // оператор while позволяет создать цикл который будет выполняться, пока условие истино,
        // while цикл может быть бесконечным
        System.out.println("Введите цифру 1!");
        int q = sc.nextInt();
        while (q <= 10) {
            System.out.println(q);
            q++;
        }

        // цикл do while выполняется наоборот и позволят выполнить блок хотябы один раз перед проверкой условия
        System.out.println("Введите цифру 1!");
        int w = sc.nextInt();
        do {
            System.out.println(w);
            w++;
        }
        while (w <= 10);
        System.out.println();


        // оператор switch позволяет выполнять вычесления блок за блоком
        for (int e = 0; e <= 10; e++)           // добавил цикл for чтобы он помог запустить вычесления оператора switch
            switch (e) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;
                case 10:
                    System.out.println("10");
                    break;

            }
    }
}

