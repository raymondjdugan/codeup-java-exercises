package arrays;

import OOP.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = new Person[people.length + 1];
        System.arraycopy(people, 0, newPeople, 0, people.length);
        newPeople[3] = person;
        return newPeople;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Ray");
        people[1] = new Person("Wesley");
        people[2] = new Person("Emilio");

        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person scott = new Person("Scott");
        people = addPerson(people, scott);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
