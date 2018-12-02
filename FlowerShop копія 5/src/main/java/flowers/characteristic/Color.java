package flowers.characteristic;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Color {
    RED("#F00"), YELLOW(""), BLUE("00F");

    private String rgb;

    Color(String rgb) {
        this.rgb = rgb;
    }
}