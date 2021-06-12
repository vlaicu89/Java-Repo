package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord.");
    }

    protected  boolean download(double version){
        System.out.println("Downloaded discord " + version);
        return true;
    }
    @Override
    public boolean download(){
        System.out.println("Downloaded Discord");
        return true;
    }
    @Override
    public void useApp(int minutes){
        super.useApp(minutes);
        chat("Vladislav");

    }
    public void printInfo(){
        System.out.println("App name "+ getName());
        System.out.println("App version " + getVersion());
    }
}
