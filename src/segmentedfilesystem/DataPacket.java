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
import java.util.Arrays;

public class DataPacket extends Packet{
     int packetNumber;
     boolean lastPacket;
     byte[] fileData;
     int dataLength;

    public DataPacket (byte fileID, int packetNum, byte[] fileData){
        this.packetNumber = packetNum;
        this.fileData = fileData;
        this.fileNum = fileID;
        this.dataLength = fileData.length;
        // this.fileData = Arrays.copyOfRange(Packet.fileContents, 4, Packet.fileContents.length);
        // this.packetNumber = Arrays.copyOfRange(Packet.fileContents, 2, 3);
    }

    // public static byte[] getPacketNumber(Packet packet){

    //     int x = Packet.fileContents[2]*256+Packet.fileContents[3];
    //     return DataPacket.packetNumber;
    // }
}   