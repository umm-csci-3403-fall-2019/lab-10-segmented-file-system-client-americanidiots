package segmentedfilesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Map;
import java.util.HashMap;

import javax.sound.sampled.Port;
import javax.xml.crypto.Data;

//Client file should store header
//Client file should have sorted datamap
//Client file should add packet data
//client file should add packet header
//client file should have packet expecting num

public class ClientFile {
      
      Map<Integer, Byte []> packets = new HashMap<>();
      
 public boolean isDone(){
        return(Packet.packetTotal==packets.size())

    }
}