import java.util.HashMap;
import java.util.Map;
public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer, String> soz = new HashMap<>();
        soz.put(1, "Bir");
        soz.put(2, "Ikki");
        soz.put(3, "Uch");

        HashMap<Integer, String> soz1 = new HashMap<>();
        soz1.put(4, "Tort");
        soz1.put(5, "Besh");
        soz1.put(6, "Olti");
        Map<Integer,String> marge = merged(soz,soz1);
        System.out.println( marge );
        System.out.println(marge.values());
        marge.clear();
        System.out.println("Tozalandi: "+marge);
    }
    public static <Integer, String> Map<Integer, String> merged(Map<Integer,String> soz,Map<Integer,String> soz1){
        Map<Integer,String> mar = new HashMap<>(soz);
        mar.putAll(soz1);
        return mar;
    }
    }

