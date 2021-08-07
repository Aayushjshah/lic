import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;

public class IndividualPolicyDetailsDisplay1 extends JPanel{
    CardLayoutMgr clm;
    FontPicker fp= new FontPicker();
    Border b3 = new RoundedBorder(fp.panelColor,50);
//===================    
    String[] lNameString1 =  {"Name of the policy","PolicyId","Plan Name","PolicyNo","Company","sumInsured"};
    JLabel[]  lName1 = new JLabel[6];
    String[] lDataString1 =  {"JeevanKishor","191080067","jeevanSural","1","LIC","5000000"};
    JLabel[]  lData1 = new JLabel[6];
    //====================================
    String[] lAgentString1 =  {"Name","Contact No."};
    JLabel[]  lAgent1 = new JLabel[2];
    String[] lAgentDataString1 =  {"Divyesh Shah","8888999912"};
    JLabel[]  lAgentData1 = new JLabel[2];
    //====================================
    String[] lNomString1 =  {"Name","Contact No.","Relation"};
    JLabel[]  lNom1 = new JLabel[3];
    String[] lNomDataString1 =  {"Rina Shah","9321482939","Mother"};
    JLabel[]  lNomData1 = new JLabel[3];
    //====================================
    String[] lBilString1 =  {"Installment Premium","Upcoming Premium Date","Premium Cycle","1st Premium Paid","Last premium Date","Bank A/c"};
    JLabel[]  lBil1 = new JLabel[6];
    String[] lBilDataString1 =  {"4000","2021-08-12","Yearly","36000","2031-12-12","AayushjShah BOI"};
    JLabel[]  lBilData1 = new JLabel[6];
    //====================================
    String[] lMaturityString1 =  {"Maturity Amount","Maturity Date"};
    JLabel[]  lMaturity1 = new JLabel[2];
    String[] lMaturityDataString1 =  {"50000000","2031-12-12"};
    JLabel[]  lMaturityData1 = new JLabel[2];
    //====================================
    
    
    
    int i=0;//iterator variable

    IndividualPolicyDetailsDisplay1(CardLayoutMgr cll){
        clm=cll;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ocean2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLbl = new JLabel(i3);
        imgLbl.setBounds(15,5,50,50);
        add(imgLbl);
        JLabel polHolder = new JLabel("<html><u><b><i>Aayush Shah</i><b></u></html>");
        polHolder.setFont(fp.headFont);
        polHolder.setBounds(95,5,200,40);
        add(polHolder);
//in1=======begin======================
        JPanel in1 = new JPanel();
        in1.setLayout(null);
        in1.setBackground(Color.GREEN);
        in1.setBounds(10,68,310,255);
        in1.setBorder(b3);
        add(in1);
        JLabel genInfo = new JLabel("<html><u><b><i>General Info</i><b></u></html>");
        genInfo.setFont(fp.subHeadFont);
        genInfo.setBounds(3,5,200,30);
        in1.add(genInfo);
        int x=40;
        for(;i<6;i++){
            lName1[i] = new JLabel(lNameString1[i]);
            lName1[i].setFont(fp.forLabel);
            lName1[i].setBounds(5,x,150,30);
            in1.add(lName1[i]);
            i++;
            lName1[i] = new JLabel(lNameString1[i]);
            lName1[i].setFont(fp.forLabel);
            lName1[i].setBounds(200,x,150,30);
            in1.add(lName1[i]);
            i--;
            lData1[i] = new JLabel(lDataString1[i]);
            lData1[i].setFont(fp.forLabel);
            lData1[i].setForeground(Color.WHITE);
            lData1[i].setBounds(5,x+25,150,30);
            in1.add(lData1[i]);
            i++;
            lData1[i] = new JLabel(lDataString1[i]);
            lData1[i].setFont(fp.forLabel);
            lData1[i].setForeground(Color.WHITE);
            lData1[i].setBounds(200,x+25,150,30);
            in1.add(lData1[i]);


            x+=70;
        }
//=======in1=====ends============in2 begins==================
    JPanel in2 = new JPanel();
    in2.setLayout(null);
    in2.setBackground(Color.GREEN);
    in2.setBounds(340,10,310,105);
    in2.setBorder(b3);
    add(in2);
    JLabel AgentInfo = new JLabel("<html><u><b><i>Agent Info</i><b></u></html>");
    AgentInfo.setFont(fp.subHeadFont);
    AgentInfo.setBounds(3,5,200,30);
    in2.add(AgentInfo);
    x=40;
    for(i=0;i<2;i++){
        lAgent1[i] = new JLabel(lAgentString1[i]);
        lAgent1[i].setFont(fp.forLabel);
        lAgent1[i].setBounds(5,x,150,30);
        in2.add(lAgent1[i]);
        i++;
        lAgent1[i] = new JLabel(lAgentString1[i]);
        lAgent1[i].setFont(fp.forLabel);
        lAgent1[i].setBounds(200,x,150,30);
        in2.add(lAgent1[i]);
        i--;
        lAgentData1[i] = new JLabel(lAgentDataString1[i]);
        lAgentData1[i].setFont(fp.forLabel);
        lAgentData1[i].setForeground(Color.WHITE);
        lAgentData1[i].setBounds(5,x+25,150,30);
        in2.add(lAgentData1[i]);
        i++;
        lAgentData1[i] = new JLabel(lAgentDataString1[i]);
        lAgentData1[i].setFont(fp.forLabel);
        lAgentData1[i].setForeground(Color.WHITE);
        lAgentData1[i].setBounds(200,x+25,150,30);
        in2.add(lAgentData1[i]);
    }
 //=======in2=====ends============in3 begins==================
    JPanel in3 = new JPanel();
    in3.setLayout(null);
    in3.setBackground(Color.GREEN);
    in3.setBounds(340,145,310,175);
    in3.setBorder(b3);
    add(in3);
    JLabel NomineeInfo = new JLabel("<html><u><b><i>Nominee Details</i><b></u></html>");
    NomineeInfo.setFont(fp.subHeadFont);
    NomineeInfo.setBounds(3,5,200,30);
    in3.add(NomineeInfo);
    x=40;
    for(i=0;i<3;i++){
        lNom1[i] = new JLabel(lNomString1[i]);
        lNom1[i].setFont(fp.forLabel);
        lNom1[i].setBounds(5,x,150,30);
        in3.add(lNom1[i]);
        i++;
        if(i<3){
        lNom1[i] = new JLabel(lNomString1[i]);
        lNom1[i].setFont(fp.forLabel);
        lNom1[i].setBounds(200,x,150,30);
        in3.add(lNom1[i]);
        }
        i--;
        lNomData1[i] = new JLabel(lNomDataString1[i]);
        lNomData1[i].setFont(fp.forLabel);
        lNomData1[i].setForeground(Color.WHITE);
        lNomData1[i].setBounds(5,x+25,150,30);
        in3.add(lNomData1[i]);
        i++;
        if(i<3){
        lNomData1[i] = new JLabel(lNomDataString1[i]);
        lNomData1[i].setFont(fp.forLabel);
        lNomData1[i].setForeground(Color.WHITE);
        lNomData1[i].setBounds(200,x+25,150,30);
        in3.add(lNomData1[i]);
        }
        x+=70;
    }
//=======in3=====ends============in4 begins==================
JPanel in4 = new JPanel();
    in4.setLayout(null);
    in4.setBackground(Color.GREEN);
    in4.setBounds(10,340,410,255);
    in4.setBorder(b3);
    add(in4);
    JLabel BillingInfo = new JLabel("<html><u><b><i>Blling Info</i><b></u></html>");
    BillingInfo.setFont(fp.subHeadFont);
    BillingInfo.setBounds(3,5,200,30);
    in4.add(BillingInfo);
    x=40;
    for(i=0;i<6;i++){
        lBil1[i] = new JLabel(lBilString1[i]);
        lBil1[i].setFont(fp.forLabel);
        lBil1[i].setBounds(5,x,200,30);
        in4.add(lBil1[i]);
        i++;
        lBil1[i] = new JLabel(lBilString1[i]);
        lBil1[i].setFont(fp.forLabel);
        lBil1[i].setBounds(200,x,200,30);
        in4.add(lBil1[i]);
        i--;
        lBilData1[i] = new JLabel(lBilDataString1[i]);
        lBilData1[i].setFont(fp.forLabel);
        lBilData1[i].setForeground(Color.WHITE);
        lBilData1[i].setBackground(Color.RED);
        lBilData1[i].setBounds(5,x+25,150,30);
        in4.add(lBilData1[i]);
        i++;
        lBilData1[i] = new JLabel(lBilDataString1[i]);
        lBilData1[i].setFont(fp.forLabel);
        lBilData1[i].setForeground(Color.WHITE);
        lBilData1[i].setBounds(200,x+25,150,30);
        in4.add(lBilData1[i]);
        x+=70;
    }
    lBilData1[0].setForeground(Color.RED); lBilData1[1].setForeground(Color.RED);
 //=======in4=====ends============in5 begins==================

    JPanel in5 = new JPanel();
    in5.setLayout(null);
    in5.setBackground(Color.GREEN);
    in5.setBounds(440,340,200,255);
    in5.setBorder(b3);
    add(in5);
    JLabel MaturityInfo = new JLabel("<html><u><b><i>Maturity Details</i><b></u></html>");
    MaturityInfo.setFont(fp.subHeadFont);
    MaturityInfo.setBounds(3,5,200,30);
    in5.add(MaturityInfo);
    x=40;
    for(i=0;i<2;i++){
        lMaturity1[i] = new JLabel(lMaturityString1[i]);
        lMaturity1[i].setFont(fp.forLabel);
        lMaturity1[i].setBounds(5,x,150,30);
        in5.add(lMaturity1[i]);
        
        lMaturityData1[i] = new JLabel(lMaturityDataString1[i]);
        lMaturityData1[i].setFont(fp.forLabel);
        lMaturityData1[i].setForeground(Color.WHITE);
        lMaturityData1[i].setBounds(5,x+25,150,30);
        in5.add(lMaturityData1[i]);
        x+=70;
    }
    
    ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icons/eCopyYellow.png"));
    JLabel bl1 = new JLabel(b1);
    bl1.setBounds(0,x,200,50);
    in5.add(bl1);





//============bottom====================
        setBackground(Color.GREEN);
        setBounds(0,0,620,650);
        setLayout(null);
    }
    // public static void main(String[] args){
    //     new IndividualPolicyDetailsDisplay1(clm);
    // }
     
}
