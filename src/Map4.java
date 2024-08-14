import java.util.TreeMap;
import java.util.*;
public class Map4 {
    public static void main(String[] args) {
        TreeMap<Integer,String> qiymat = new TreeMap<>();
        qiymat.put(5,"Teacher");
        qiymat.put(6,"Driver");
        qiymat.put(7,"Artist");
        qiymat.put(8,"Singer");

        System.out.println(qiymat.firstEntry());
        System.out.println(qiymat.lastEntry());
        NavigableSet<Integer> reverseKeys = qiymat.descendingKeySet();
        System.out.println(reverseKeys);
    }

}
