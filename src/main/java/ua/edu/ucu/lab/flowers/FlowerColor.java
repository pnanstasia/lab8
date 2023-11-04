package ua.edu.ucu.lab.flowers;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), BLUE("blue");
    private String value;

    FlowerColor(String value) {
        this.value = value;
    }

    @JsonValue
    public String toString() {
        return value;
    }
}
