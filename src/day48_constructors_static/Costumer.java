package day48_constructors_static;

public class Costumer {
    private String name;
    private int id;

    //no argument constructor
    public Costumer(){
        System.out.println("No-args Constructor");
        name = "new costumer";
        id = -1;
    }

    //add a constructor where we can assign name and id


    public Costumer(String name, int id) {
        System.out.println("2 args constructor");
        this.name = name;
        this.id = id;


}

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
