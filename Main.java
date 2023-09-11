import com.sun.org.apache.bcel.internal.generic.SWAP;

// 859.亲密字符串
public class Main {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("avdgdsa");
        StringBuffer goal=new StringBuffer("advgdsa");
        System.out.println(exchange(s,goal));
    }
    public static boolean exchange(StringBuffer s,StringBuffer goal){
        int n=s.length(),m=goal.length();
        int flag=0;
        if (n!=m){
            System.out.println("两个字符串长度不相等！");
            return false;
        }
        else {
            for(int i=0;i<n;i++){
                if (s.charAt(i)!=goal.charAt(i)){
                    char a=goal.charAt(i);
                    s.setCharAt(i,a);
                    flag++;
                }
            }
            String s1=new String(s);
            String goal1=new String(goal);
            if (flag==2){
                if (s1.equals(goal1)){
                    System.out.println("替换后相等");
                    return true;
                }
            }
        }
        return false;
    }
}