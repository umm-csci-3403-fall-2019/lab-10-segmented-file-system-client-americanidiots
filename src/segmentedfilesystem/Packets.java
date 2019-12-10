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

public class Client File {
      Map<Integer, Byte []> packets = new HashMap<>();
      int packetTotal = -1;
    
    public void packetType(DatagramPacket packet){

        Object packetType;
        Object DataPacket;
        Object HeaderPacket;

    } 
		
    public void addPacket(HeaderPacket p) {
        //extract and save as a field
    }

    public void addPacket(DataPacket p) {
        
    }
    public boolean isDone(){
        return(packetTotal==packets.size())

    }
}