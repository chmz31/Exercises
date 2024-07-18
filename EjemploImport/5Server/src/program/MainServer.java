/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        boolean shouldWait = false;

        BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in)); //Lector de teclado
        String message = "";
        ServerSocket server = new ServerSocket(10005);
        System.out.println("Server is started");
        Socket socket = server.accept();
        do {
            try {
                if (shouldWait == false) {
                    System.out.println("Esperando mensaje... ");
                    DataInputStream dis = new DataInputStream(socket.getInputStream());
                    if (dis.read() != -1) {
                        message = dis.readUTF();
                        System.out.println(socket.getInetAddress() + ": " + message);
                        shouldWait = true;
                    }
                }

                //if (shouldWait == true) {
                //    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                //    System.out.println("Introduce mensaje: ");
                //    message = entradaEstandar.readLine();
                //    dos.writeUTF(message);
                //}
                //shouldWait = false;

            } catch (EOFException ex) {
                socket.close();
            } catch (SocketException ex) {
                System.out.println(socket.getInetAddress() + ": Usuari desconectat, esperant nova connexio");
                socket = server.accept();
            }
        } while (true);
    }

    /*private static int menu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quin tipus de dada demanem?\n1 - Demana un enter\n2 - Demana un double\n3 - Demana un caràcter\n4 - Sortir");
        return scan.nextInt();
    } */
}
