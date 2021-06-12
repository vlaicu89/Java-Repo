package day51_inheritance._super_keyword;

public class CallingLyft {
    public static void main(String[] args) {
        Lyft lyftRyde = new Lyft();
        LyftXL lxlRyde = new LyftXL();
        LyftLux lLux = new LyftLux();

        System.out.println("lyftRyde = " + lyftRyde.calculateRate(5));
        System.out.println("lyftRyde = " + lxlRyde.calculateRate(5));
        System.out.println("lyftRyde = " + lLux.calculateRate(5));

    }
}
