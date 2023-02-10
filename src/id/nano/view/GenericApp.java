package id.nano.view;

import id.nano.model.MyData;

public class GenericApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("nano");
        MyData<Integer> integerMyData = new MyData<Integer>(23);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());


    }
}
