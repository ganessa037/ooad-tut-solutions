import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Date; 

public class GUI extends JFrame{ 
    public GUI(String title){ 
        super(title); 
        setSize(450,180); 
        Container content = getContentPane(); 
        content.setBackground(Color.white); 
        content.setLayout(new FlowLayout()); 
        content.add(new JLabel("Hello world!")); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    } 
    public void paint(Graphics g){ 
        Font f=new Font("Times New Roman",Font.BOLD,20); 
        g.setColor(Color.cyan); 
        g.fillRect(0,0,800,600); 
        g.setFont(f); 
        g.setColor(Color.yellow); 
        g.fillRect(20,45,400,50); 
        g.setColor(Color.pink); 
        g.fillRect(20,105,400,60); 
        g.setColor(Color.blue); 
        g.drawString("Welcome to Java Graphics",30,65); 
        g.drawString("Today is "+ new Date(),30,130); 
    }  

    public static void main (String args[]){ 
        JFrame nframe = new GUI("This is a GUI application"); 
        nframe.setVisible(true);  
    } 
} 