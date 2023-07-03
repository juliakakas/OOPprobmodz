import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    private static List<String> text;

    public static List<String> getText() {
        return text;
    }

    public static void setText(List<String> text) {
        if (text.size() > 25){
            text.lastIndexOf(20);
            text.add(20,"...");
        }
        Text.text = text;
    }

    public static void main(String[] args) {

        text = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."
        ));

        System.out.println(text);

    }

}

