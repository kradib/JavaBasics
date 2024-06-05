package org.example.dependencyInjection;

import java.util.List;

public class Car {

    private final int model;
    private final List<Wheel> wheels;

    public Car(int model, List<Wheel> wheels) {
        this.model = model;
        this.wheels = wheels;
    }

    public int getModel() {
        return this.model;
    }

    public List<Wheel> getWheels() {
        return this.wheels;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Car)) return false;
        final Car other = (Car) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getModel() != other.getModel()) return false;
        final Object this$wheels = this.getWheels();
        final Object other$wheels = other.getWheels();
        if (this$wheels == null ? other$wheels != null : !this$wheels.equals(other$wheels)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getModel();
        final Object $wheels = this.getWheels();
        result = result * PRIME + ($wheels == null ? 43 : $wheels.hashCode());
        return result;
    }

    public String toString() {
        return "Car(model=" + this.getModel() + ", wheels=" + this.getWheels() + ")";
    }
}
