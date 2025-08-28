package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        //Integer형 박스
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        //String형 박스
        StringBox stringBox = new StringBox();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
