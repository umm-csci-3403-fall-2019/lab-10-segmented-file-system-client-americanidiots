package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.Buffer;

import javax.sound.sampled.Port;

public class Main {

        public static final int PORT_NUMBER = 6014;
    
    public static void main(String[] args) throws IOException {
        Main client = new Main();
        client.start();
    }

    private void start() throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
        byte[] buf = new byte[1028];

        try {
            in = new BufferedReader(new FileReader("one-liners.txt"));
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
        }   
        catch (FileNotFoundException e){
            System.err.println("Couldn't open quote file.  Serving time instead.");
        }
    }  
        socket.close();
    }
}