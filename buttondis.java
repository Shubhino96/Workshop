import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class buttondis extends JFrame
{
	private JButton button1;
	public ImageIcon img;
	public JLabel lb1;
	public buttondis()
	{
		setLayout(new FlowLayout());
		button1=new JButton("image");
		add(button1);
		img=new ImageIcon(getClass().getResource("download.jpg"));
		lb1=new JLabel();
		add(lb1);
		evnt E=new evnt();
		button1.addActionListener(E);
	}
	public class evnt implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			lb1.setIcon(img);
		}
	}
	public static void main(String args[])
	{
		buttondis g=new buttondis();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		g.setSize(200,200);
	}
}

