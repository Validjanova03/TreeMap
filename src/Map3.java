import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;


public class Map3 {
    public static void main(String[] args) {
        HashMap<String, Integer> org = new HashMap<>();
        org.put("bir", 1);
        org.put("ikki", 2);
        org.put("uch", 3);
        org.put("to'rt", 4);

        HashMap<String, Integer> clone = clonemap( org);
        ArrayList<String> list1 = ToArray(clone);
        System.out.println(clone+" : Kloni");
        System.out.println(list1+" : Arrayda");

    }

    public static HashMap<String, Integer> clonemap(HashMap<String, Integer> org) {
        return (HashMap<String, Integer>) org.clone();
    }
public static ArrayList<String> ToArray(HashMap<String, Integer> clone){

    Collection<String> keys = clone.keySet();

    ArrayList<String> list = new ArrayList<>(keys);
    return list;
    }
}
