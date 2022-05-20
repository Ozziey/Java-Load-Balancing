import java.net.*;
import java.io.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;


    public void start(int port) throws IOException {
        System.out.println("Starting server");

        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);

        System.out.println("Server connected");

        String request = in.readLine(); //Receive action request

        while (!request.equals("0")) {
            if(request.equals("1")) {
                System.out.println("Serving Action 1");
                request = "5";
            }
            else if(request.equals("2")) {
                System.out.println("Serving Action 2");
                request = "5";
            }
        }
    }

    public void stop() throws IOException {
        System.out.println("Closing server");

        clientSocket.close();
        serverSocket.close();

        System.out.println("Server closed");
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start(6464);

        server.stop();
    }
}
