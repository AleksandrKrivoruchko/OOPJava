import source.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(2, 3);
        System.out.println(cn);
        ComplexNumber cn1 = new ComplexNumber(3, -2);
        System.out.println(cn + " + " + cn1 + " = " + cn.sum(cn1));
        System.out.println(cn + " - " + cn1 + " = " + cn.sub(cn1));
        System.out.println(cn + " * " + cn1 + " = " + cn.mul(cn1));
        System.out.println(cn + " / " + cn1 + " = " + cn.div(cn1));
    }
}
