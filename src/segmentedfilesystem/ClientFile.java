package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.sound.sampled.Port;
import javax.xml.crypto.Data;

//Client file should store header
//Client file should have sorted datamap
//Client file should add packet data
//client file should add packet header
//client file should have packet expecting num

public class ClientFile {
    static int packetTotal;
    static int packetAdded;
    static SortedMap<Integer, byte[]> clientMap = new TreeMap<>();

    public ClientFile() {
       
        // Set s = clientMap.entrySet();
        // Iterator i = s.iterator();
        // Object value;


    }

    //look at Main (adding packet to spec client) fo client
    //header packet and how it is stored in the client file
    //how to print client file
    //dispalying the final product.
    //how to test that.


    public boolean isDone() {
        return (packetTotal == packetAdded);

    }

    public static void addDataPacket(Packet p) {

        clientMap.put(p.packetNumber, p.fileData);
        packetAdded += 1;

        if (p.fileContents[0] % 4 == 3) {
            packetTotal = p.packetNumber;
        }
    }

    public static void addHeaderPacket(Packet p) {


    }

    public void fileContents() {
        //This returns all the files when they are done.

        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();
            value = m.getValue();
        }
        return value;
    }
}