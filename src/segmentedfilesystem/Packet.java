package segmentedfilesystem;

//Packet file should make packet
//packet file should store packet file num
import java.util.Arrays;

public class Packet {
     int fileNum;
 
 public static Packet makePacket(byte[] buffer) {
    //  fileContents = buffer.getData();
     byte fileNum = buffer[1];
     Packet packet;

     //if true, this is a header. Therefore packet becomes a HeaderPacket
     if (buffer[0] % 2 == 0) {
        //  String packetType = "HeaderPacket";
         packet = new HeaderPacket();
     } else {  // if true, this is a DataPacket, which packet is then set to.
        // String packetType = "DataPacket";
         packet = new DataPacket(buffer[1], (buffer[2]*256+buffer[3]),
          Arrays.copyOfRange(buffer, 4, buffer.length));
     }

    //  Packet packet = new Packet(fileNum, packetType, fileContents);
     return packet;
    }



    
 
  // public static DataPacket makeDataPacket(DatagramPacket p, int l) {
    //     fileContents = p.getData();
    //     length = l;
    //     fileNum = fileContents[1];

    //     int packetNumber = 0;
    //     byte[] fileData = new byte[0];
    //     DataPacket packet = new DataPacket(fileNum, fileContents, packetNumber, fileData, length);
    //     return packet;
    // }

    // public static HeaderPacket makeHeaderPacket(DatagramPacket p, int l) {
    //     fileContents = p.getData();
    //     length = l;
    //     fileNum = fileContents[1];

    //     byte[] fileName = new byte[0];
    //     HeaderPacket packet = new HeaderPacket(fileNum, fileContents, fileName, length);

    //     return packet;
    // }   }
}