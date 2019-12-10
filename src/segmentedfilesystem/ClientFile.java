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

public class ClientFile extends Packet {


   SortedMap<Integer, Byte []> clientMap = new TreeMap<>();
   Set s =clientMap.entrySet();
   Iterator i=s.iterator();

   while (i.hasNext()){
       Map.Entry m = (Map.Entry)i.next();
       byte[] value = m.getValue();
       byte[] values += value;
   }
    return values;

 public boolean isDone(){
        return(Packet.packetTotal==packets.size())

    }
public boolean addPacket(DataPacket p){
        clientMap.put(DataPacket.getPacketNumber(p),Packet.fileContents)
    }

public boolean addPacket(HeaderPacket p ){
    
    }

}