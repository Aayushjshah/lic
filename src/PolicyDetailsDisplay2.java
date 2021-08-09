import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JButton;

import javax.swing.border.Border;
import javax.swing.event.MouseInputListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
public class PolicyDetailsDisplay2 extends JPanel implements MouseInputListener {
    //Note : actionListener doesnt work for container
    
    public JPanel myPanel = new JPanel();
    // public JScrollPane jsp = new JScrollPane(myPanel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    public JScrollPane jsp = new ModernScrollPane(myPanel);
    
    CardLayoutMgr clm;
    JButton[] lArr = new JButton[5];
    // CardLayout cl;
    JPanel[] p2= new JPanel[10] ;
    int i=0;
    FontPicker fp = new FontPicker();
    public PolicyDetailsDisplay2(CardLayoutMgr cll){
        // cl=cll;
        clm=cll;
        
        // clm.varSize(0,-100);
        System.out.println("Disp2");
        myPanel.setLayout(null);
        myPanel.setBackground(Color.WHITE);
        
        // jsp.setPreferredSize(new Dimension(640,50));
        jsp.setBorder(new EmptyBorder(0,0,0,0));
        //pilot
        int x=50;
        for(i=0;i<5;i++,x+=130){
        p2[i]= new JPanel();
        // JPanel p2[i] = new RoundedBorderTest()
        p2[i].setBackground(Color.WHITE);
        p2[i].setBounds(10,x,600,100);
        p2[i].setLayout(null);
        Border b2 = new RoundedBorder(fp.panelColor,50);
        p2[i].setBorder(b2);
        p2[i].addMouseListener(this);
        myPanel.add(p2[i]);
        

        //inside
        JLabel name = new JLabel("Name:");
        name.setFont(fp.forLabel);
        name.setBounds(20,5,60,30);
        p2[i].add(name);
        
        JLabel nameVal = new JLabel("<html><b><u>Jeevan DRIVING</u></b></html>");
        nameVal.setFont(fp.forLabel);
        nameVal.setBounds(85,5,160,30);
        p2[i].add(nameVal);

        JLabel relation = new JLabel("PolicyID:");
        relation.setFont(fp.forLabel);
        relation.setBounds(400,5,70,30);
        p2[i].add(relation);

        JLabel relationVal = new JLabel("<html><u><b>191080067</b></u></html>");
        relationVal.setFont(fp.forLabel);
        relationVal.setBounds(480,5,120,30);
        p2[i].add(relationVal);

        JLabel pol1 = new JLabel("=>Drivng Insurance");
        pol1.setFont(fp.forLabel);
        pol1.setBounds(10,50,150,30);
        pol1.setForeground(Color.WHITE);
        p2[i].add(pol1);

        JLabel pol2 = new JLabel("=>LIC");
        pol2.setFont(fp.forLabel);
        pol2.setBounds(160,50,150,30);
        pol2.setForeground(Color.WHITE);
        p2[i].add(pol2);

        JLabel pol3 = new JLabel("=>Rs.5400");
        pol3.setFont(fp.forLabel);
        pol3.setBounds(310,50,150,30);
        pol3.setForeground(Color.WHITE);
        p2[i].add(pol3);

        JLabel pol4 = new JLabel("=>12-02-2022");
        pol4.setFont(fp.forLabel);
        pol4.setBounds(460,50,150,30);
        pol4.setForeground(Color.WHITE);
        p2[i].add(pol4);
        }
        myPanel.setBounds(0,0,640,x);
        myPanel.setPreferredSize(new Dimension(640,x));
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
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
                System.out.println(i+"clicked");
                clm.setr("ipdd1");
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
