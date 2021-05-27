package day19_claas_vs_object_string;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Diana";
        System.out.println(word.startsWith("D"));
        System.out.println(word.startsWith("Dia")); //Examples for startWith.
        System.out.println(word.startsWith("I"));

        String name = "Serghei";
        System.out.println(name.endsWith("i"));
        System.out.println(name.endsWith("erghei")); //Examples for endsWith.
        System.out.println(name.endsWith("w"));

        System.out.println("java".startsWith("j"));
        System.out.println(name.startsWith("ser")); //False because case sensitive.
    }
}
