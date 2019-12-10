package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

import javax.sound.sampled.Port;

public class Main {

        public static final int PORT_NUMBER = 6014;
    
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient <hostname>");
            return;
        }
        DatagramSocket socket = new DatagramSocket();
    }  
        writeFile();
        isDone();
        socket.close();
    }

    private void start() {
        // DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
        byte[] buf = new byte[1028];
        InetAddress address = InetAddress.getByName(args[0]);
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, PORT_NUMBER);
        socket.send(packet);
  }
}