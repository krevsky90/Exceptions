import app.Exception1;
import app.Methods;

public class Main {
    public static void main(String[] args) throws Exception1 {
        Methods methods = new Methods();
        try {
            methods.method1();
        } catch (Exception1 ex1) {
            Exception tempEx = ex1;
            Throwable cause = null;
            while (tempEx.getCause() != null) {
                cause = tempEx.getCause();
                System.out.println(tempEx.getLocalizedMessage());
                if (cause instanceof Exception) {
                    tempEx = (Exception) cause;
                }
            }

            System.out.println(tempEx.getLocalizedMessage());
        }
    }
}
