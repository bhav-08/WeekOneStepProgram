import java.util.*;

class Main {
    static void printFilteredWordFrequency(String s) {
        String[] stop = {"the","was","and","a","is","of","in"};
        Map<String, Integer> map = new HashMap<>();

        s = s.toLowerCase().replace(".", "").replace(",", "");

        for (String word : s.split("\\s+")) {
            if (!Arrays.asList(stop).contains(word))
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        map.entrySet().stream()
           .sorted((x, y) -> y.getValue() - x.getValue())
           .forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
            "The mentor was great, the session was great and clear."
        );
    }
}