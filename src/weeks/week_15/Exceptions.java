package weeks.week_15;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {

        try {
            ioexception();
        } catch (IOException e) {
            System.out.println("The IOException handled");
        }
        runtimeException();
    }

    private static void runtimeException() throws RuntimeException {
        System.out.println("IOException handled");
        throw new RuntimeException();
    }

    private static void ioexception() throws IOException {
        throw new IOException("This is a runtime exception by inar");
    }
}
