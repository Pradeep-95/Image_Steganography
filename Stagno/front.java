package Stagno;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class front {
	public static void main(String[] args) {
		new Frame1();
	}

}

class Frame1 extends JFrame implements ActionListener
{
	JFrame frame;
	
	JButton button1;
	JButton button2;
	JButton button3;
	
	
	Frame1()
	{
		frame=new JFrame();
		
		/*
		JLabel logoArea = null;
		try {
			logoArea = new JLabel(new ImageIcon(ImageIO.read(new File("src\\Stagno\\logo1.jpg"))));
		} catch (IOException e) {
			System.out.print("Logo image issue :"+e.getMessage());
		}
		frame.add(logoArea);
		logoArea.setBounds(100, 50, 70, 70);
		*/
		
		JPanel red=new JPanel();
		red.setBackground(Color.red);
		red.setBounds(70, 25, 50, 50);
		red.setOpaque(true);
		red.setLayout(new BorderLayout());
		
		JLabel label1=new JLabel();
		label1.setText("B");
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		
		red.add(label1);
		
		JPanel green=new JPanel();
		green.setBackground(Color.green);
		green.setBounds(120, 25, 50, 50);
		green.setOpaque(true);
		green.setLayout(new BorderLayout());
		
		JLabel label2=new JLabel();
		label2.setText("I");
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(Color.green);
		label2.setOpaque(true);
		
		green.add(label2);
		
		JPanel blue=new JPanel();
		blue.setBackground(Color.blue);
		blue.setBounds(70, 73, 100, 50);
		blue.setOpaque(true);
		blue.setLayout(new BorderLayout());
		
		JLabel label3=new JLabel();
		label3.setText("TS");
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBackground(Color.blue);
		label3.setOpaque(true);
		
		blue.add(label3);
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		
		JLabel title1=new JLabel("Image");
		title1.setFont(new Font("Serif",Font.PLAIN,50));
		title1.setBounds(180, 50, 150, 80);
		
		JLabel title2=new JLabel("Stagnography");
		title2.setFont(new Font("Serif",Font.PLAIN,50));
		title2.setBounds(100, 100, 350, 80);
		
		button1=new JButton("Hide");
		
		button2=new JButton("Show");
		
		button3=new JButton("Exit");
		
		button1.setBounds(100, 225, 80, 60);
		button1.setBackground(Color.red);
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setForeground(Color.green);
		
		button2.setBounds(300, 225, 80, 60);
		button2.setBackground(Color.red);
		button2.addActionListener(this);
		button2.setFocusable(false);
		button2.setForeground(Color.green);
		
		button3.setBounds(200, 310, 80, 60);
		button3.setBackground(Color.red);
		button3.addActionListener(this);
		button3.setFocusable(false);
		button3.setForeground(Color.green);
		
		frame.add(title1);
		frame.add(title2);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1)
		{
			frame.dispose();
			new Frame2();
		}
		else if(e.getSource()==button2)
		{
			frame.dispose();
			new Frame3();
		}
		else if(e.getSource()==button3)
		{
			int p=JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Exit",JOptionPane.YES_NO_OPTION);
			if(p==0)
				frame.dispose();
		}
	}
}

class Frame2 extends JFrame implements ActionListener
{
	JFrame frame=new JFrame("Hide Data");
	JButton exit,back; 
	JButton select,buttonHide;
	File selectedImage=null;
	JTextArea textArea=null;
	
	Frame2()
	{
		JPanel red=new JPanel();
		red.setBackground(Color.red);
		red.setBounds(125, 50, 50, 50);
		red.setOpaque(true);
		red.setLayout(new BorderLayout());
		
		JLabel label1=new JLabel();
		label1.setText("B");
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		
		red.add(label1);
		
		JPanel green=new JPanel();
		green.setBackground(Color.green);
		green.setBounds(175, 50, 50, 50);
		green.setOpaque(true);
		green.setLayout(new BorderLayout());
		
		JLabel label2=new JLabel();
		label2.setText("I");
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(Color.green);
		label2.setOpaque(true);
		
		green.add(label2);
		
		JPanel blue=new JPanel();
		blue.setBackground(Color.blue);
		blue.setBounds(125, 100, 100, 50);
		blue.setOpaque(true);
		blue.setLayout(new BorderLayout());
		
		JLabel label3=new JLabel();
		label3.setText("TS");
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBackground(Color.blue);
		label3.setOpaque(true);
		
		blue.add(label3);
		
		JLabel title1=new JLabel("Hide");
		title1.setFont(new Font("Serif",Font.BOLD,50));
		title1.setBounds(230, 40, 150, 80);
		title1.setForeground(Color.darkGray);
		
		JLabel title2=new JLabel("Data");
		title2.setFont(new Font("Serif",Font.BOLD,50));
		title2.setBounds(325, 90, 150, 80);
		title2.setForeground(Color.black);
		
		select=new JButton("Select a file");
		select.setBounds(100, 250, 150, 80);
		select.addActionListener(this);
		select.setFocusable(false);
		
		JLabel title3=new JLabel("Enter the data to be hidden:");
		title3.setBounds(270, 160, 200, 50);
		
		textArea=new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setColumns(25);
		
		JScrollPane sp=new JScrollPane(textArea);
		sp.setBounds(270, 200, 400, 200);
		
		buttonHide=new JButton("Hide Data");
		buttonHide.setBounds(250,420,100,60);
		buttonHide.addActionListener(this);
		buttonHide.setBackground(Color.yellow);
		buttonHide.setFocusable(false);
		
		exit=new JButton("EXIT");
		exit.setBounds(550,550,100,60);
		exit.addActionListener(this);
		exit.setBackground(Color.red);
		exit.setFocusable(false);
		
		back=new JButton("BACK");
		back.setBounds(50,550,100,60);
		back.addActionListener(this);
		back.setBackground(Color.green);
		back.setFocusable(false);
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(title1);
		frame.add(title2);
		frame.add(select);
		frame.add(title3);
		frame.add(sp);
		frame.add(buttonHide);
		frame.add(exit);
		frame.add(back);
		
		//frame.getContentPane().setBackground(Color.blue);
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit)
		{
			int p=JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Exit",JOptionPane.YES_NO_OPTION);
			if(p==0)
				frame.dispose();
		}
		else if(e.getSource()==back)
		{
			frame.dispose();
			new Frame1();
		}
		else if(e.getSource()==select)
		{
			JFileChooser fileChoose=new JFileChooser();
			int response=fileChoose.showOpenDialog(null);
			if(response==fileChoose.APPROVE_OPTION)
			{
				String filePath=new String(fileChoose.getSelectedFile().getAbsolutePath());
				checker chk=new checker();
				if(chk.imageChecker(filePath))
				{
					selectedImage=new File(chk.converter(filePath));
					select.setText("Image File Selected");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No image file selected. Only .jpg .jpeg .png accepted.","Select correct File",JOptionPane.WARNING_MESSAGE);
					filePath="";
				}
			}
			
		}
		else if(e.getSource()==buttonHide)
		{
			String str=new String(textArea.getText());
			if(selectedImage==null)
			{
				JOptionPane.showMessageDialog(null,"Image File not selected. Please Select a file","Select a File",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(str.length()==0)
			{
				JOptionPane.showMessageDialog(null,"No data present in the text area.","Enter Data",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				BufferedImage img = null;
				try {
					img=ImageIO.read(new File(selectedImage.toString()));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				if(img==null)
				{
					JOptionPane.showMessageDialog(null,"Unable to load the file.","File Issue",JOptionPane.INFORMATION_MESSAGE);
					
				}
				else
				{
					if(str.length()*8<=(img.getHeight()-1)*(img.getWidth()*6))
					{
						textConversion textConv=new textConversion();
						str=textConv.StringToBool(str);
						
						hideData hide=new hideData();
						BufferedImage newImg=hide.Hide(img, str);
						JFileChooser save=new JFileChooser();
						int saveResponse=save.showSaveDialog(null);
						if(saveResponse==save.APPROVE_OPTION)
						{
							File saveLoc=save.getSelectedFile();
							String fileName = saveLoc.getAbsolutePath();
			                if (!fileName.toLowerCase().endsWith(".jpg") && !fileName.toLowerCase().endsWith(".png")
			                        && !fileName.toLowerCase().endsWith(".jpeg")) {
			                    fileName += ".png";
			                }
		
			                try {
								ImageIO.write(newImg, "png", new File(fileName));
								JOptionPane.showMessageDialog(null,"Your Data is hidden successfully.","File Saved",JOptionPane.INFORMATION_MESSAGE);
								textArea.setText("");
							} catch (IOException e1) {
								e1.printStackTrace();
								JOptionPane.showMessageDialog(null,"Unable to save your file. Please try again.","File Saving Error",JOptionPane.WARNING_MESSAGE);
							}
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Too long data unable to hide. Please reduce it.","Data Overflow",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		}
	}
}

class Frame3 extends JFrame implements ActionListener
{
	JFrame frame=new JFrame("Show Data");
	JButton exit,back;
	JButton select,buttonShow;
	File selectedImage=null;
	JLabel title3;
	JTextArea data;
	JScrollPane sp;
	
	Frame3()
	{
		JPanel red=new JPanel();
		red.setBackground(Color.red);
		red.setBounds(125, 50, 50, 50);
		red.setOpaque(true);
		red.setLayout(new BorderLayout());
		
		JLabel label1=new JLabel();
		label1.setText("B");
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBackground(Color.red);
		label1.setOpaque(true);
		
		red.add(label1);
		
		JPanel green=new JPanel();
		green.setBackground(Color.green);
		green.setBounds(175, 50, 50, 50);
		green.setOpaque(true);
		green.setLayout(new BorderLayout());
		
		JLabel label2=new JLabel();
		label2.setText("I");
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(Color.green);
		label2.setOpaque(true);
		
		green.add(label2);
		
		JPanel blue=new JPanel();
		blue.setBackground(Color.blue);
		blue.setBounds(125, 100, 100, 50);
		blue.setOpaque(true);
		blue.setLayout(new BorderLayout());
		
		JLabel label3=new JLabel();
		label3.setText("TS");
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setBackground(Color.blue);
		label3.setOpaque(true);
		
		blue.add(label3);
		
		JLabel title1=new JLabel("Show");
		title1.setFont(new Font("Serif",Font.BOLD,50));
		title1.setBounds(230, 40, 150, 80);
		title1.setForeground(Color.darkGray);
		
		JLabel title2=new JLabel("Data");
		title2.setFont(new Font("Serif",Font.BOLD,50));
		title2.setBounds(325, 90, 150, 80);
		title2.setForeground(Color.darkGray);
		
		select=new JButton("Select a file");
		select.setBounds(100, 250, 150, 80);
		select.addActionListener(this);
		select.setFocusable(false);
		
		buttonShow=new JButton("Show Data");
		buttonShow.setBounds(100,350,150,60);
		buttonShow.addActionListener(this);
		buttonShow.setBackground(Color.yellow);
		buttonShow.setFocusable(false);
		
		title3=new JLabel("Your Hidden Data: ");
		title3.setBounds(270, 160, 200, 50);
		title3.setVisible(false);
		
		data=new JTextArea();
		
		sp=new JScrollPane(data);
		sp.setBounds(270, 200, 400, 350);
		sp.setVisible(false);
		
		exit=new JButton("EXIT");
		exit.setBounds(550,550,100,60);
		exit.addActionListener(this);
		exit.setBackground(Color.red);
		exit.setFocusable(false);
		
		back=new JButton("BACK");
		back.setBounds(50,550,100,60);
		back.addActionListener(this);
		back.setBackground(Color.green);
		back.setFocusable(false);
		
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(title1);
		frame.add(title2);
		frame.add(select);
		frame.add(buttonShow);
		frame.add(title3);
		frame.add(sp);
		frame.add(exit);
		frame.add(back);
		
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(700,700);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit)
		{
			int p=JOptionPane.showConfirmDialog(null,"Do you really want to exit?","Exit",JOptionPane.YES_NO_OPTION);
			if(p==0)
				frame.dispose();
		}
		else if(e.getSource()==back)
		{
			frame.dispose();
			new Frame1();
		}
		else if(e.getSource()==select)
		{
			JFileChooser fileChoose=new JFileChooser();
			int response=fileChoose.showOpenDialog(null);
			if(response==fileChoose.APPROVE_OPTION)
			{
				String filePath=new String(fileChoose.getSelectedFile().getAbsolutePath());
				checker chk=new checker();
				if(chk.imageChecker(filePath))
				{
					selectedImage=new File(chk.converter(filePath));
					select.setText("Image File Selected");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No image file selected. Only .jpg .jpeg .png accepted.","Select correct File",JOptionPane.WARNING_MESSAGE);
					filePath="";
				}
			}
		}
		else if(e.getSource()==buttonShow)
		{
			if(selectedImage==null)
			{
				JOptionPane.showMessageDialog(null,"Image File not selected. Please Select a file","Select a File",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				showData show=new showData();
				textConversion textConv=new textConversion();
				BufferedImage img = null;
				try {
					img=ImageIO.read(new File(selectedImage.toString()));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				String s=new String(show.show(img));
				s=textConv.bitsToChar(s);
				data.setText(s);
				JOptionPane.showMessageDialog(null,"Your hidden data is in the text area.","Data gathered",JOptionPane.INFORMATION_MESSAGE);
				sp.setVisible(true);
				title3.setVisible(true);
				data.setVisible(true);
			}
		}
	}
}

class checker
{
	boolean imageChecker(String s)
	{
		String s1=new String(s.substring(s.indexOf('.')));
		if(s1.equals(".jpg") || s1.equals(".jpeg") || s1.equals(".png"))		
		{
			return true;
		}
		return false;
	}
	String converter(String s)
	{
		String temp=new String();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==92) // '\\'= '\'
			{		
				temp+='\\';
			}
			temp+=s.charAt(i);
		}
		return temp;
	}
}

class textConversion
{
	String StringToBool(String str)
	{
		String s=new String();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			String a1=new String();
			int p=(int)str.charAt(i);
			a1=Integer.toBinaryString(p);
			a1=String.format("%8s",a1);
			String a3=a1.replace(' ', '0');
			s+=a3;
		}
		return s;
	}
	
	String bitsToChar(String str)
	{
		String s=new String();
		int l=str.length(),i=0;
		while(i<l)
		{
			int p=0;
			for(int j=0;j<8;j++)
			{
				p+=(int)(str.charAt(j+i)-'0')*Math.pow(2,7-j);
			}
			
			i+=8;
			char ch=(char)p;
			s+=ch;
		}
		return s;
	}
}

class showData
{
	String show(BufferedImage img)
	{
		String msg=new String();
		int width=img.getWidth(),height=img.getHeight();
		
		String len=new String();
		
		for(int i=width-14;i<width;i++)
		{
			int pixel=img.getRGB(i,0);
			
			int red=(pixel>>16)&3;
			String s=Integer.toBinaryString(red);
			s=String.format("%2s",s);
			s=s.replace(' ','0');
			len+=s;
			
			int green=(pixel>>8)&3;
			s=Integer.toBinaryString(green);
			s=String.format("%2s",s);
			s=s.replace(' ','0');
			len+=s;
			
			int blue=pixel&3;
			s=Integer.toBinaryString(blue);
			s=String.format("%2s",s);
			s=s.replace(' ','0');
			len+=s;
		}
		
		String str=new String();
		str=len.substring(4);
		str=saperate(str);
		
		textConversion textConv=new textConversion();
		
		str=textConv.bitsToChar(str);
		int lnth=strToNum(str),q=0;
		
		for(int i=1;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				
					int pixel=img.getRGB(j,i);
					int red=(pixel>>16)&3;
					int green=(pixel>>8)&3;
					int blue=pixel&3;
					
					if(q<lnth)
					{
						String s=Integer.toBinaryString(red);
						s=String.format("%2s", s);
						s=s.replace(' ','0');
						msg+=s;
						q=q+2;
					}
					if(q<lnth)
					{
						String s=Integer.toBinaryString(green);
						s=String.format("%2s", s);
						s=s.replace(' ','0');
						msg+=s;
						q=q+2;
					}
					if(q<lnth)
					{
						String s=Integer.toBinaryString(blue);
						s=String.format("%2s", s);
						s=s.replace(' ','0');
						msg+=s;
						q=q+2;
					}
				
				
			}
			if(q>=lnth)
			{
				break;
			}
		}
		
		return msg;
	}
	
	int strToNum(String str)
	{
		int l=str.length(),ans=0;
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				ans=ans*10+(str.charAt(i)-'0');
			}
		}
		return ans;
		
	}
	
	String saperate(String str)
	{
		int l=str.length(),i=0;
		boolean t=false;
		while(i<l)
		{
			for(int j=0;j<8;j++)
			{
				if(str.charAt(i+j)!='0')
				{
					t=true;
				}
			}
			if(t==true)
			{
				str=str.substring(i);
				break;
			}
			i=i+8;
		}
		return str;
	}
}

class hideData
{
	BufferedImage Hide(BufferedImage img, String str)
	{
		int width=img.getWidth(),height=img.getHeight();
		BufferedImage img2=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		int len=str.length();
		
		textConversion textCon=new textConversion();
		String s=new String(textCon.StringToBool(Integer.toString(len)));
		int len2=s.length(),q=0;
		if(len2<84)
		{
			String st=new String();
			for(int i=0;i<84-len2;i++)
			{
				st+='0';
			}
			for(int i=0;i<len2;i++)
			{
				st+=s.charAt(i);
			}
			s=new String(st);
		}
		len2=s.length();
		
		
		for(int i=0;i<width;i++)
		{
			int pixel=img.getRGB(i,0);
			if(i<width-14)
			{
				img2.setRGB(i, 0, pixel);
				continue;
			}
			int red=(pixel>>16)&252;
			int green=(pixel>>8)&252;
			int blue=(pixel)&252;
			
			
			if(q<len2)
			{
				int p=(int)(s.charAt(q++)-'0')*2;
				p+=(int)(s.charAt(q++)-'0');
				red=red|p;
			}
			if(q<len2)
			{
				int p=(int)(s.charAt(q++)-'0')*2;
				p+=(int)(s.charAt(q++)-'0');
				green=green|p;
			}
			if(q<len2)
			{
				int p=(int)(s.charAt(q++)-'0')*2;
				p+=(int)(s.charAt(q++)-'0');
				blue=blue|p;
			}
			int rbg=(((red<<16)|green<<8)|blue);
			img2.setRGB(i, 0, rbg);
	
		}
		
		q=0;
		for(int i=1;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				int pixel=img.getRGB(j,i);
				if(len<=q)
				{
					img2.setRGB(j, i, pixel);
					continue;
				}
				int red=(pixel>>16)&252;
				int green=(pixel>>8)&252;
				int blue=(pixel)&252;
				
				
				if(len>q)
				{
					int p=(int)(str.charAt(q++)-'0')*2;
					p+=(int)(str.charAt(q++)-'0');
					red=red|p;
				}
				if(len>q)
				{
					int p=(int)(str.charAt(q++)-'0')*2;
					p+=(int)(str.charAt(q++)-'0');
					green=green|p;
				}
				if(len>q)
				{
					int p=(int)(str.charAt(q++)-'0')*2;
					p+=(int)(str.charAt(q++)-'0');
					blue=blue|p;
				}
				int rgb=((red<<16)|(green<<8))|blue;
				img2.setRGB(j, i, rgb);
				
			}
			
		}
		return img2;
	}
}