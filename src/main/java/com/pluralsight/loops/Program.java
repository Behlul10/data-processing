package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Person> myPeople = new ArrayList<>();
        ArrayList<Person> searchResults = new ArrayList<>();
        String userInput;


        myPeople.add(new Person("Charlie ", "Harmon", 45));
        myPeople.add(new Person("Gabriela ", "Gould", 34));
        myPeople.add(new Person("Margaret ", "Rose", 80));
        myPeople.add(new Person("Blanca", "Bailey", 32));
        myPeople.add(new Person("Everette", "Barber", 38));
        myPeople.add(new Person("Tracy", "Kane", 29));
        myPeople.add(new Person("Jared", "Deleon", 27));
        myPeople.add(new Person("Jaziel", "French", 24));
        myPeople.add(new Person("Tonia", "Logan", 22));
        myPeople.add(new Person("Aida", "Hutchinson", 29));


        System.out.print("Enter the first or last name you would like to search: ");
        userInput = myScanner.nextLine();

        for (Person item : myPeople) {
            if (item.firstName.equals(userInput) || item.lastName.equals(userInput)) {
                searchResults.add(item);
            }
        }
        if (searchResults.size() == 0) {
            System.out.println("Nothing was found in search results");
        }
        else {
            for(Person item : searchResults) {
                System.out.println(item.display());
            }
        }

    }
}
