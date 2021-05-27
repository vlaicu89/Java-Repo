package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        secretPassword("cybertekStudent", "abc123");
        System.out.println(logic("cybertekStudent", "abc123"));
    }

    public static void secretPassword(String username, String password) {
        if(username.equals("cybertekStudent") && password.equals("abc123")){
            System.out.println("Login Succesfull, welcome cybertekStudent");

        }else{
            System.out.println("Inncorect username or password");
        }
      ////////////////////////// 2-nd Method/////////////////////////////



    }
    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)){
            System.out.println("Succefull");
        }else{
            System.out.println("incorrect");
        }
    }            /////////////////////// Non-Void with Boolean. ///////////////////////

    public static boolean logic(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)){
            return true;
        }else{
            return false;
        }

    }

}
