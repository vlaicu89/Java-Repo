package day47_constructors;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    public Address(){
        System.out.println("Constructor address");
        street = "123 google st";
        city = "java";
        state = "WS";
        zipCode = "00000";
    }

    @Override
    public String toString() {
        return "Address{" +
                street + '\'' +
               city + '\'' +
                state + '\'' +
                zipCode + '\'' +
                '}';


    }
    //is a shortcut to initialize variables in same statement/ second constructor, overloaded constructor
    public Address(String street, String city, String state, String zipCode){
        this.street = street;
        // or 2nd method
        //setStreet(street);

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
