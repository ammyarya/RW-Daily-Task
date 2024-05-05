import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hashsetClass {
    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);

        for(int i : hs){

            if(hs.contains(3));
            System.out.println("Value is present" + i);
    }
}

}
