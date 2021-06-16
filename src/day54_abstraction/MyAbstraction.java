package day54_abstraction;

public abstract class MyAbstraction {
    int num = 55;
    public void learn(){
        System.out.println("Learning");
    }
    public abstract void method1();

    }

   class Sub extends MyAbstraction {
       @Override
       public void method1() {
           System.out.println("Close  - abstract method implementation");

       }


       }


  class MyObjects{
      public static void main(String[] args) {
        //  MyAbstraction mac = new MyAbstraction(); --->>> will not work, cant create objects with abstraction
         Sub sub = new Sub();
         sub.learn();
      }
  }
