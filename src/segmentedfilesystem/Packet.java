package segmentedfilesystem;

//Packet file should make packet
//packet file should store packet file num

import java.net.DatagramPacket;

public class Packet {
    static int fileNum;
    static String packetType;
    static byte[] fileContents;

    Packet(int fileNum, String packetType, byte[] fileContents){
        this.fileNum = fileNum;
        this.packetType = packetType;
        this.fileContents = fileContents;
    }
    
 
 public static Packet makePacket(DatagramPacket p) {
     fileContents = p.getData();
     fileNum = fileContents[1];

     if (fileContents[0] % 2 == 0) {
         packetType = "HeaderPacket";
     } else {
         packetType = "DataPacket";
     }

     Packet packet = new Packet(fileNum, packetType, fileContents);
     return packet;
 }
}