public class Main {

    public static void main(String[] args) {
Box <Double, Integer> doubleIntegerBox = new Box<>(5.4, 8);
Box <Float, Float> floatFloatBox = new Box<>(3.3f,5.4f);

addition(doubleIntegerBox,floatFloatBox);
multiplication(doubleIntegerBox, floatFloatBox);
    }

    public static void addition(Box <? extends Number,? extends Number> a, Box <? extends Number,? extends Number> b ) {
        System.out.println(a.getNumber1().doubleValue()
                + a.getNumber2().doubleValue() + b.getNumber1().doubleValue() + b.getNumber2().doubleValue());
    }  public static void multiplication(Box <? extends Number,? extends Number> a, Box <? extends Number,? extends Number> b ) {
        System.out.println(a.getNumber1().doubleValue()
                * a.getNumber2().doubleValue() * b.getNumber1().doubleValue() * b.getNumber2().doubleValue());
    }

}
class Box <T extends Number, S extends Number>{
private T number1 ;
private S number2 ;

    public Box(T number1, S number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public S getNumber2() {
        return number2;
    }

    public void setNumber2(S number2) {
        this.number2 = number2;
    }
}
