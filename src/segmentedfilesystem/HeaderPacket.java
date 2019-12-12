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

public class HeaderPacket{
    byte[] fileName;
    byte[] fileContents;
    int length;
    int fileNum;

    public HeaderPacket(int fileNum, byte[] fileContents, byte[] fileName,int length) {
        this.fileNum=fileNum;
        this.fileContents=fileContents;
        this.length=length;
        this.fileName = Arrays.copyOfRange(fileContents, 2,length);
    }
}