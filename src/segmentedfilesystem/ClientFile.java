package segmentedfilesystem;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.*;

import javax.sound.sampled.Port;
import javax.xml.crypto.Data;

//Client file should store header
//Client file should have sorted datamap
//Client file should add packet data
//client file should add packet header
//client file should have packet expecting num

public class ClientFile {
    static int packetTotal0;
    static int packetAdded0;
    static int packetTotal1;
    static int packetAdded1;
    static int packetTotal2;
    static int packetAdded2;

    public ClientFile() {



    }

    public static boolean isDone(){
        if(packetAdded0==packetTotal0&&packetAdded1==packetTotal1&&packetAdded2==packetTotal2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void addDataPacket(DataPacket p,int fileNum) {

        SortedMap<Integer, byte[]> clientMap0 = new TreeMap<>();
        SortedMap<Integer, byte[]> clientMap1 = new TreeMap<>();
        SortedMap<Integer, byte[]> clientMap2 = new TreeMap<>();

        if(fileNum==0) {
            clientMap0.put(p.packetNumber, p.fileData);
            packetAdded0 += 1;

            if (p.fileContents[0] % 4 == 3) {

                packetTotal0 = p.packetNumber;
            }
        }
        else if(fileNum==1) {
            clientMap1.put(p.packetNumber, p.fileData);
            packetAdded1 += 1;

            if (p.fileContents[0] % 4 == 3) {

                packetTotal1 = p.packetNumber;
            }
        }
        else{
            clientMap2.put(p.packetNumber, p.fileData);
            packetAdded2 += 1;

            if (p.fileContents[0] % 4 == 3) {

                packetTotal2 = p.packetNumber;
            }
        }
        if(ClientFile.isDone()==true) {
            ClientFile.showFiles(clientMap0);
            ClientFile.showFiles(clientMap1);
            ClientFile.showFiles(clientMap2);
        }
    }

    public static void addHeaderPacket(HeaderPacket p, int fileNum) {


    }

    public static void showFiles(SortedMap<Integer,byte[]> clientMap) {
        //This returns all the files when they are done.

        Set s = clientMap.entrySet();
        Iterator i = s.iterator();

        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();
            byte[] value = (byte[]) m.getValue();
            System.out.println("value : "+value);
        }
    }
}