package test;

import main.EchoClient;
import main.GreetClient;
import org.junit.After;
import org.junit.Before;
//import static org.assertj.core.api.Assertions.*;
//import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;


public class UnitTests {
//    @Test
//    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
//        GreetClient client = new GreetClient();
//        client.startConnection("127.0.0.1", 6666);
//        String response = client.sendMessage("hello server");
//        assertEquals("hello client", response);
//    }
    EchoClient client;

//    @Ignore
//    @Before
//    public void setup() throws IOException {
//        client = new EchoClient();
//        client.startConnection("127.0.0.1", 3333);
//    }
//
//    @Ignore
//    @Test
//    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
//        String resp1 = client.sendMessage("hello");
//        String resp2 = client.sendMessage("world");
//        String resp3 = client.sendMessage("!");
//        String resp4 = client.sendMessage(".");
//
//        assertEquals("HELLO", resp1);
//        assertEquals("WORLD", resp2);
//        assertEquals("!", resp3);
//        assertEquals("good bye", resp4);
//    }
//
//    @Ignore
//    @After
//    public void tearDown() throws IOException {
//        client.stopConnection();
//    }

    @Test
    public void givenClient1_whenServerResponds_thenCorrect() throws IOException {
        EchoClient client1 = new EchoClient();
        client1.startConnection("127.0.0.1", 4444);
        String msg1 = client1.sendMessage("hello");
        String msg2 = client1.sendMessage("world");
        String terminate = client1.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }

    @Test
    public void givenClient2_whenServerResponds_thenCorrect() throws IOException {
        EchoClient client2 = new EchoClient();
        client2.startConnection("127.0.0.1", 3333);
        String msg1 = client2.sendMessage("hello");
        String msg2 = client2.sendMessage("world");
        String terminate = client2.sendMessage(".");

        assertEquals(msg1, "hello");
        assertEquals(msg2, "world");
        assertEquals(terminate, "bye");
    }

}
