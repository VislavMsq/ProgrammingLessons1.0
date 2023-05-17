public class Cat {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private int weigth;
    private String name;

    public Cat(int age, int weigth, String name) {
        this.age = age;
        this.weigth = weigth;
        this.name = name;
    }



}

