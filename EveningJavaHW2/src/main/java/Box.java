public class Box {
    private int width;
    private int height;
    private int lengths;

    public Box(int width, int height, int lengths) {
        this.width = width;
        this.height = height;
        this.lengths = lengths;
    }
    public void println(){
        System.out.println("Width: " + width + " Height: " + height + " Lengths: " + lengths);
    }
    public void sum(){
        int sum = width * height * lengths ;
        System.out.println("Box area: " + sum + " m^3");
    }
}
