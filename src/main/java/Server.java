//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Server {
//
//    public static void main(String[] args) {
//
//        try {
//            //Server Socket
//            ServerSocket serverSocket = new ServerSocket(3000);
//            //Local Socket
//            Socket socket = serverSocket.accept();
//
//            while (!socket.isClosed()) {
////                System.out.println("Client Accepted");
//
//                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//                String message = dataInputStream.readUTF();
//                System.out.println(message);
//
//                Scanner input = new Scanner(System.in);
//                String massege = input.next();
//                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//                dataOutputStream.writeUTF(massege);
//                dataOutputStream.flush();
//                //sout
//
//            }
//            socket.close();
//            //close
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            while (!socket.isClosed()){
               // System.out.println("Client accepted");

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

                String msg = dataInputStream.readUTF();
                System.out.println(msg);


                Scanner input = new Scanner(System.in);
                String mm =input.next();
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF(mm);
                dataOutputStream.flush();

            }
            socket.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}