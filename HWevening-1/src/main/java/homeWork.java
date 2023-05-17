public class homeWork {
    public static void main(String[] args) {


        // Способ №1 - используем явное преведение к переменной
        char q = '0';
        int q1 = (int) q;
        System.out.println("Используем явное приведение: " + q);

        // Способ №2 - в переменную кладется w1 наш char, затем из класса Integer мы через точку обращаемся к методу
        // parseInt, он с вою очередь принммает строку из метода String.valueOf и переводит ее в число
        char w = '0';
        int w1 = Integer.parseInt(String.valueOf(w));
        System.out.println("Переводим наш char методом parseInt: " + w1);

        // Способ №3 - переводи нашу переменную е в числовую int и преобразовует ее с помощью класса Character и его
        // метода getNumericValue
        char e = '0';
        int e1 = Character.getNumericValue(e);
        System.out.println("Переводим наш char методом getNumericValue: " + e1);



    }

}
