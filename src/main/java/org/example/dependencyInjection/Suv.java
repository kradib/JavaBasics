package org.example.dependencyInjection;

import java.util.List;

public class Suv extends Car {
    public Suv(int model, List<Wheel> wheels) {
        super(model, wheels);
    }
}
