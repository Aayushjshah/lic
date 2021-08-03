import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.border.Border;
import javax.swing.event.MouseInputListener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;


public class PolicyDetailsDisplay1 extends JFrame implements MouseInputListener {
    //Note : actionListener doesnt work for container
    JButton[] lArr = new JButton[5];
    
    JPanel[] p2= new JPanel[4] ;
    int i=0;
    FontPicker fp = new FontPicker();
    public PolicyDetailsDisplay1(){
        System.out.println("Sincerity");
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(230, 255, 230));
        p1.setPreferredSize(new Dimension(220,150));
        p1.setVisible(true);
        p1.setBounds(0,0,220,650);
        p1.setLayout(null);
        // add(p1,BorderLayout.WEST);
        add(p1);
        int j=50;
        for(;i<5;i++){
            lArr[i]=new JButton("Label"+i);
            lArr[i].setFont(fp.forLabel);
            lArr[i].setBounds(20, j, 120, 30);
            p1.add(lArr[i]);
            j+=50;
        }
        
        //pilot
        int x=50;
        for(i=0;i<4;i++,x+=130){
        p2[i]= new JPanel();
        // JPanel p2[i] = new RoundedBorderTest()
        p2[i].setBackground(Color.WHITE);
        p2[i].setBounds(230,x,600,100);
        p2[i].setLayout(null);
        Border b2 = new RoundedBorder(fp.panelColor,50);
        p2[i].setBorder(b2);
        p2[i].addMouseListener(this);
        
        add(p2[i]);
        

        //inside
        JLabel name = new JLabel("Name:");
        name.setFont(fp.forLabel);
        name.setBounds(20,5,60,30);
        p2[i].add(name);
        
        JLabel nameVal = new JLabel("<html><b><u>Aayush Shah</u></b></html>");
        nameVal.setFont(fp.forLabel);
        nameVal.setBounds(85,5,120,30);
        p2[i].add(nameVal);

        JLabel relation = new JLabel("Relation:");
        relation.setFont(fp.forLabel);
        relation.setBounds(400,5,70,30);
        p2[i].add(relation);

        JLabel relationVal = new JLabel("Daughter");
        relationVal.setFont(fp.forLabel);
        relationVal.setBounds(480,5,120,30);
        p2[i].add(relationVal);

        JLabel pol1 = new JLabel("=>JeevanDrivng");
        pol1.setFont(fp.forLabel);
        pol1.setBounds(10,50,150,30);
        pol1.setForeground(Color.WHITE);
        p2[i].add(pol1);

        JLabel pol2 = new JLabel("=>JeevanDrivng");
        pol2.setFont(fp.forLabel);
        pol2.setBounds(160,50,150,30);
        pol2.setForeground(Color.WHITE);
        p2[i].add(pol2);

        JLabel pol3 = new JLabel("=>JeevanDrivng");
        pol3.setFont(fp.forLabel);
        pol3.setBounds(310,50,150,30);
        pol3.setForeground(Color.WHITE);
        p2[i].add(pol3);

        JLabel pol4 = new JLabel("=>JeevanDrivng");
        pol4.setFont(fp.forLabel);
        pol4.setBounds(460,50,150,30);
        pol4.setForeground(Color.WHITE);
        p2[i].add(pol4);
        }
        setBounds(350,120,860,650);
        setLayout(null);
        // this.setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new PolicyDetailsDisplay1();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        for(int i =0 ; i<4;i++){
            if(e.getSource() ==p2[i]){
                //change the layout
                // p2[i].setBorder(new RoundedBorder(fp.panelColor,50));
                this.setVisible(false);
                new PolicyDetailsDisplay2().setVisible(true);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        for(int i =0 ; i<4;i++){
            if(e.getSource() ==p2[i]){
                //change the layout
                p2[i].setBorder(new RoundedBorder(Color.RED,50));
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        for(int i =0 ; i<4;i++){
            if(e.getSource() ==p2[i]){
                //change the layout
                p2[i].setBorder(new RoundedBorder(fp.panelColor,50));
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
