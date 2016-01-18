package ua.kiev.prog.OOP.lesson1_18_01.task1_task2;

public class Circle {

    private double radius;
    private static int instancesCount;

    Circle (double radius){
        instancesCount++;
        this.radius = radius;
    }

    public double getSquare(){
        return Math.pow(this.radius, 2)*Math.PI; //или без this
    }

    public static int getInstancesAmount(){
        return instancesCount;
    }

}
