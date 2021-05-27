package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {


    int[] data = {33, 11, 66, 112, 34, 763, 122,123,765,654};
    for(int eachNum : data){
        System.out.println(eachNum);
    }

    /////////////////////// 2 method ////////////////////

     for(int i=0;i<data.length;i++){
         System.out.println(data[i]); // here we do like that   (data[i]).
     }

     for(int i = data.length-1; i >=0;i--){
         System.out.println(data[i]);
     }




}
}