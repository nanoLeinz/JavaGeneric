package id.nano.view;

import id.nano.model.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(23));
        MyData<?> niko = new MyData<>("nano");
        print(niko);

    }

    public static void print(MyData<?> data){
        System.out.println(data.getData());
    }
}
