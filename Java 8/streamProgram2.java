import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamProgram2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + upperCaseStrings);
    }
}
