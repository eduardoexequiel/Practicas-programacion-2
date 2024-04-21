package agendaelectronica;
import javax.swing.JFrame;
public class AgendaElectronica {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Agenda Electrónica");
            Igu panel = new Igu();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        }
    }
