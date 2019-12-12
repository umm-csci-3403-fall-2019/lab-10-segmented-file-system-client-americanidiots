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

public class DataPacket {
    int fileNum;
    int packetNumber;
    int length;
    byte[] fileContents;
    byte[] fileData;


    public DataPacket(int fileNum, byte[] fileContents, int packetNumber, byte[] fileData,int length){
        this.fileNum=fileNum;
        this.fileContents=fileContents;
        this.length=length;
        this.fileData = Arrays.copyOfRange(fileContents, 4,length);
        this.packetNumber = fileContents[2]*256+fileContents[3];
    }

}