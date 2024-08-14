import java.util.HashMap;
import java.util.Map;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Oq");
        map.put(2, "Qora");
        map.put(3, "Qizil");
        map.put(4, "Sariq");
        map.put(5, "Pushti");
        System.out.println(map.keySet());
        System.out.println(map.size());
    }
}