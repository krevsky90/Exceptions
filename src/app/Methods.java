package app;

/**
 * Created by krevsky on 02.01.2015.
 */
public class Methods {
    public void method1() throws Exception1 {
        String message = "method1 is called";
        String throwMessage = message + " exception";
        System.out.println(message);
        try {
            method2();
        } catch (Exception2 ex2) {
            throw new Exception1(ex2, throwMessage);
        }
    }

    public void method2() throws Exception2 {
        String message = "method2 is called";
        System.out.println(message);
        String throwMessage = message + " exception";
        try {
            method3();
        } catch (Exception3 ex) {
            throw new Exception2(ex, throwMessage);
        }
    }

    public void method3() throws Exception3 {
        String message = "method3 is called";
        System.out.println(message);
        String throwMessage = message + " exception";
        throw new Exception3(throwMessage);
    }
}
