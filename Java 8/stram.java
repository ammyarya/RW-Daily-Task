
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(4);
        list.add(76);
        list.add(21);
        list.add(3);
        list.add(80);

        var stream = list.stream();

        var numbers = stream.filter(number -> number % 2 == 0)
                .filter(number -> number > 20);

        numbers.forEach(System.out::println);
    }
}
