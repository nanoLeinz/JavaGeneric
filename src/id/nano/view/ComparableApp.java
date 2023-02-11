package id.nano.view;

import id.nano.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] persons = {
                new Person("niko","Indonesia"),
                new Person("nano","Indonesia"),
                new Person("leinz","Indonesia")
        };

        Arrays.sort(persons);
        List<String> names = new ArrayList<String>();
        for (var name:persons
             ) {
            names.add(name.getName());
        }

        System.out.println(names);
    }
}
