package org.example.dependencyInjection;


import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Wheel wheel1 = new Wheel("black");
        Wheel wheel2 = new Wheel("blue");

        List<Wheel> wheelList = List.of(wheel1, wheel2);

        Thor thor = new Thor(1, wheelList);
        //Suv suv = new Suv(1, wheelList);

        Employee employee1 = new Employee("Hamid", thor, 1, Map.of(101, "Ana", 102, "Pretty", 103, "Arun"));
        employee1.display();
        //101 -> "Ana"
        //102 -> "Preety"
        //103 -> "Arun"

        //Employee employee2 = new Employee("Hamid", suv, 1);

        //All dependencies would be created via Framework

    }
}