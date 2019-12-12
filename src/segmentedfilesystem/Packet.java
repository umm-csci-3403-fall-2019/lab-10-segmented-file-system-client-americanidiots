package segmentedfilesystem;

//Packet file should make packet
//packet file should store packet file num

import java.net.DatagramPacket;

public class Packet {
    static int fileNum;
    static int length;
    static byte[] fileContents;

    Packet(int fileNum, byte[] fileContents){
        this.fileNum = fileNum;
        this.fileContents = fileContents;
    }
    
 
 public static Packet makePacket(DatagramPacket p) {
     fileContents = p.getData();
     length=p.length;
     fileNum = fileContents[1];

     if (fileContents[0] % 2 == 0) {
         HeaderPacket packet = new HeaderPacket(fileNum,fileContents,fileName,length);
     } else {
         DataPacket packet = new DataPacket(fileNum,fileContents,packetNumber,fileData,length);
     }

     return packet;
 }
}