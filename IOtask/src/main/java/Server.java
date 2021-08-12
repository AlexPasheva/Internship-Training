import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void start(int port, clientSocket) {
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket client = serverSocket.accept();
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {

            
            System.out.println("server");
            System.out.println(inputStream.read());
            
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
