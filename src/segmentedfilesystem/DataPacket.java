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

public class DataPacket{
    public byte[] getData(){
        byte[] buf =Packet.fileContents;

        //Loop through after buf[4] to the end of the data
        //data.length stuff
        return buf;
    }

    public static int getPacketNumber(DataPacket p){

        int x = Packet.fileContents[3]*256+Packet.fileContents[4];
        return x;
    }
}