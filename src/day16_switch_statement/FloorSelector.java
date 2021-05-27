package day16_switch_statement;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 5;
        if(floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby,Verizon,Starbucks.");
        }else if(floorNum == 2){
            System.out.println("Floor 2 selected. Companies: lyft, BOF.");
        }else if(floorNum == 3){
            System.out.println("Floor 3 selected. Companies : Uber,CVS.");
        }else{
            System.out.println("Invalid floor - " + floorNum);

        }

        System.out.println("Switch statement version");

        floorNum = 8;
        switch (floorNum){
            case 1 : // same as if(floorNum == 1);
                System.out.println("Floor 1 selected. Companies: Lobby,Verizon,Starbucks.");
                break; // exit switch
            case 2:
                System.out.println("Floor 2 selected.Companies: Lyft");
                break; // esxit switch
            case 3:;
                System.out.println("Floor 3 selected. Companies : Uber.");
                break;
            default:;
                    System.out.println("Invalid enter.");
                    break;





        }
    }
}
