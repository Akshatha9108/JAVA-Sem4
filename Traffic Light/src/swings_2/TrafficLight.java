package swings_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ItemListener
{
	public JLabel l1,l2;
	public JRadioButton r1,r2,r3;
	public ButtonGroup bg;
	public JPanel p,p1;
	public A();
	{
		
		setLayout(new GridLAyout(2, 1));
		setSize(800, 400);
		p=new JPanel(new FlowLayout());
		p1=new JPanel(new FlowLayout());
		l1=new JLabel();
		Font f=new Font("Verdana",Font.BOLD, 60);
		l1.setFont(f);
		add(l1);
		p.add(l1);
		add(p);
		l2=new JLabeel("Select Lights");
		p1.add(l2);
		JRadioButton r1=new JRadioButton("Res Light");
		r1.setBackground(Color.red);
		p1.add(r1);
		r1.addItemListener(this);
		JRadioButton r2=new JRadioButton("Yellow Light");
		r2.setBackground(Color.YELLOW);
		p1.add(r2);
		JRadioButton r3=new JRadioButton("Green Light");
		r3.setBackground(Color.GREEN);
		p1.add(r3);
		r3.addItemListener(this);
		add(p1);
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		setVisible(true);
			
	}
}

public class TrafficLight {

}
