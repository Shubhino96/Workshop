import java.awt.*;
import javax.swing.*;
public class gui1 extends JFrame
{
	private JButton button1;
	private JTextField txtfld;
	private ImageIcon img;
	private JLabel lb1;
	public gui1()
	{
		setLayout(new FlowLayout());
		txtfld=new JTextField(20);
		add(txtfld);
		button1=new JButton("image");
		add(button1);
		img=new ImageIcon(getClass().getResource("download.jpg"));
		lb1=new JLabel(img);
		add(lb1);
	}
	public static void main(String args[])
	{
		gui1 g=new gui1();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		g.pack();
	}
}