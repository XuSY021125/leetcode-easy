public class Main {
    public static void main(String[] args) {
        String s="bcdef";
        String goat="efbcd";
        rotateString(s,goat);
    }
    public static boolean rotateString(String s,String goat){
        int n=s.length(),m=goat.length();
        int i,j;
        boolean flat;
        if (n != m){
            System.out.println("两个字符串长度不同，不可能旋转成一样");
            return false;
        }
        for (i=0;i<goat.length();i++){
            flat=true;
            for (j=0;j<goat.length();j++){
                if (s.charAt((i+j)%n)!=goat.charAt(j)){
                    flat=false;
                    break;
                }
            }
            if (flat){
                System.out.println("字符串s在旋转若干次后能变成字符串goat");
                return true;
            }
        }
        System.out.println("字符串s不能旋转成字符串goat");
        return false;
    }
}