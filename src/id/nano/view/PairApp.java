package id.nano.view;

import id.nano.model.Pair;

public class PairApp {
    public static void main(String[] args) {

       Pair<String, Integer> pair = new Pair<String, Integer>("nano", 23);
       System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }


}
