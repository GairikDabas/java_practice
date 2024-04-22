package Practice;

public class ReverseString {
    public static void main(String[] args) {
        String s1="abcde" , s2="";
        char ch;
        System.out.println("original string :" + s1);
        for(int i =0; i<s1.length();i++){
            ch=s1.charAt(i);
            s2=ch+s2;
        }
        System.out.println("reversed string :" + s2);
    }
}
