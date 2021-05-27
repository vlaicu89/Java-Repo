package day19_claas_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String name = "Serghei";
        System.out.println(name.length());
        System.out.println("count " + name.length());
        System.out.println("wooden spoon".length());
        String firstName = "nadir";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if(password.length() >= 6){
            System.out.println("Valid");
        }else{
            System.out.println("Error");
        }
    }
}
