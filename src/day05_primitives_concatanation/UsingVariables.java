package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int a = 1;
        int b = a;
        System.out.println(a);
        System.out.println(b);   // will be 1 in both cases.

        //int h =1;
       // boolean k = a;  // will not work, boolean is only true or false.

        a = 2;
        System.out.println(a);
        System.out.println(b);  // here is 1 because we didnt change it to change b.

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inthirasZipCode = 22182;
        int parvinasZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinasZipCode);

        inthirasZipCode = 22001;
        System.out.println(inthirasZipCode);
        System.out.println(parvinasZipCode); // Here still the first one, cuz we didnt ask to change it.

        parvinasZipCode = 33131;
        System.out.println(inthirasZipCode);
        System.out.println(parvinasZipCode);


    }

    }
