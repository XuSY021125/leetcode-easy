public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("第一个不重复的字符是"+onlyword(s));
    }

    public static int onlyword(String s){
        for (int i = 0; i < s.length(); i++) {
            int flat = 0;
            for (int j = 0; j < s.length(); j++) {
                if (i == j){
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)){
                    flat = 1;
                    break;
                }
            }
            if (flat == 0){
                return i;
            }
        }
        return -1;
    }
}
