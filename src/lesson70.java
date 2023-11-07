import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class lesson70 extends JFrame{
    private static int[] sonlar = {2, 3};
    private static Number[] raqamlar = {0,1};

private JList Royhat;
private static String[] rangTurlari = {"qora", "ko'k", "qizil", "oq", "yashil", "pushti", "sariq"};
private static Color rangalar[] = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE,
        Color.GREEN, Color.PINK, Color.YELLOW };

   public lesson70() {
    super("JList");
    setLayout(new FlowLayout());
    Royhat = new JList(rangTurlari);
    Royhat.setVisibleRowCount(5); // ro'yhatta necha qator ko'rinib tursin degani buu
       Royhat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       add(new JScrollPane(Royhat));
       Royhat.addListSelectionListener(
               new ListSelectionListener() {
                   public void valueChanged(ListSelectionEvent hodisa) {
                       getContentPane().setBackground(rangalar[Royhat.getSelectedIndex()]);
                   }
               }
       );

}


}
