/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.proven.santaniello.sockets;

/**
 *
 * @author Alessandro
 */
public class MainClient {

    public static void main(String[] args) {
        String hostIp = "127.0.0.1";
        int port = 10005;
        ClientClass myClient = new ClientClass(hostIp, port);
        System.out.println("Client is started");
        myClient.init();
    }
}
