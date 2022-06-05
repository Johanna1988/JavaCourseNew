package main.java.Robots;

class RobotNewVersion extends Robot {
    @Override
    public void speak() {
        System.out.println("Hello, Press 1 for English, 2 for Ukrainian");
    }
    public void shout(){
        System.out.println("Don't move!");
    }
}
