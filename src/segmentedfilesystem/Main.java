package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.*;
import java.nio.Buffer;
import java.util.Map;

import javax.sound.sampled.Port;

public class Main {

        public static final int PORT_NUMBER = 6014;
        public static final String ADDRESS = "csci-4409.morris.umn.edu ";
    
    public static void main(String[] args) throws IOException {
        Map<Integer, Byte []> map0 = new HashMap<>();
        Map<Integer, Byte []> map1 = new HashMap<>();
        Map<Integer, Byte []> map2 = new HashMap<>();

        ClientFile f1 = new ClientFile();
        f1.addPacket(buf);

        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient <hostname>");
            return;
        }
        DatagramSocket socket = new DatagramSocket(PORT_NUMBER);
    }
    // writeFile();
    // isDone();
    // socket.close();
    // }

    private void start() {
        byte[] buf = new byte[1028]; // can be used like an array
        // ([array], [length of array], [server address], [port to connect to])
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ADDRESS, PORT_NUMBER);
        socket.send(packet);

        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Quote of the Moment: " + received);

        // sort as we go

        //This is packet status Header or Data
        int x = buf[0];

        //This says what file the packet belongs to
        int y = buf[1];

        //This identifies the packet 
        if(x % 2 == 0) {
            //means its a header packet
            //place header into the correct file
            if(y==0){
                map0.put();
            }
            if(y==1){
                map1.put(packet);
            }
            if(y==2){
                map2.put(packet);
            }
        }
        else {
            //means this is a data packet
            if(x % 4 == 1) {
                // int 
                //last data packet
                if(y==0){
                    packetnum0 = lastdatapacketnum;
                    map0.put(packet);
                }
                if(y==1){
                    packetnum1 = lastdatapacketnum;
                    map1.put(packet);
                }
                if(y==2){
                    packetnum2 = lastdatapacketnum;
                    map2.put(packet);
                }

                //pass last two bytes to the isDone method to check if there are that many
                //files, if so then file is compelete, else continue
                packetnum = buf[3]*256+buf[4]
            }
            else {
                //not the last packet, place where it needs to go in the (file) map
            }
        }
  }
}

