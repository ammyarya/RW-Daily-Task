
import java.util.*;

public class student {

    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println("Initial LinkedList " + ll);

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal " + ll);

        ll.remove("Geeks");

        System.out.println("After the Object Removal " + ll);
    }
}
