class compareString {
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "abc";
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1==str2");
        } else if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("str1>str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1<str2");
        }
    }
}