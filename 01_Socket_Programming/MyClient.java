import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            dos.writeUTF("Hello Server! Connection Successful.");
            dos.flush();
            
            dos.close();
            s.close();
            System.out.println("Message sent to server.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
