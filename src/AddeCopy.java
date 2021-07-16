import javax.swing.*;
import java.awt.Color;
// import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.nio.file.FileAlreadyExistsException;
// To copy files
import java.nio.file.Files;
import java.io.*;
//end*

public class AddeCopy extends JFrame implements ActionListener{
    
    JButton no,yes;
    FontPicker fp = new FontPicker();
    
    String userName,memberName,policyName;
    AddPolicy2 ap2;
    
    
    AddeCopy(String username,String membername,String policyNm,AddPolicy2 ap2Arg){
        userName=username;
        memberName=membername;
        policyName=policyNm;
        ap2=ap2Arg;
        JLabel question = new JLabel("Add e-copy of the policy?");
        question.setBounds(12,45,300,30);
        question.setFont(fp.eCopyFont);
        add(question);

        no = new JButton("No");
        no.setFont(fp.forLabel);
        no.setForeground(Color.WHITE);
        no.setBackground(Color.BLACK);
        no.addActionListener(this);
        no.setBounds(20,130,120,30);
        add(no);

        yes = new JButton("Yes");
        yes.setFont(fp.forLabel);
        yes.setForeground(Color.WHITE);
        yes.setBackground(Color.BLACK);
        yes.addActionListener(new SaveL());
        yes.addActionListener(this);
        yes.setBounds(160,130,120,30);
        add(yes);


        //main Pane
        setBounds(590,350,330,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==no){
            this.setVisible(false);
            ap2.eCopyFlag="n";
        }else if(ae.getSource()==yes){
            this.setVisible(false);
            ap2.eCopyFlag="y";
        }
    }



  class SaveL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFileChooser c = new JFileChooser();
      // Demonstrate "Save" dialog:
      int rVal = c.showSaveDialog(AddeCopy.this);
      if (rVal == JFileChooser.APPROVE_OPTION) {
        // filename.setText(c.getSelectedFile().getName());
        // dir.setText(c.getCurrentDirectory().toString());
        addFile(c.getSelectedFile().getName(),c.getCurrentDirectory().toString());
        //we will call a function which will copy the file to new folder locally!
        
        // System.out.println("****************8");
        // System.out.println(dir.getText());
        // System.out.println(filename.getText());
      }
      if (rVal == JFileChooser.CANCEL_OPTION) {
        // filename.setText("You pressed cancel");
        // dir.setText("");
        JOptionPane.showMessageDialog(null,"You Pressed Cancel");
        new AddeCopy(userName,memberName,policyName,ap2).setVisible(true);
        displayNull();
      }
    }
  }
  private void displayNull(){
      this.setVisible(false);
  }
  private void addFile(String fileName, String dir){
    CreateDir cd = new CreateDir(); //a directory if does not exist then comes into existence
    cd.Dirmaker(userName,memberName);
    //copy file
      //initial file
      String initFileName = dir + "\\"+fileName;
      String destPath = "db/"+userName +"/" +memberName + "/"+policyName;
      System.out.println("in addFile");
      System.out.println(initFileName);
      File initFile = new File(initFileName);
      File newFile  = new File(destPath);
      try{
        Files.copy(initFile.toPath(),newFile.toPath());
        JOptionPane.showMessageDialog(null,"File saved sucessfully!");
        this.setVisible(false);
      }catch(FileAlreadyExistsException e){
        JOptionPane.showMessageDialog(null,"File already exists!");
      }catch(IOException e){

      }
  }
 
}