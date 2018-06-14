/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsclient;

/**
 *
 * @author Phosphor
 */
public class ClientProtocol {
    
    private static final int WAITING = 1;
    private static final int SENT_STDNO = 2;
    private static final int SENT_NAME = 3;
    private static final int SENT_FACULTY = 4;
    private static final int SENT_COURSE = 5;
    
    public void returnResponse(int status) {
        if (status == WAITING) {
            System.out.println("Status: Waiting");
        } else if (status == SENT_STDNO) {
            System.out.println("Status: Sent Student Number");
        } else if (status == SENT_NAME){
            System.out.println("Status: Sent Student Name");
        } else if (status == SENT_FACULTY) {
            System.out.println("Status: Sent Faculty Details");
        } else if (status == SENT_COURSE) {
            System.out.println("Status: Sent Course Details");
        }
    }
    
}
