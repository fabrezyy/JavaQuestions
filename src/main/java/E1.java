public class E1 {
    public static void main(String[] args) {

        String string1 = "Lion";
        String string2 = "Parrot";

        string1 = string1 + string2;


        string2 = string1.substring(0,string1.length() - string2.length());


        string1 = string1.substring(string2.length());


        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
    }
}