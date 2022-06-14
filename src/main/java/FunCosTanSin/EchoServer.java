package FunCosTanSin;

import java.net.*;
import java.io.*;

public class EchoServer {
public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
            }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
            }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {

            if(inputLine.equals("fun:sin")){
                TrigonSin trigonSin = new TrigonSin(inputLine);
                inputLine = in.readLine();
                Double a = trigonSin.Calcular(inputLine);
                System.out.println("Mensaje: " + a);
                outputLine = "Respuesta " + a ;
                out.println(outputLine);


            }else if (inputLine.equals("fun:tan")) {
                System.out.println("Cambio de funcion a Tan");
                inputLine = in.readLine();
                TrigonTan trigonTan = new TrigonTan(inputLine);
                Double a = trigonTan.Calcular(inputLine);
                System.out.println("Mensaje: " + a);
                outputLine = "Respuesta " + a ;
                out.println(outputLine);

            }else{
                TrigonCos trigonCos = new TrigonCos(inputLine);
                inputLine = in.readLine();
                Double a = trigonCos.Calcular(inputLine);
                System.out.println("Mensaje: " + a);
                outputLine = "Respuesta " + a ;
                out.println(outputLine);

            }
            if (outputLine.equals("Respuestas: Bye."))
                break;
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}