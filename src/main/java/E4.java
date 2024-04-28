public class E4 {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if(str.equals(reversedStr)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
