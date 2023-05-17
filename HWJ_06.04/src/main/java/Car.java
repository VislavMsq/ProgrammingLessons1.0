public class Car {
    private String brand;
    private String model;
    private int price;
    private int enginePower;



    public Car(String brand, String model, int price, int enginePower) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.enginePower = enginePower;
    }

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


    public void out() {
        System.out.println("Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Price: " + price + "\n" +
                "Engine power: " + enginePower + "\n");
    }
}

