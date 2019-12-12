package segmentedfilesystem;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

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

        ClientFile f0 = new ClientFile();
        ClientFile f1 = new ClientFile();
        ClientFile f2 = new ClientFile();

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient <hostname>");
            return;
        }

    }


    private void start() throws IOException {

        DatagramSocket socket = new DatagramSocket(PORT_NUMBER);

        byte[] buf = new byte[1028]; // can be used like an array
        // ([array], [length of array], [server address], [port to connect to])
        DatagramPacket packet = new DatagramPacket(buf, PORT_NUMBER);
        socket.send(packet);

        //should be data.length instead of buf.length. it is the amount of data in the buffer
        //the buffer size won't change
        socket.receive(packet);
        String clientFile = "f"+Integer.toString(x);
        
        //check the file to make sure if its a header or a data packet
        if(buf[0] % 2 == 0){
            f0.addHeaderPacket(Packet.makeHeaderPacket(packet, packet.getLength()));
        }
        else{
            // Packet.makeDataPacket(packet,packet.getLength());
            ClientFile.addDataPacket(Packet.makeDataPacket(packet, packet.getLength()));
        }


        String received = new String(packet.getData(), 0, packet.getLength());

        int x = buf[1];
        

        clientFile.addPacket(packet);

        
        
            
  }
}

