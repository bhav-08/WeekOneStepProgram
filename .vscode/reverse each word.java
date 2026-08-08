class Main {
    static String reverseEachWord(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words)
            result.append(new StringBuilder(word).reverse()).append(" ");

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}