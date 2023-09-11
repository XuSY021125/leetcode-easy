public class Main {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println("被添加的字母是"+different(s,t));
    }

    public static String different(String s,String t){
        int sums = 0,sumt = 0;
        for (int i = 0; i < s.length(); i++) {
            sums += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sumt += t.charAt(i);
        }
        int a = sumt - sums;
        char c = (char)a;
        String b = String.valueOf(c);
        return b;
    }
}