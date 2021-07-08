import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
public class Register extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,li;

    JLabel[] arr = new JLabel[7];
    String[] labels = {"Name of the Head" , "Relation" , "Date Of Birth" , "Total Members" ,"SetUp LoginId",
                        "Set Password" , "Confirm Password"};
    JButton back,signUp,addMember;
    JTextField[] tarr = new JTextField[5];
    JPasswordField[] parr = new JPasswordField[2];
    // Store temp member values
    String[][] tempStorage = new String[3][3];
    
  //members  
    JLabel[] memJLab = new JLabel[4];
    String[] memLab = {"Name" , "Relation" , "D.O.B."};
    JTextField[] tarrMem = new JTextField[3];
    JLabel head2 ;
    int memCounter=2;
    int numMem;
    int t=0;
    String headStr;
//end
    JComboBox<Integer> c1;
    Font forLabel = new Font("Tahoma" , Font.ITALIC , 17 );
    Font headFont = new Font("Serif" , Font.ITALIC , 32);
    int i;
    
    
    Register(){

        
        JLabel head = new JLabel("Register");
        // head.setFont(new Font("Serif" , Font.ITALIC , 32));
        head.setFont(headFont);
        head.setBounds(360,5,200,40);
        add(head);



        
        int x=60;
        for(i=0;i<7;i++){
            arr[i]= new JLabel(labels[i]);
            arr[i].setFont(forLabel);
            if(i==3){
                Integer[] iArr = {1,2,3,4};
                c1 = new JComboBox<Integer>(iArr);
                c1.setBounds(175,x,150,30);
                c1.setBackground(Color.WHITE);
                c1.addActionListener(this);
                c1.setFont(forLabel);
                add(c1);

                arr[i].setBounds(20,x,150,30);
                add(arr[i]);        
                x+=50;
            }else{
                arr[i].setBounds(20,x,150,30);
                add(arr[i]);
                if(i<5){
                tarr[i] = new JTextField();
                tarr[i].setBounds(175,x,150,30);
                tarr[i].setFont(forLabel);
                add(tarr[i]);
                x+=50;
                }else{
                    parr[i-5] = new JPasswordField();
                parr[i-5].setBounds(175,x,150,30);
                parr[i-5].setFont(forLabel);
                add(parr[i-5]);
                x+=50;
                }
            }
        }
        tarr[1].setText("HEAD");
        tarr[1].setEnabled(false);

        //SignUp button
        back = new JButton("<html><u>Back</u></html>");
        back.setFont(new Font("Serif" , Font.ITALIC , 21));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setBounds(40,x,100,30);
        back.addActionListener(this);
        add(back);

        signUp = new JButton("<html><u>signUp</u></html>");
        signUp.setFont(new Font("Serif" , Font.ITALIC , 21));
        signUp.setForeground(Color.WHITE);
        signUp.setBackground(Color.BLACK);
        signUp.setBounds(170,x,120,30);
        signUp.addActionListener(this);
        add(signUp);

//form for new member
  
//sub heading 
        
        head2 = new JLabel("AA");
        // head2.setText("AAY");
        head2.setBounds(500,100,200,28);
        head2.setFont(new Font("Serif" , Font.ITALIC , 26));
        add(head2);   
        

        int y=140;
        for(i=0;i<3;i++){
            memJLab[i] = new JLabel(memLab[i]);
            memJLab[i].setFont(forLabel);
            memJLab[i].setBounds(400,y,100,30);
            tarrMem[i] = new JTextField();
            tarrMem[i].setBounds(505,y,150,30);
            tarrMem[i].setFont(forLabel);
            y+=50;
            add(tarrMem[i]);
            add(memJLab[i]);
        }

        //add member button

        addMember = new JButton("<html><u>Add Member</u></html>");
        addMember.setFont(forLabel);
        addMember.setBackground(Color.BLACK);
        addMember.setForeground(Color.WHITE);
        addMember.setBounds(430,y,150,30);
        addMember.addActionListener(this);
        add(addMember);
// member end




        //Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ocean.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,380,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        li = new JLabel(i3);
        li.setBounds(350,60,400,380);
        add(li);
        
        toggleDisplay(false);
        //mainPane
        setBounds(400,170,780,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);


        // String query = "insert into login values('"+ tId+"' , '"+hashedPassword+"')";
    }


//addMember function
    private void addMemberFunction(){
        // System.out.println(num);
        headStr = "Add Member " + Integer.toString(memCounter);
        System.out.println(headStr);
        head2.setText(headStr);
        memCounter+=1;
       
    }
    private void toggleDisplay(Boolean a){
        li.setVisible(!a);
                for(int i=0;i<3;i++){
                    memJLab[i].setVisible(a);
                    tarrMem[i].setVisible(a);
                }
                head2.setVisible(a);
                addMember.setVisible(a);
    }
    public void actionPerformed (ActionEvent ae){
        if(c1 == ae.getSource()){
            
            numMem = (Integer)c1.getSelectedItem();
            addMemberFunction();
            c1.setEnabled(false);
            toggleDisplay(true);     // display form for adding new members using for loop 
            enabler(false);


        }else if( signUp == ae.getSource()){
            System.out.println("Signed IN");

            //connect db
            







        }else if( back == ae.getSource()){
            // System.out.println("Signed IN");
            this.setVisible(false);
            new App().setVisible(true);
        }else if(ae.getSource()== addMember ){
            //take info and store it
                for(int i=0 ; i<3;i++){
                    tempStorage[t][i]= tarrMem[i].getText();   
                    tarrMem[i].setText("");
                }
                t++;
                
            if(memCounter != numMem+1){
                addMemberFunction();
            }else{
                toggleDisplay(false);
                enabler(true);
            }

        }
    }

    private void enabler(boolean t){
            tarr[0].setEnabled(t);
            tarr[2].setEnabled(t);
            tarr[4].setEnabled(t);
        for(i=0;i<2;i++){
            parr[i].setEnabled(t);
        }
    }
    public static void main(String[] args) {
        System.out.println("A");
        new Register().setVisible(true);
    }
}
