package org.example.dependencyInjection;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.dependencyInjection.Car;

import java.util.Map;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private Car car; //loosely coupled
    private int id;

    private Map<Integer, String> managers;

    public void display() {
        for(Map.Entry<Integer, String> entry: managers.entrySet()) {
            System.out.println("Manager with id: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

}
