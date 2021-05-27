package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        // using substring print first 3 lettrs.
        String list = "cat, car,cat, red car, java, selenium";
        System.out.println(list.substring(0,3));
        System.out.println(list.substring(1,4));
        System.out.println(list.substring(2,5));
        System.out.println(list.substring(3,6));
        System.out.println(list.substring(4,7));

        ////////////////// for method ////////////////

        for(int i = 0; i< list.length()-2; i++){
            System.out.println(list.substring(i, i+3) );


            if(list.substring(i,i+3).equals("cat") || list.substring(i,i+3).equals("car")){
                System.out.println("cat or cat found");
            }
        }
    }
}
