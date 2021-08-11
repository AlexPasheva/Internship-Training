import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void start(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket client = serverSocket.accept();
             InputStream inputStream = client.getInputStream();) {

            System.out.println("server");
            System.out.println(inputStream.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
