package day57_abstraction_polymorphism.abstract_vs_interface;

public interface InterfaceA  {
    public static final String TYPE= "interface";
    public abstract void absMethod(int num);

    public static void staticMethodE(String str){
        System.out.println("this method is called with str - " + str);
    }
    public default void defaultMethodF(){
        System.out.println(" this method is called");
    }
}
