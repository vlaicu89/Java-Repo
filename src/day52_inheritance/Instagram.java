package day52_inheritance;

public class Instagram extends MobileApp {

    public void postPhoto(){
        super.useApp(10);
        System.out.println("Posting photo on Instagram");
    }

    public void useApp(int minutes){
        System.out.println("Using instagram app features");
        postPhoto();
    }

}

