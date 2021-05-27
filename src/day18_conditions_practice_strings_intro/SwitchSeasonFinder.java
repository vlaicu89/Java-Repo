package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 13;
        if( month == 12 || month == 1 || month == 2){
            System.out.println("Winter");

        }else{
            System.out.println("Error");
        }

        switch(month){
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2 :
                System.out.println("Winter");
                break;
        }

        switch(month){
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            default:
                System.out.println("Invalid month " + month);
        }
    }
}
