package bt;
import java.util.Arrays;
import java.util.List;
public class bt3 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(14, 52, 72, 34, 82, 87, 12, 6, 41);

        arr.sort((o1, o2) -> o2 - o1);

        System.out.println(arr);
    }
}
