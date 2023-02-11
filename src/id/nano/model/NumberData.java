package id.nano.model;

public class NumberData<T extends Number> {

    private T no;

    public NumberData(T no) {
        this.no = no;
    }

    public T getNo() {
        return no;
    }

    public void setNo(T no) {
        this.no = no;
    }
}
