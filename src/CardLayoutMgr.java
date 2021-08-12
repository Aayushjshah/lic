import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
// import javax.swing.JButton;
import java.awt.Color;
// import java.awt.event.ActionListener;


public class CardLayoutMgr extends JFrame{
    CardLayout cl = new CardLayout();
    
        
    int i=0;
    final int height=650;
    final int fwidth = 900;
    final int pclwidth= 660;
    final int pclheight=605;
    FontPicker fp = new FontPicker();
    JPanel pcl = new JPanel(cl);
    VerticalNav vn = new VerticalNav(this);
    JPanel p1 = vn.p1;
    CardLayoutMgr(){
        
        setBounds(350,120,fwidth,height);
        System.out.println("AAYUSH");
        pcl.setBounds(220,5,pclwidth,pclheight);   //the outer right panel
        pcl.setBackground(Color.WHITE);
        // pcl.setLayout(cl);
        add(p1);
        
        PolicyDetailsDisplay1 pdd1 = new PolicyDetailsDisplay1(this,"Manraj");   //panel added to pcl
        PolicyDetailsDisplay2 pdd2 = new PolicyDetailsDisplay2(this,"Manraj","Jignesh");   //panel added to pcl
        IndividualPolicyDetailsDisplay1 ipdd1 = new IndividualPolicyDetailsDisplay1(this);  //panel added to pcl
        pcl.add(pdd1.jsp,"pdd1");
        pcl.add(pdd2.jsp,"pdd2");
        pcl.add(ipdd1,"ipdd1");

        add(pcl);
        cl.show(pcl,"pdd1");//cl is cardLayout
        

//end
        setLayout(null);
        // this.setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        System.out.println("*********");
    }

    public void setr(String i){
        System.out.println("In setr");
        if(i.equals("ipdd1")){
            this.varSize(0,0);
        }else{
            pcl.setSize(pclwidth,pclheight);
            this.setSize(fwidth,height);
        }
        cl.show(pcl,i);  
        
    }
    public void varSize(int widthInc,int heightInc){
        pcl.setSize(pcl.getWidth()+ widthInc, pcl.getHeight()+heightInc);
        this.setSize(this.getWidth()+widthInc,this.getHeight()+heightInc);
    }

    public static void main(String[] args){
        new CardLayoutMgr();
    }
    
}
