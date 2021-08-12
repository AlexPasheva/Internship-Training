import java.io.*;
import java.net.Socket;

import static java.lang.System.out;

public class Client {
    public void start(int port) {
        try (Socket socket = new Socket("localhost", port);
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream, true);) {

            out.println("(client) Connecting..");
            printWriter.write(340);
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
