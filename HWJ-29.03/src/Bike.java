public class Bike {

    String brand;
    int price;
    double weight;
    String material;
    static int ident = 1;
    int id;

    public Bike(String brand, int price, double weight, String material) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.material = material;
        id = ident;
        ident++;
    }

    public void out() {

        System.out.println("Brand: " + brand + "\n" +
                "Price: " + price + "\n" +
                "Weight: " + weight + "\n" +
                "Material: " + material + "\n" +
                "Id: " + id + "\n");
    }

}
