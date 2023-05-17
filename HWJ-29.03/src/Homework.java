/*
Дз:
    1) Создать класс Animal c полями: age, weight, name, id реализовать автогенерацию id, добавить метод(процедуру) для
    вывода полей объекта
    2)* Показать работу модификаторов доступа
     */

import PackageMain.FixiedBike;
import PackageMain.TrekkingBike;
import PackageSecond.CityBike;
import PackageSecond.MtbBike;

public class Homework {
    public static void main(String[] args) {
        Bike bike = new Bike("Aventon", 850 , 8.400, "Aluminum" );
        System.out.println(bike.id);
        Bike bike1 = new Bike("Cinelli", 2200 , 7.700, "Aluminum" );
        System.out.println(bike.id);
        Bike bike2 = new Bike("Dosnoventa", 3200 , 7.200, "Carbon" );
        System.out.println(bike.id);

        bike.out();
        bike1.out();
        bike2.out();

        System.out.println("Access Modifiers:" + "\n");

        FixiedBike fixiedBike = new FixiedBike();
        TrekkingBike trekkingBike = new TrekkingBike();
        MtbBike mtbBike = new MtbBike();
        CityBike cityBike = new CityBike();

        fixiedBike.out();
        trekkingBike.out();
        mtbBike.out();
        cityBike.out();




    }
}
