package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("CyberCats");
        // print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Alisa");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Berk");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().toString());
        group1.removeMember("Pavel");
        group1.removeMember("Parvin");
        System.out.println(group1.getMembers().toString());
        System.out.println(group1.getMembers().size());
        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Andreea", "Andrei", "Bulent"));
        System.out.println("group 2 memmbers = " + group2.getMembers());

        // check if Akrem is in the group
        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of group2");
        }else{
            System.out.println("Akrem is not a member of group 2");
        }


    }
}
