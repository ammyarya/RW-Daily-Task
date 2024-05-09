import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamProgram3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David", "Andrew", "Eve");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with 'A': " + filteredNames);
    }
}
