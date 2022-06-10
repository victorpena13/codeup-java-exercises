import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmaps {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put("key1", list);
        map.get("key1").add("value1");
        map.get("key1").add("value2");



        System.out.println(map.get("key1"));

    }
}
