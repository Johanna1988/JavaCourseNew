package main.java.Robots;

public class Robot {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.model = "AT-Robot";
        robot1.yearOfManufacture = 2021;
        robot1.getInfo();
        System.out.println();
        robot1.speak();
        System.out.println();
        robot1.shoot();
        System.out.println();
        robot1.move();
    }
    private String model;
    private int yearOfManufacture;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void speak(){
        System.out.println("Hello, please select an option below...");
    }
    private void shoot(){
        System.out.println("BaBah!!!");
    }
    void getInfo(){
        System.out.println(model + "," + " manufactured in " + yearOfManufacture + ".");
    }
    void move(){
        System.out.println("Robot moves forward");
    }
}

