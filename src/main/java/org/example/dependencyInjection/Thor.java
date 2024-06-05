package org.example.dependencyInjection;

import java.util.List;

public class Thor extends Car {
    public Thor(int model, List<Wheel> wheels) {
        super(model, wheels);
    }
}
