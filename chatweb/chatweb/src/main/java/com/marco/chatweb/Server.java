package com.marco.chatweb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 */
public class Server {
    final Integer PORT=12345;
    private ServerSocket server;
    private Socket clientsocket;
    private BufferedReader read;
    private PrintWriter write;

    public Server(){
        try {
            server=new ServerSocket(PORT);
            System.out.println("El servidor se inicia en el puerto: "+PORT);
        } catch (Exception e) {
            System.out.println("Error al incial servidor en el puerto: "+PORT);
        }
    }

    public void startServer(){
        try {
            clientsocket=server.accept();
            read=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
            write=new PrintWriter(clientsocket.getOutputStream(), true);
            String mensajeCliente = read.readLine();
            System.out.println("Mensaje del cliente: " + mensajeCliente);

                    // Enviar respuesta al cliente
            write.println("Hola desde el servidor");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}