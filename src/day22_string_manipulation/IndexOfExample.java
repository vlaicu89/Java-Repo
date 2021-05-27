package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven";
        System.out.println(technologies.indexOf(",")); // position 4. // first comma.
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava); // position 0 --> deoarece e la inceput.

        int idOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idOfCss); // position 12.

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index " +  indexOfSql);

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven")> -1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
