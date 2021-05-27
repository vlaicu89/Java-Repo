package day19_claas_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
       String word = "java";
        System.out.println(word.equals("java"));
        System.out.println(word.equalsIgnoreCase("JAVA"));
        System.out.println(word.equalsIgnoreCase("Java1"));
    }
}
