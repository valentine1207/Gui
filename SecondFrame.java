import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class SecondFrame extends JFrame
{
   JLabel lblBook, lblSong, lblVideo, lblVideoGame, lblName, lblOption;
   JPanel panelMain, panelLeft, panelCenter, panelRight;
   JComboBox cmboOptions;
   String [] strOptions = {"1. Add a new Entry", "2. Print Your Library", 
      "3. Retrieve an Entry", "4. Delete an Entry", "4. Exit"};
   JRadioButton btnBook, btnSong, btnVideo, btnVideoGame;
   ButtonGroup btngp;
   public SecondFrame()
   {
      super("Personal Library!");
      lblName = new JLabel("Please, select the following option:");
      panelMain = new JPanel(new GridLayout(1,3,10,10));
      setLayout(new BorderLayout(10,20));
      add(lblName, BorderLayout.NORTH);
      add(panelMain, BorderLayout.CENTER);
      add(lblOption, BorderLayout.SOUTH);
      panelLeft = new JPanel(new FlowLayout(FlowLayout.CENTER, 5,10));
      panelCenter = new JPanel(new FlowLayout(FlowLayout.LEFT, 5,5));
      panelRight = new JPanel( new FlowLayout(FlowLayout.CENTER, 5, 10));
      
      panelMain.add(panelLeft);
      panelMain.add(panelCenter);
      panelMain.add(panelRight);
      
      // place borders around three sub-panels
      panelLeft.setBorder(new TitledBorder("Welcome to Your Personal Library"));
      panelCenter.setBorder(new TitledBorder("Please, select a type of entry "));
      panelRight.setBorder(new TitledBorder("Your Media Library"));
      cmboOptions = new JComboBox (strOptions);
      panelLeft.add(cmboOptions);
      
      // buttons
      btnBook = new JRadioButton("Book");
      btnSong = new JRadioButton("Song");
      btnVideo = new JRadioButton("Video");
      btnVideoGame = new JRadioButton("Video Game");
      btngp = new ButtonGroup();
      btngp.add(btnBook);
      btngp.add(btnSong);
      btngp.add(btnVideo);
      btngp.add(btnVideoGame);

      // place buttons in panel, top to bottom
      panelCenter.add(btnBook);
      panelCenter.add(btnSong);
      panelCenter.add(btnVideo);
      panelCenter.add(btnVideoGame);
   }
}
