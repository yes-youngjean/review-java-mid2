package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        //Object형 박스
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);
        
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //괜찮아 보이지만, String->Integer 캐스팅 예외 발생 가능함
    }
}
