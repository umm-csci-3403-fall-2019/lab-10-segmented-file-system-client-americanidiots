package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.*;
import java.nio.Buffer;
import java.util.Map;

import javax.sound.sampled.Port;


//Main should send/receive packet
//Main should check file ID
//Main should map file ID->Client file object

public class Main {

        public static final int PORT_NUMBER = 6014;
        public static final String ADDRESS = "csci-4409.morris.umn.edu ";
    
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient <hostname>");
            return;
        }
        DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
    }


    private void start() {

        byte[] buf = new byte[1028]; // can be used like an array
        // ([array], [length of array], [server address], [port to connect to])
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ADDRESS, PORT_NUMBER);
        socket.send(packet);
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Quote of the Moment: " + received);

        
  }
}

