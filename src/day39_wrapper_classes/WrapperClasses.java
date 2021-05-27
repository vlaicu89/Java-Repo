package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num +=10;
        System.out.println("num = " + num);

        Integer n = new Integer(500);
        System.out.println("is n 500? = ?" + n.equals(500));
        System.out.println(n + 300);

        Integer intObject = 1000;
        System.out.println(intObject / 50);
        String str = intObject + "";
        String str1 = intObject.toString();
        System.out.println("str1 = " + str1);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short)40);
        Short sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3255L;

        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;

        Double d1 = new Double(345.3);
        Double d2 = 234.5;

        Boolean bo1 = new Boolean(true);
        Boolean bo2 = false;



    }
}
