package data;

import java.nio.ByteBuffer;
import java.util.List;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;
import javax.swing.JOptionPane;

public class Read {
    public String UID = null;
    
    public Read() {
        try {
            CardTerminal terminal = null;

            // show the list of available terminals
            TerminalFactory factory = TerminalFactory.getDefault();
            List<CardTerminal> terminals = factory.terminals().list();
            String readerName = "";

            for (int i = 0; i < terminals.size(); i++) {
                readerName = terminals.get(i).toString()
                        .substring(terminals.get(i).toString().length() - 2);
                //terminal = terminals.get(i);

                if (readerName.equalsIgnoreCase(" 0")) {
                    terminal = terminals.get(i);
                }
            }

            // Establish a connection with the card
            System.out.println("Waiting for a card..");

            if(terminal==null)
                return;
            terminal.waitForCardPresent(0);

            Card card = terminal.connect("T=1");
            CardChannel channel = card.getBasicChannel();

            // Start with something simple, read UID, kinda like Hello World!
            byte[] baReadUID = new byte[5];

            baReadUID = new byte[] { (byte) 0xFF, (byte) 0xCA, (byte) 0x00, (byte) 0x00, (byte) 0x00 };

            UID = send(baReadUID, channel);
            System.out.println("UID: " + UID);


            // If successfull, the output will end with 9000
            // OK, now, the real work
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Uwaga! Sprawdź czy czytnik kart jest podłączony, następnie uruchom aplikacje ponownie");
            System.exit(1);
            ex.printStackTrace();
        }
    }

    public String send(byte[] cmd, CardChannel channel) {
        String res = "";

        byte[] baResp = new byte[258];
        ByteBuffer bufCmd = ByteBuffer.wrap(cmd);
        ByteBuffer bufResp = ByteBuffer.wrap(baResp);

        // output = The length of the received response APDU
        int output = 0;

        try {
            output = channel.transmit(bufCmd, bufResp);
        } catch (CardException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < output; i++) {
            res += String.format("%02X", baResp[i]);
            // The result is formatted as a hexadecimal integer
        }
        return res;
    }

    public String getUID() {
        return UID;
    }
}