package day37_methods_overloading;

import org.jetbrains.annotations.NotNull;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(19,1,32,5566,23);
    }
    public static void addNumbers(int @NotNull ... ints){
        int sum = 0;
        for(int n : ints){
            sum +=n;

        }
        System.out.println(sum);


    }
}