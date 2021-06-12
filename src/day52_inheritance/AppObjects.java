package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("youtube");
        mobileApp.useApp(10);

        Instagram instagram = new Instagram();
        instagram.setName( "Instagram");
        instagram.useApp(20);

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.useApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());

    }
}
