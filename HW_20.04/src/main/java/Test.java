public class Test {
    //    Сделать класс для управления массивом из 10 элементов.
    //    Реализовать операции: вставка, удаление, сортировка, поиск, вывод в строку.
    public static void main(String[] args) {
        ArrayWorking array = new ArrayWorking();
        array.insert(1);
        array.insert(6);
        array.insert(4);
        array.insert(8);
        array.insert(3);
        array.insert(5);
        array.insert(2);
        array.insert(9);
        array.insert(7);
        System.out.println(array.toString());
        array.sort();
        System.out.println(array.toString());
        System.out.println(array.find(5));
        array.delete(1);
        System.out.println(array.toString());

    }

}
