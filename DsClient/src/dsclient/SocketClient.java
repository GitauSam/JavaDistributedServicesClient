package dsclient;

import java.net.*;
import java.io.*;
import java.util.*;

public class SocketClient {
    
    String hostName = DsClient.hostName;
    int port = DsClient.port;
    private ArrayList<String> studentDetails = new ArrayList<>();
    
    public SocketClient() {
    }
    
    public void runClient() {
        studentDetails.add(ClientGUI.studentDetails.get(0));
        studentDetails.add(ClientGUI.studentDetails.get(1));
        studentDetails.add(ClientGUI.studentDetails.get(2));
        studentDetails.add(ClientGUI.studentDetails.get(3));
        studentDetails.add(ClientGUI.studentDetails.get(4));
        studentDetails.add(ClientGUI.studentDetails.get(5));

        try (
            Socket socket = new Socket(hostName, port);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        ){  
            String fromServer, fromUser;
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            
            
            for(int index = 0;index<studentDetails.size();index++) {
                System.out.println(studentDetails.get(index));
            }
            
            System.out.println("Student Numner: " + studentDetails.get(0) + "\n" +
                                "First Number: " + studentDetails.get(1) + "\n" +
                                "Middle Number" + studentDetails.get(2) + "\n" +
                                "Surname: " + studentDetails.get(3) + "\n" +
                                "Faculty: " + studentDetails.get(4) + "\n" +
                                "Course: " + studentDetails.get(5) + "\n" );
                      
            fromUser = "Student Numner: " + studentDetails.get(0).trim() + "\n" +
                                "First Number: " + studentDetails.get(1).trim() + "\n" +
                                "Middle Number: " + studentDetails.get(2).trim() + "\n" +
                                "Surname: " + studentDetails.get(3).trim() + "\n" +
                                "Faculty: " + studentDetails.get(4).trim() + "\n" +
                                "Course: " + studentDetails.get(5).trim() + "\n" ;
            dataOutputStream.writeUTF(fromUser);

            System.out.println("\n\n--THE END--");
        
        } catch (Exception e) {
            
        }
    }

}
