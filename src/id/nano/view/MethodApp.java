package id.nano.view;

import id.nano.model.GenericMethod;
import id.nano.model.MyData;

public class MethodApp {
    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();

        String[] names = {"nano", "niko"};
        Boolean[] bools = {true, false, true, false, false};

        System.out.println(genericMethod.count(names));
        System.out.println(genericMethod.<String>count(names));
        System.out.println(genericMethod.count(bools));

        //Covariant
        MyData<Integer> data = new MyData<>(233);
        doit(data);

        MyData<? extends Object> datas = data;
        datas.getData();

    }

    public static void doit(MyData<? extends Object> data) {
        System.out.println(data.getData());
        //Hanya bisa Method get
    }
}
