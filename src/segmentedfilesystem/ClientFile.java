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

    public ClientFile(DatagramPacket packets) {
        SortedMap<Integer, byte[]> clientMap = new TreeMap<>();
        Set s = clientMap.entrySet();
        Iterator i = s.iterator();
        Object value;


    }


    public boolean isDone() {
        return (packetTotal == packetAdded);

    }

    public static void addPacket(DataPacket p) {

        clientMap.put(p.packetNumber, p.fileData);
        packetAdded += 1;

        if (p.fileContents[0] % 4 == 3) {
            packetTotal = p.packetNumber;
        }
    }

    public static void addPacket(HeaderPacket p) {


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