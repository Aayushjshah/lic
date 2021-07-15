import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// To copy files
import java.nio.file.Files;
import java.io.*;

public class FileChooserTest extends JFrame {
  private JTextField filename = new JTextField(), dir = new JTextField();

  private JButton open = new JButton("Open"), save = new JButton("Save");
  String memberName = "Aayush";
  public FileChooserTest() {
    JPanel p = new JPanel();
    open.addActionListener(new OpenL());
    p.add(open);
    save.addActionListener(new SaveL());
    p.add(save);
    Container cp = getContentPane();
    cp.add(p, BorderLayout.SOUTH);
    dir.setEditable(false);
    filename.setEditable(false);
    p = new JPanel();
    p.setLayout(new GridLayout(2, 1));
    p.add(filename);
    p.add(dir);
    cp.add(p, BorderLayout.NORTH);
  }

  class OpenL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser c = new JFileChooser();
      // Demonstrate "Open" dialog:
      int rVal = c.showOpenDialog(FileChooserTest.this);
      if (rVal == JFileChooser.APPROVE_OPTION) {
        filename.setText(c.getSelectedFile().getName());
        dir.setText(c.getCurrentDirectory().toString());
      }
      if (rVal == JFileChooser.CANCEL_OPTION) {
        filename.setText("You pressed cancel");
        dir.setText("");
      }
    }
  }

  class SaveL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser c = new JFileChooser();
      // Demonstrate "Save" dialog:
      int rVal = c.showSaveDialog(FileChooserTest.this);
      if (rVal == JFileChooser.APPROVE_OPTION) {
        filename.setText(c.getSelectedFile().getName());
        dir.setText(c.getCurrentDirectory().toString());
        addFile(c.getSelectedFile().getName(),c.getCurrentDirectory().toString());
        //we will call a function which will copy the file to new folder locally!
        
        System.out.println("****************8");
        System.out.println(dir.getText());
      }
      if (rVal == JFileChooser.CANCEL_OPTION) {
        filename.setText("You pressed cancel");
        dir.setText("");
      }
    }
  }


  private void addFile(String fileName, String dir ){
    CreateDir cd = new CreateDir(memberName); //a directory if does not exist then comes into existence
    //copy file
      //initial file
      String initFileName = dir + "\\"+fileName;
      // System.out.println("in addFile");
      System.out.println(initFileName);
      File initFile = new File(initFileName);
      File newFile  = new File("designing/A/new1.pdf");
      try{
        Files.copy(initFile.toPath(),newFile.toPath());
      }catch(Exception e){
        e.printStackTrace();
      }
  }
  public static void main(String[] args) {
    run(new FileChooserTest(), 250, 110);
  }

  public static void run(JFrame frame, int width, int height) {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(width, height);
    frame.setVisible(true);
  }
} 