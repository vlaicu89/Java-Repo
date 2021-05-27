package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello"));
        String word = null;
        isNullOrEmpty(word);
        System.out.println(isNullOrEmpty(word));
        ///// 2nd method////////////
        word = "";
        System.out.println(isNullOrEmpty(word));

    }
    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }

}
