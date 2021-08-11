import java.io.*;
import java.net.Socket;

import static java.lang.System.out;

public class Client {
    public void start(int port) {
        try (Socket socket = new Socket("localhost", port);
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream, true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            out.println("(client) Connecting..");
            printWriter.write(340);
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if (".".equals(inputLine)) {
                    out.println("good bye");
                    break;
                }
                out.println(inputLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
