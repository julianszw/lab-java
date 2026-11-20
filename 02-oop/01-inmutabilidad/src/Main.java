//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int num1 = 8;
        System.out.println(num1);
        System.out.println(changeNumberValue(num1));
    }

    private static int changeNumberValue(int aNumber) {
        aNumber = 100;
        return aNumber;
    }
}