/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author alessandro
 */
public class MainClient {

    public static void main(String[] args) {
        boolean wait = false;
        String message = "";
        BufferedReader entradaEstandar = new BufferedReader(new InputStreamReader(System.in)); //Lector de teclado
        try {
            Socket s = new Socket("127.0.0.1", 10005); //mario 191 //roger 186
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            dos.writeUTF("Usuari conectat desde " + s.getLocalAddress() + " port " + s.getLocalPort());
            while (message.equalsIgnoreCase("QUIT") == false) {

                if (wait == false) {
                    System.out.println("Introduce mensaje: ");
                    message = entradaEstandar.readLine();
                    dos.writeUTF(message);
                    wait = true;
                }

                if (wait == true) {
                    System.out.println("Esperando respuesta... ");
                    message = dis.readUTF();
                    if (message.equalsIgnoreCase("QUIT") == false) {
                        System.out.println(s.getInetAddress() + ": " + message);
                    }
                    wait = false;
                }
            }
            
            s.close();
        } catch (ConnectException ex) {
            System.err.println("No s'ha trobat el servidor");
        } catch (SocketException ex) {
            System.err.println("Connexió finalitzada");
        } catch (IOException ex) {
            System.err.println("Error I/O: " + ex.getMessage());
        }
    }
}
