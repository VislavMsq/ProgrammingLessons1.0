package PackageSecond;

import PackageMain.FixiedBike;

public class CityBike extends FixiedBike {
    public void out(){
        FixiedBike obj = new FixiedBike();
        System.out.println("Доступ из другого класса в другом пакете!");
        System.out.println("Public: " + obj.dolan + "\n");
    }
}
