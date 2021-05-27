package day19_claas_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek", expPassword = "ABC123", userName = "CYBERTEK", password = "Abc123";
        if (userName.equalsIgnoreCase(expUserName) && password.equalsIgnoreCase(expPassword)) {
            System.out.println("Pass - user successful logged in");
        } else {
            System.out.println("Invalid enter");
        }
        //or we can do like that
        if (userName.equalsIgnoreCase(expUserName) && password.equalsIgnoreCase(expPassword)) {
            System.out.println("Successful");

        } else {
            if (!userName.equalsIgnoreCase(expUserName)){
                System.out.println("Username invalid");

        }else  {
                System.out.println("Invalid entry");
            }
        }
    }
}