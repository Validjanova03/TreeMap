import java.util.*;
import java.util.TreeSet;
public class Map5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Bir");
        map.put( 2,"Ikki");
        map.put(3,"Uch");
        map.put(4,"To'rt");
        map.put(5,"Besh");
        int key = 4;
        for (Map.Entry<Integer,String > e : map.headMap(key).entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        Set<Integer> mapset = new TreeSet<>(map.keySet());
        System.out.println(mapset);
        map.clear();
        System.out.println("Tozalandi: "+map);
    }
}