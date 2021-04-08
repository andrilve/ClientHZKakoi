import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public DataOutputStream out;

    public Client() throws IOException {
        System.out.println("server work");
        try(Socket socket = new Socket("127.0.0.1", 32123)){
            System.out.println("Connecting whit server " + socket.getInetAddress() + " port " + socket.getPort());
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void out() throws IOException {
        System.out.println("I alive");
        out.writeInt(5);
    }

}

