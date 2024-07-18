/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.proven.santaniello.sockets;

import cat.proven.santaniello.sockets.ServerClass;

/**
 *
 * @author Alessandro
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 10005;
        ServerClass myServer = new ServerClass(port);
        System.out.println("Server is started. Awaiting connection");
        myServer.init(); //Init the server and wait for connection
        
    }
}
