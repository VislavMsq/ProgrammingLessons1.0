package PackageMain;

public class TrekkingBike {
    public void out(){
        FixiedBike obj = new FixiedBike();
        System.out.println("Доступ к переменным из другого класса, но в том же пакете!");
        System.out.println("Default: " + obj.cinelli);
        System.out.println("Protected: " + obj.dosnoventa);
        System.out.println("Public: " + obj.dolan + "\n");
    }

}
