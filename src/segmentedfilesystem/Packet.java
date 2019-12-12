package segmentedfilesystem;

//Packet file should make packet
//packet file should store packet file num

import java.net.DatagramPacket;

public class Packet{
    static int fileNum;
    static int length;
    static byte[] fileContents;

    Packet(int fileNum, byte[] fileContents){
        this.fileNum = fileNum;
        this.fileContents = fileContents;
    }
    
 
 public static DataPacket makeDataPacket(DatagramPacket p, int l) {
     fileContents = p.getData();
     length =l;
     fileNum = fileContents[1];

     int packetNumber = 0;
     byte[] fileData = new byte[0];
     DataPacket packet = new DataPacket(fileNum,fileContents,packetNumber,fileData,length);
     return packet;
 }
 
    public static HeaderPacket makeHeaderPacket(DatagramPacket p, int l) {
        fileContents = p.getData();
        length =l;
        fileNum = fileContents[1];

        byte[] fileName = new byte[0];
        HeaderPacket packet = new HeaderPacket(fileNum,fileContents,fileName,length);

        return packet;
    }
}
