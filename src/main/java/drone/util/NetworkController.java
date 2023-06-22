package drone.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*public class NetworkController implements Runnable
{
    private Socket socket = null;

    @Override
    public void run()
    {
        socket = verbindungAufbauen("127.0.0.1", 10666);

        do
        {
            System.out.println(extrahiereHoehe(sendeKommandoUndWarteAufAntwort(socket, "GET_DATA")));
            sendeKommandoUndWarteAufAntwort(socket, "ADD_FORCE");
            schlafen(100);
        }
        while (true);
    }

    private String sendeKommandoUndWarteAufAntwort(Socket socket, String kommando)
    {
        PrintWriter aus = null;
        BufferedReader ein = null;
        try
        {
            aus = new PrintWriter(socket.getOutputStream());
            ein = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            aus.println(kommando);
            aus.flush();
            return ein.readLine();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    private Socket verbindungAufbauen(String host, int port)
    {
        Socket newSocket = null;
        try
        {
            newSocket = new Socket(host, port);
        }
        catch (UnknownHostException e)
        {
            System.out.println(Strings.FEHLER_IP_ADRESSE);
        }
        catch (IOException ee)
        {
            System.out.println(Strings.IO_FEHLER_BEI_VERBINDUNGSAUFBAU);
        }
        catch (SecurityException eee)
        {
            System.out.println(Strings.VERBINDUNGSAUFBAU_NICHT_ERLAUBT);
        }
        catch (IllegalArgumentException eeee)
        {
            System.out.println(Strings.ILLEGALER_PORT);
        }
        finally
        {
            return newSocket;
        }
    }
}*/
