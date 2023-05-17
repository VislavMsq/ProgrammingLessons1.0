package PackageMain;

public class FixiedBike {

    private String aventon = "Aventon";
    String cinelli = "Cinelli";
    protected String dosnoventa = "Dosnoventa";
    public  String dolan = "Dolan";

    public void out(){
        System.out.println("Private: " + aventon);
        System.out.println("Default: " + cinelli);
        System.out.println("Protected: " + dosnoventa);
        System.out.println("Public: " + dolan + "\n");
    }
}
