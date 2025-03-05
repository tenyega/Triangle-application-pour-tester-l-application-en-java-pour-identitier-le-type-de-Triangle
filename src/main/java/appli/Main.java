package appli;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(100.0f);

        String result= triangle.checkTriangle();
        System.out.println(triangle.getSide1());
        System.out.println(triangle.getSide2());
        System.out.println(triangle.getSide3());

        System.out.println("Triangle result: " + result);
    }
}