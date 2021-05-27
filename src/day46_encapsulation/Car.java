package day46_encapsulation;

public class Car {
    // encapsulated/ hidden instance variables
    private String model;
    private int year;
    private int millage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel(){
        return model;

    }
    //setter for year
    public void setYear(int yearModel){
        year = yearModel;
    }
    //getter for year
    public int getYear(){
        return year;
    }
    //setter for millage
    public void setMillage(int carMileage){
        millage = carMileage;
    }
    //getter for millage
    public int getMillage(){
        return millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", millage=" + millage +
                '}';
    }
}

