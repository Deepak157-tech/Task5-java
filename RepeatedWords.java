import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {
    public static void main(String[] args) {
        String paragraph = " java is easy java is powerful";
        String [] words = paragraph.toLowerCase().split(" ");

         Map<String, Integer> map = new HashMap<>();
         for (String word : words) {
             map.put(word, map.getOrDefault(word, 0) + 1);
         } 

         System.out.println("Repeated Words");
          for (String word : map.keySet()) {
             if (map.get(word) > 1) {
                 System.out.println(word + " -> " + map.get(word));
             }
          }

    }
}
