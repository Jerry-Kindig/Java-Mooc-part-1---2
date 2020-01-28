
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> nameMap = new HashMap<String, String>();
        nameMap.put("matti", "mage");
        nameMap.put("mikael", "mixu");
        nameMap.put("arto", "arppa");
        System.out.println(nameMap.get("mikael"));
    }

}
