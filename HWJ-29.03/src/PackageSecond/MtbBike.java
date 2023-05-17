package PackageSecond;

import PackageMain.FixiedBike;

public class MtbBike extends FixiedBike {
    public void out(){
    FixiedBike obj = new FixiedBike();
        System.out.println("Доступ к переменным из другого класса наследника, находящегося в другом пакете!");
        System.out.println("Protected: " + super.dosnoventa);
        System.out.println("Public: " + obj.dolan + "\n");
    }
}
