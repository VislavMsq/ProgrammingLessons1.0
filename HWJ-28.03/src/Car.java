public class Car {
    private String brand;
    private String model;
    private double volumeEngine;
    private int productionYearAuto;
    String carBodyType;

    public Car(String brand, String model, double volumeEngine, int productionYearAuto, String carBodyType) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
        this.productionYearAuto = productionYearAuto;
        this.carBodyType = carBodyType;
    }

    public void out() {
        System.out.println("Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Volume engine: " + volumeEngine + "\n" +
                "Production year auto: " + productionYearAuto + "\n" +
                "Car body type: " + carBodyType );
    }
}
