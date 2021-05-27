package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        // video is 1 minute 57 seconds
        while(seconds<=157){
            System.out.println(seconds + " seconds");
            seconds++;
            Thread.sleep(100);
        }
        System.out.println("Finished watching video");

        int count = 5;
        while(count>=0){
            System.out.println("count - " + count);
            count++;
        }
        System.out.println("count finished");

        int unreadSMS = 10;
        System.out.println("i have total " +unreadSMS + " unread sms- es");
        while (unreadSMS>=0){
            System.out.println(unreadSMS);
            unreadSMS--;
        }
        System.out.println("No more unread messages");

    }
}
