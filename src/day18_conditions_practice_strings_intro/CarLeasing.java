package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;

        //      if(make.equals("Mercedes") && model.equals("E350")){
        //        leasePrice = 500;
        //  }else if(make.equals("Mercedes") && model.equals("A")){
        //    leasePrice = 400;

        //    System.out.println("make = " + make);
        //    System.out.println("model = " + model);
        //   System.out.println("leasePrice = " + leasePrice);
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400;
            }
        } else {
            System.out.println("Invalid enter");
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
        {

            make = "Audi";
            model = "R1";
            leasePrice = 0.0;
            if (make.equals("Audi")) {
                if (model.equals("R1")) {
                    leasePrice = 665.0;
                } else if (make.equals("Audi")) {
                    if (model.equals("R5")) {
                        leasePrice = 765.0;
                    }
                    System.out.println("make = " + make);
                    System.out.println("model = " + model);
                    System.out.println("leasePrice = " + leasePrice);
                }
            }

        }
    }
}