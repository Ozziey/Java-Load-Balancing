import java.io.*;
import java.net.*;

public class Client {
    private Socket clientSocket;

    public void startConnection(int port) throws IOException {
        System.out.println("Connecting to Server");

        clientSocket = new Socket("127.0.0.1", port);

        System.out.println("Connected to Server");
    }

    public void stopConnection() throws IOException {
        System.out.println("Closing connection");

        clientSocket.close();

        System.out.println("Connection closed");
    }
}
