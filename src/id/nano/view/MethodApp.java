package id.nano.view;

import id.nano.model.GenericMethod;

public class MethodApp {
    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();

        String[] names = {"nano","niko"};
        Boolean[] bools = {true,false,true,false,false};

        System.out.println(genericMethod.count(names));
        System.out.println(genericMethod.<String>count(names));
        System.out.println(genericMethod.count(bools));

    }
}
