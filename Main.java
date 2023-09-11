import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s="loveleetcode";
//        System.out.println("请输入目标字符：");
//        Scanner in=new Scanner(System.in);
        char c='l';
        int[] tochar=new int[s.length()];
        tochar=shortestToChar(s,c);
        System.out.println(Arrays.toString(tochar));
    }
    public static int[] shortestToChar(String s,char c){
        int[] array=new int[s.length()];
        int i,m,n,idx=1;
        for (i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                array[i]=0;
            }
            else {
                for (n=i-1;n>=0;n--){
                    if (s.charAt(n)!=c){
                        idx++;
                    }
                    else {
                        break;
                    }
                }
                if (idx==i+1){
                    array[i]=s.length()+1;
                }
                else {
                    array[i]=idx;
                }
                idx=1;
                for (m=i+1;m<s.length();m++){
                    if (s.charAt(m)!=c){
                        idx++;
                    }
                    else {
                        break;
                    }
                }
                if (idx==s.length()-i){
                      array[i]=Math.min(array[i],s.length()+1);
                }
                else {
                    array[i]=Math.min(array[i],idx);
                }
                idx=1;
            }
        }
        return array;
    }
}