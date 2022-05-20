import java.io.*;
import java.net.*;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(int port) throws IOException {
        System.out.println("Connecting to Server");

        clientSocket = new Socket("127.0.0.1", port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("Connected to Server");
    }

    public void stopConnection() throws IOException {
        System.out.println("Closing connection");

        clientSocket.close();

        System.out.println("Connection closed");
    }

    public void action1() throws IOException {
        out.println("1");

        System.out.println(in.readLine());
    }

    public void action2() throws IOException {
        out.println("2");

        System.out.println(in.readLine());
    }
}
