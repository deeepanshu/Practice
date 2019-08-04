import java.util.*;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class TellThePosition {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while (n != 0) {
            String inp = scn.next();
            int marks1 = scn.nextInt();
            int marks2 = scn.nextInt();
            int marks3 = scn.nextInt();
            int marks = marks1 + marks2 + marks3;
            map.put(inp, marks);
            n--;
        }
        Map<String, Integer> sorted = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
        int i = 1;
        for (String ss : sorted.keySet()) {
            System.out.println(i + " " + ss);
            i++;
        }
        scn.close();
    }

}