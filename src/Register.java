import javax.swing.*;
import java.awt.Color;
public class Register extends JFrame{
    Register(){
        setBounds(400,170,780,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);


        // String query = "insert into login values('"+ tId+"' , '"+hashedPassword+"')";
    }
    public static void main(String[] args) {
        System.out.println("A");
        new Register().setVisible(true);
    }
}
