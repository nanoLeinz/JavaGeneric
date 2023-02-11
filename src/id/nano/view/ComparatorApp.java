package id.nano.view;

import id.nano.model.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("niko","Indonesia"),
                new Person("nano","Indonesia"),
                new Person("nano","Indonesia"),
                new Person("leinz","Indonesia"),
                new Person("leinz","Indonesia"),
                new Person("nano","Indonesia"),
                new Person("leinz","Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(persons,comparator);
        System.out.println(Arrays.toString(persons));
    }
}
