package ua.edu.ucu.lab7_4.flowers;
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
