/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.proven.santaniello.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class ServerClass {

    int port;
    boolean connection;
    ServerSocket server;
    String message;
    DataInputStream dis;
    DataOutputStream dos;

    public ServerClass(int port) {
        this.port = port;
        this.connection = false;
        this.message = "";
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        try {
            server = new ServerSocket(this.port);
            Socket socket = server.accept(); //We start the server

            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());

            if (this.connection == false) { //Bloc per a capturar el missatge cuan s'espera una nova connexio
                this.message = dis.readUTF();
                System.out.println(socket.getInetAddress() + ": " + message);
                this.connection = true;
                this.message = "";
            }
            //After the users connects we run the main server
            if (this.connection == true) {
                do {
                    runServer();
                } while (this.connection);
            }

        } catch (SocketException ex) {
            System.err.println("Error de connexio: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error de connexio: " + ex.getMessage());
        }
    }

    private int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Demanar enter\n2) Demanar double\n3) Demanar char\n4) Sortir");
        int op = scan.nextInt();
        return op;
    }

    private void runServer() {
        int op = 0;
        while (op != 4) {
            op = menu();
            try {
                switch (op) {
                    case 1:
                        dos.writeInt(1);
                        awaitResponse(op);
                        break;
                    case 2:
                        dos.writeInt(2);
                        awaitResponse(op);
                        break;
                    case 3:
                        dos.writeInt(3);
                        awaitResponse(op);
                        break;
                    case 4:
                        dos.writeInt(4);
                        server.close();
                        System.out.println("Disconnected waiting for new client...");
                }
            } catch (Exception ex) {
                System.err.println("Error");
            }
        }
        init();
    }

    private void awaitResponse(int op) throws IOException {
        System.out.println("Awaiting client...");
        switch (op) {
            case 1:
                setMessage(String.valueOf(dis.readInt()));
                System.out.println("El client ha introduit: " + getMessage());
                break;
            case 2:
                setMessage(String.valueOf(dis.readDouble()));
                System.out.println("El client ha introduit: " + getMessage());
                break;
            case 3:
                setMessage(String.valueOf(dis.readChar()));
                System.out.println("El client ha introduit: " + getMessage());
                break;
        }
    }

}
