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

public class HeaderPacket extends Packet {
    byte[] fileName;

    public HeaderPacket() {
        this.fileName = Arrays.copyOfRange(packet.getData(), 2, packet.getLength());
    }
}