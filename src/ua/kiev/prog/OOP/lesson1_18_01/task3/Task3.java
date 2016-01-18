package ua.kiev.prog.OOP.lesson1_18_01.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    private static final String  HELP = "help";
    private static final String  START = "start";
    private static final String  MOVE = "move";
    private static final String  KEEP = "keep";
    private static final String  STOP = "stop";
    private static final String  OFF = "off";
    private static final String  EXIT = "exit";

    public static void main(String[] args) throws Exception{
        manageTheCar(new Car("suzuki"));

    }

    public static void manageTheCar(Car car) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. You've got a car, please see the instructions below:");
        printHelp();
        System.out.println("Please write your 1st command:");

        String command = reader.readLine();

        while (!command.equalsIgnoreCase(EXIT)){

            if (command.equalsIgnoreCase(HELP)){
                printHelp();
            } else if (command.equalsIgnoreCase(START)) {
                car.start();
            } else if (command.equalsIgnoreCase(MOVE)) {
                System.out.println("Please indicate new speed...");
                car.changeSpeedTo(Integer.valueOf(reader.readLine()));
            } else if (command.equalsIgnoreCase(KEEP)) {
                System.out.println("Please indicate time...");
                car.keepSpeed(Integer.valueOf(reader.readLine()));
            } else if (command.equalsIgnoreCase(STOP)) {
                car.stopTheCar();
            } else if (command.equalsIgnoreCase(OFF)) {
                car.off();
            } else {
                System.out.println("Unknown command...");
            }
            System.out.println("...");
            command = reader.readLine();
        }
    }

    public static void printHelp(){
        System.out.println(HELP  + " - get full list of commands");
        System.out.println(START + " - start and engine");
        System.out.println(MOVE + " - change speed to <input>");
        System.out.println(KEEP + " - keep speed at current amount");
        System.out.println(STOP + " - stop the car: speed => 0");
        System.out.println(OFF + " - switch off the engine");
        System.out.println(EXIT + " - exit the program");
    }
}
