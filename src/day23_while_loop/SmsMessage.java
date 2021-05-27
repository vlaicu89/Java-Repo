package day23_while_loop;

public class SmsMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] from Number<22223334444> Message:{let code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start +1, end));
        String sender = message.substring(start + 1, end);
        System.out.println("sender = " + sender);
        
        String mobile = message.substring(message.indexOf("<")+1, (message.indexOf(">")));
        System.out.println("mobile = " + mobile);
        
        String text = message.substring(message.indexOf("{")+1, (message.indexOf("}")));
        System.out.println("text = " + text);
        sender = sender.trim(); // remove the spaces.
        if(sender.equals("Nadir")){
            System.out.println("message from Nadir");
        }else{
            System.out.println("Someone else.");
        }
        


    }
}
