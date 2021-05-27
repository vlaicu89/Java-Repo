package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("java" + 5  + 3); // nu o sa calculeze, o sa fie java53.
        System.out.println("java" + (5 + 3)); //punem paranteze si o sa faca calculul. (java8)
        System.out.println(5 +3 + "java"); // aici deja se face calculul,caci cifrele sunt la inceput. (8java)
        System.out.println(5 + (3 + "java")); // aici parantezele o sa fie primele. (53 java)

        System.out.println("hello" + 1 + 2 + 3); //hello123
        System.out.println("hello" + (1 + 2 + 3)); //hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + " " + str2); // asa se pune spatiul.

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2); //7 8
        System.out.println(num1 +""+ num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2); // aici da valoare lui a si b din tablea care le da numere. (195)

        System.out.println(char1 + "" + char2); // aici parantezele transforma totul in String,nu se face calcul. (ab)
    }

    }
