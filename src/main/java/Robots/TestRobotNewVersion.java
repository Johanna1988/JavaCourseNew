package main.java.Robots;

public class TestRobotNewVersion {
    public static void main(String[] args) {
        RobotNewVersion robot2 = new RobotNewVersion();
        robot2.setModel("LG");
        robot2.setYearOfManufacture(2022);
        robot2.getInfo();
        robot2.speak();
        robot2.shout();
    }
}
