//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//import java.util.Scanner;
//
//public class Client {
//    public static void main(String[] args) {
//
//        try {
//            Socket socket = new Socket("localhost",3000);
//            while (!socket.isClosed()) {
//                Scanner input = new Scanner(System.in);
//                String massege = input.next();
//                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//                dataOutputStream.writeUTF(massege);
//                dataOutputStream.flush();
//
//                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//                String msg = dataInputStream.readUTF();
//                System.out.println(msg);
//            }
//            socket.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    //remort sockert
//    //request to the server
//    //send the data
//    //close
//}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost" , 3000);
            while (!socket.isClosed()){
                Scanner input = new Scanner(System.in);
                String messege =input.nextLine();
                DataOutputStream dataOutStream = new DataOutputStream(socket.getOutputStream());
                dataOutStream.writeUTF(messege);
                dataOutStream.flush();

                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                String rep = dataInputStream.readUTF();
                System.out.println(rep);

            }
            socket.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//    remort sockert
//    //request to the server
//    //send the data
//    //close
}