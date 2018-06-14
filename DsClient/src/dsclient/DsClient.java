package dsclient;

public class DsClient {
    
    static String hostName;
    static int port;
    
    public static void main(String[] args) {

        hostName = "127.0.0.1";
        port = 4747;
        
        String [] Args = {hostName, String.valueOf(port)};
        
        ClientGUI cgui = new ClientGUI();
        cgui.main(Args);
        
    }
    
}
