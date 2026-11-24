package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Person> myPeople = new ArrayList<>();
        ArrayList<Person> searchResults = new ArrayList<>();
        String userInput;
        float totalAge = 0;

        //MAKE 10 PEOPLE
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


        //Initilize the youngest and oldest with the first person on the list to compare
        int OldestAge = myPeople.get(0).age;
        Person oldestPerson = myPeople.get(0);

        int youngestAge = myPeople.get(0).age;
        Person youngest = myPeople.get(0);


        System.out.print("Enter the first or last name you would like to search: ");
        userInput = myScanner.nextLine();

        for (Person item : myPeople) {
            if (item.firstName.equals(userInput) || item.lastName.equals(userInput)) {
                searchResults.add(item);
            }
            if (item.age < youngestAge) {
                youngest = item;
                youngestAge = item.age;
            }
            if (item.age > OldestAge) {
                oldestPerson = item;
                OldestAge = item.age;
            }
            totalAge += item.age;
        }

        System.out.println("############### Search Results ################");
        if (searchResults.size() == 0) {
            System.out.println("Nothing was found in search results");
        }
        else {
            for(Person item : searchResults) {
                System.out.println(item.display());
            }
        }

        System.out.printf("""
                ################## People Analytics ###################
                The oldest person is: %s with an age of %d
                
                The youngest Person is %s with an age of %d
                
                The average age is: %.0f
                """, (oldestPerson.firstName + " " + oldestPerson.lastName), oldestPerson.age,  (youngest.firstName + " " + youngest.lastName), youngest.age, (totalAge / myPeople.size()));

    }
}
