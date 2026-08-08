class Main {
    static String normalizeCode(String s) {
        s = s.trim();
        return s.substring(0, 3).toUpperCase() + s.substring(3);
    }

    static String validateAndFormat(String s) {
        if (s.length() != 13)
            return "Invalid: wrong length";

        for (int i = 0; i < 3; i++)
            if (!Character.isLetter(s.charAt(i)))
                return "Invalid: publisher code must be 3 letters";

        for (int i = 3; i < 13; i++)
            if (!Character.isDigit(s.charAt(i)))
                return "Invalid: body must contain digits";

        return "[" + s.substring(0, 3) + "] YEAR: " +
               s.substring(3, 7) + " | CATALOG: " + s.substring(7);
    }

    public static void main(String[] args) {
        String s = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(s));
    }
}