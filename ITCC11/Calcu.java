import javax.swing.*;
import java.awt.*;

class Calcu{
	private JFrame frame; 
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	private GridLayout layout;
	private JSplitPane split;
	private JPanel topPanel;
	private JPanel bottomPanel;
	
	
	public Calcu(){
		/*creates Window*/
		frame = new JFrame("Rio's Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		/*set layout*/
		layout = new GridLayout(5,9);
		 topPanel = new JPanel();
		 bottomPanel = new JPanel();
		 topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
		 bottomPanel.setLayout(layout);
		 
		split = new JSplitPane();
		split.setOrientation(JSplitPane.VERTICAL_SPLIT);
		split.setDividerLocation(50);
		split.setTopComponent(topPanel);
		split.setBottomComponent(bottomPanel);
		
		// create number buttons
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		
		// create operator buttons
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bclr=new JButton("C");
		
		// create . buttons
		bdec=new JButton(".");
		
		// create equal button
		beq=new JButton("=");
		
	
		bottomPanel.add(b1);
		b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
		b1.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b2);
		b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
		b2.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b3);
		b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
		b3.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(bclr);
		bclr.setBackground(Color.orange);
		bclr.setForeground(Color.white);
		bclr.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b4);
		b4.setBackground(Color.gray);
        b4.setForeground(Color.white);
		b4.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b5);
		b5.setBackground(Color.gray);
        b5.setForeground(Color.white);
		b5.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b6);
		b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
		b6.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(badd);
		badd.setBackground(Color.orange);
		badd.setForeground(Color.white);
		badd.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b7);
		b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
		b7.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b8);
		b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
		b8.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(b9);
		b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
		b9.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(bsub);
		bsub.setBackground(Color.orange);
		bsub.setForeground(Color.white);
		bsub.setFont(new Font("Serif", Font.BOLD, 24));
		
		
		bottomPanel.add(b0);
		b0.setBackground(Color.gray);
        b0.setForeground(Color.white);
		b0.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(bdiv);
		bdiv.setBackground(Color.orange);
		bdiv.setForeground(Color.white);
		bdiv.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(bdec);
		bdec.setBackground(Color.orange);
		bdec.setForeground(Color.white);
		bdec.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(bmul);
		bmul.setBackground(Color.orange);
		bmul.setForeground(Color.white);
		bmul.setFont(new Font("Serif", Font.BOLD, 24));
		
		bottomPanel.add(beq);
		beq.setBackground(Color.orange);
		beq.setForeground(Color.white);
		beq.setFont(new Font("Serif", Font.BOLD, 24));
		
		frame.add(split);
		
	}
	
	public void show() {
		frame.setVisible(true);		
	}
}