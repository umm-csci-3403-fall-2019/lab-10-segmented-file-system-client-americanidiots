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

//Packet file should make packet
//packet file should store packet file num

public class Packet {
    int fileNum;
    String packetType;
    Byte[] fileContents = new Buffer[1028];

    Packet(int fileNum, String packetType, Byte[] fileContents){
        this.fileNum = fileNum;
        this.packetType = packetType;
        this.fileContents = fileContents;
    }
    
 
 public makePacket(byte[] buf){
     fileNum=buf[1];
     fileContents=buf;

     if(buf[0]%2 == 0){
         packetType = "HeaderPacket";
     }
     else{
         packetType = "DataPacket";
     }

Packet packet = new Packet(fileNum,packetType,fileContents);

}
}