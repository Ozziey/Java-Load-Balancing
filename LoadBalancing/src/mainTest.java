import java.io.IOException;

public class mainTest {
    public static void main(String[] args) throws IOException {
        Client cc = new Client();
        cc.startConnection(6464);
        cc.action1();
        cc.stopConnection();
    }
}
