public class E2 {
    public static void main(String[] args) {
        String str = "Call me at 1-800-JAVA-LIFE";
        System.out.println(str.replaceAll("[^A-Za-z]", "").length());

    }
}
