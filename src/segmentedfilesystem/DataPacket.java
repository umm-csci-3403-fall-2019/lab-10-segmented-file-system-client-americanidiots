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
    public getData(){
        byte[] buf =Packet.fileContents;

    }

    public static int getPacketNumber(DataPacket p.){
        int x = Packet.fileContents[3]*256+Packet.fileContents[4];
        return x;
    }
}