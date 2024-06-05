package org.example.dependencyInjection;




public class Wheel {

    private final String colour;

    public Wheel(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Wheel)) return false;
        final Wheel other = (Wheel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$colour = this.getColour();
        final Object other$colour = other.getColour();
        if (this$colour == null ? other$colour != null : !this$colour.equals(other$colour)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Wheel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $colour = this.getColour();
        result = result * PRIME + ($colour == null ? 43 : $colour.hashCode());
        return result;
    }

    public String toString() {
        return "Wheel(colour=" + this.getColour() + ")";
    }
}
