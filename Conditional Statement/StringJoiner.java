public class StringJoiner {
    public static String joinStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String result = joinStrings("Hello, ", "World!");
        System.out.println(result);
//        System.out.println(joinStrings("Hello, ", "World!"));
        String s1 = "";
        int i=100;
        int j=200;
        System.out.println(s1+i+j);//value will be the string 100200
        System.out.println(i+j+s1);//value will be the string 300(because of execution always from left side)
        
    }
}
