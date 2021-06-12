package day52_inheritance;

import javax.jws.soap.SOAPBinding;

public class Admin extends User {
    public Admin() {
        super(); // call super class/user no args constructor
    }

    public String toString() {



            return "discordUsers{" +
                    "role='" + getRole() + '\'' +
                    ", name='" + getName() + '\'' +
                    ", id=" + getId() +
                    '}';
        }
    }
