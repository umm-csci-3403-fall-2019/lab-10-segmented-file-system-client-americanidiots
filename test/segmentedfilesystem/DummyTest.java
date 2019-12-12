package segmentedfilesystem;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is just a stub test file. You should rename it to
 * something meaningful in your context and populate it with
 * useful tests.
 */
public class DummyTest {

    @Test
    public void test() {
      diff binary.jpg ../test/target-files/binary.jpg
    }
    
    @Test
    public void test2() {
        bats test/client_tests.bats    
    }

    @Test
    public void makeDataPacketTest() {
      String word = "GreetingsWorld";
      byte[] stringBytes = word.getBytes();
      byte[] packet = new byte[4+stringBytes.length];
      packet[0] = 1;
      packet[1] = 47;
      packet[2] = 0;
      packet[3] = 7;
      for (int i=0; i<stringBytes.length; ++i) {
        packet[i+4] = stringBytes[i];
      }

      Packet.makePacket(packet);

      // System.out.println(Packet.fileContents);
      assertEquals(47, Packet.fileNum);
      // System.out.println(Packet.fileNum);
      assertEquals("DataPacket", Packet.packetType);
      // System.out.println(Packet.packetType);

    }

    @Test
    public void makeHeaderPacketTest(){
      String word = "GreetingsWorld";
      byte[] stringBytes = word.getBytes();
      byte[] packet = new byte[2+stringBytes.length];
      packet[0] = 0;
      packet[1] = 75;
      for (int i=0; i<stringBytes.length; ++i) {
        packet[i+2] = stringBytes[i];
      }

      Packet.makePacket(packet);

      assertEquals(75, Packet.fileNum);
      assertEquals("HeaderPacket", Packet.packetType);
    }

}
