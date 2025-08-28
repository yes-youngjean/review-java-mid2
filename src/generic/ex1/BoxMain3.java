package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        //Generic => 궁극적으로 원하는 모든 타입에 사용 가능함.
        //즉, 컴파일 단계에서 타입 안정성(type-safety)을 보장

        //GenericBox -> Integer용으로 사용
        GenericBox<Integer> integerBox = new GenericBox<>(); //생성 시점에 T의 타입이 정해짐
        integerBox.set(10); //-> Integer 타입만 허용
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        //GenericBox -> String용으로 사용
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);
    }
}
