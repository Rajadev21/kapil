public class StringDemo2 {
    public static void main(String[] args) {
        String str1= "madam";
        String str2 = new String("");
        System.out.println(str1 == str2);
        str2 = "m";
        System.out.println(str1 == str2);
        str2 = "ma";
        System.out.println(str1 == str2);
        str2 = "mad";
        System.out.println(str1 == str2);
        str2 = "mada";
        System.out.println(str1 == str2);
        str2 = "madam";
        System.out.println(str1 == str2);
    }
}
