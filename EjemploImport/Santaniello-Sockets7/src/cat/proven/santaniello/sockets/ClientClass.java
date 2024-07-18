/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.proven.santaniello.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class ClientClass {

    String hostIp;
    int port;
    int optionServer;
    boolean serverAwaiting = false;
    Socket s;
    String message;
    DataInputStream dis;
    DataOutputStream dos;

    public ClientClass(String hostIp, int port) {
        this.hostIp = hostIp;
        this.port = port;
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHostIp() {
        return hostIp;
    }

    public int getPort() {
        return port;
    }

    public void init() {
        try {
            s = new Socket(this.hostIp, this.port);
            this.dos = new DataOutputStream(s.getOutputStream());
            this.dis = dis = new DataInputStream(s.getInputStream());
            dos.writeUTF("Usuari conectat desde " + s.getLocalAddress() + " port " + s.getLocalPort());
            while (optionServer != 4) {
                runClient();
            }
        } catch (SocketException ex) {
            System.err.println("Error de connexio: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error I/O: " + ex.getMessage());
        }
    }

    private int menu() {
        int op = 0;
        while (op == 0) {
            try {
                if (!this.serverAwaiting) {
                    System.out.println("Awaiting for server...");
                    op = this.dis.readInt();
                    this.optionServer = op;
                    this.serverAwaiting = true;
                } else {
                    op = this.optionServer;
                    if (op == 4) {
                        break;
                    }
                }
                return op;
            } catch (IOException ex) {
                System.err.println("I/O Exception: " + ex.getMessage());
            }
        }
        return op;
    }

    private void runClient() {
        int op = 0;
        Scanner scan = new Scanner(System.in);
        while (op != 4) {
            try {
                op = menu();
                switch (op) {
                    case 1:
                        if (serverAwaiting) {
                            System.out.print("Diguem enter: ");
                            int i = scan.nextInt();
                            dos.writeInt(i);
                            this.serverAwaiting = false;
                        }
                        break;
                    case 2:
                        if (serverAwaiting) {
                            System.out.print("Diguem Double: ");
                            double d = scan.nextDouble();
                            dos.writeDouble(d);
                            this.serverAwaiting = false;
                        }
                        break;
                    case 3:
                        if (serverAwaiting) {
                            System.out.print("Diguem Char: ");
                            String linea = scan.nextLine();
                            char c = linea.charAt(0);
                            dos.writeChar(c);
                            this.serverAwaiting = false;
                        }
                        break;
                    case 4:
                        System.out.println("Server closed...");
                        dis.close();
                        dos.close();
                        s.close();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Error amb la dada introduida. Torna a introduir");
                break;
            } catch (IOException ex) {
                System.err.println("S'ha perdut la connexio.");
                break;
            }
        }

    }

}
