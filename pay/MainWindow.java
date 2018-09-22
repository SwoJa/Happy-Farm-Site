package com.SwoTec.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField useridTextField;
	private JTextField enTextField;
	private JTextField woTextField;
	private JTextField coTextField;
	private JTextField genTextField;
	private JTextField saveTextField;
	private JTextField xTextField;
	private JTextField dTextField;
	private JTextField pTextField;
	private JTextField sTextField;
	private JTextField kTextField;
	private JTextField pmcTextField;
	private JTextField fTextField;
	private JTextField eTextField;
	private JCheckBox sCheckBox;
	private JCheckBox cCheckBox;
	private JCheckBox mCheckBox;
	private JCheckBox dCheckBox;
	private JButton createbankbutton;
	private JTextField meTextField;
	private JTextField deTextField;
	private JTextField ciTextField;
	private JTextField siTextField;
	private JCheckBox seeCheckBox;
//	public String vCode=null;

	public String gw,vCode=null,xp,m,d,s,c,userid,en,wo,co,xinbing,putong,kunnan,fengkuang,emeng,gen,duikang,shengcun,pmc,save,see;
	private JTextField transferTextField;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/com/SwoTec/image/1.ico")));
		setTitle("\u65B0\u7248UA3\u5B58\u6863\u4FEE\u6539/\u751F\u6210\u5668 Write By.\u714E\u86CB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 781);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 Toolkit tk=Toolkit.getDefaultToolkit();
		   Image image=tk.createImage("/com/SwoTec/image/1.ico");    //括号里为图片的相对路径
		   this.setIconImage(image);
		
		JLabel helplabel = new JLabel("<html><p>\u5B58\u6863\u751F\u6210\u529F\u80FD\uFF1A</p></p>\u9700\u8981\u63D0\u4F9B\u8981\u751F\u6210\u5B58\u6863\u8D26\u53F7\u7684\u751F\u7269ID</p>\u5982\uFF1A5-S2-1-1234567\uFF08\u6CE8\u610F\uFF0C\u5927\u5C0F\u5199\u654F\u611F\uFF09\r\n<p>\u751F\u7269ID\u5728 \u6211\u7684\u6587\u6863\\StarCraft II\\Accounts\\\u8D26\u53F7\u4EE3\u7801\\\u751F\u7269ID\\</p>\r\n<p>\u4EA6\u53EF\u4EE5\u8FDB\u5165\u4E00\u5C40\u6E38\u620F\uFF0C\u70B9SA\u4FDD\u5B58\u4E00\u4E0B\u8BB0\u4F4F\u5F39\u51FA\u7684\u751F\u7269ID</p>\r\n<p>\u7136\u540E\u6839\u636E\u63D0\u793A\u586B\u4F60\u9700\u8981\u7684\u503C\u4FBF\u53EF\r\n\u70B9\u51FB\u751F\u6210\u4F1A\u5728\u6587\u4EF6\u5939\u4E0B\u751F\u6210\u4E00\u4E2AUA3.sc2bank\u6587\u4EF6</p>\r\n<p>\u5C06\u5176\u590D\u5236\u5230\u4E0A\u6587\u8DEF\u5F84\u4E2D\u4F60\u7684\u751F\u7269ID\u6587\u4EF6\u5939\u4E0B\u7684</p>\r\n<p>\u751F\u7269ID\\Banks\\5-S2-1-2754543\u6587\u4EF6\u5939\u4E2D\r\n\u8986\u76D6\u539F\u6709\u6587\u4EF6\uFF0C\u4E4B\u540E\u65B0\u5F00\u4E00\u5C40\u70B9\u4FDD\u5B58\u5373\u53EF\u5B8C\u6210</p></html>\r\n\r\n\r\n\r\n");
		helplabel.setFont(new Font("宋体", Font.PLAIN, 13));
		helplabel.setBounds(10, 395, 511, 124);
		helplabel.setVerticalAlignment(SwingConstants.BOTTOM);
		helplabel.setBackground(new Color(240, 240, 240));
		helplabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(helplabel);
		
		JLabel versionlabel = new JLabel("<html><p>version 1.1.0</p>\r\n<p>\u81EA\u8C6A\u7684\u91C7\u7528Java</p>\r\n<p>\u7A0B\u5E8F\u4EA4\u6D41\u8BF7\u52A0Q</p>\r\n<p>675523206</p>\r\n<p>\u9057\u6F0F\u4E4B\u5904\uFF0C\u591A\u591A\u6307\u6559</p></html>");
		versionlabel.setFont(new Font("宋体", Font.PLAIN, 12));
		versionlabel.setLabelFor(versionlabel);
		versionlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		versionlabel.setBounds(578, 438, 127, 81);
		contentPane.add(versionlabel);
		
		createbankbutton = new JButton("\u751F\u6210\u5B58\u6863");
		createbankbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JTextField useridTextField;
				JTextField enTextField;
				JTextField woTextField;
				JTextField coTextField;
				JTextField genTextField;
				JTextField saveTextField;
				JTextField xTextField;
				JTextField dTextField;
				JTextField pTextField;
				JTextField sTextField;
				JTextField kTextField;
				JTextField pmcTextField;
				JTextField fTextField;
				JTextField eTextField;
				JCheckBox sCheckBox;
				JCheckBox cCheckBox;
				JCheckBox mCheckBox;
				JCheckBox dCheckBox;
				JTextField meTextField;
				JTextField deTextField;
				JTextField ciTextField;
				JTextField siTextField;
				JButton createbankbutton;
				JCheckBox seeCheckBox;
			}
		});
		createbankbutton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
						
						
					
						userid=useridTextField.getText().toString();
						 en=enTextField.getText().toString();
						 wo=woTextField.getText().toString();
						 co=coTextField.getText().toString();
						 xinbing=xTextField.getText().toString();
						 putong=pTextField.getText().toString();
						 kunnan=kTextField.getText().toString();
						 fengkuang=fTextField.getText().toString();
						 emeng=eTextField.getText().toString();
						 duikang=dTextField.getText().toString();
						 shengcun=sTextField.getText().toString();
						 pmc=pmcTextField.getText().toString();
						 gen=genTextField.getText().toString();
						 save=saveTextField.getText().toString();
						 m=meTextField.getText().toString();
						 d=deTextField.getText().toString();
						 s=siTextField.getText().toString();
						 c=ciTextField.getText().toString();
						
						 
						if (mCheckBox.isSelected())  
						m=m.replace('0', '1');
						
						if (dCheckBox.isSelected()) 
						 d=d.replace('0', '1');
						
						if (sCheckBox.isSelected())  
						 s=s.replace('0', '1');
						
						if (cCheckBox.isSelected())  
						 c=c.replace('0', '1');
						
						if (seeCheckBox.isSelected())  
						{see="1";}
						else {see="0";}
						s+=see;
						xp=en+" "+wo+" "+co;
						gw=xinbing+" "+putong+" "+kunnan+" "+fengkuang+" "+emeng+" "+duikang+" "+shengcun+" "+pmc;
					
						
							
							
							
//							for (int i = 0; i < 17; i++) 
//							{
//								c+=Math.pow(2,i);
//							}
//							for (int i = 0; i <13 ; i++)
//							{
//								m+=Math.pow(2,i);
//							}
//							for (int i = 0; i < 10; i++) {
//								d+=Math.pow(2, i);
//							}
//							for (int i = 0; i < 23; i++) {
//								s+=Math.pow(2, i);
//							}
//							c+=99;//C
//							m*=13;
//							d*=15;
//							s+=175;

							

							
						long max=0;
							String vCode=null;
							max=cCoder(c)+mCoder(m)+dCoder(d)+sCoder(s)+idCoder(userid)+xpCoder(xp);
							vCode=Long.toString(max);
							vCode = vCode.replace( '1', '@');
					        vCode = vCode.replace( '2', '$');
					        vCode = vCode.replace( '3', '^');
					        vCode = vCode.replace( '4', '*');
					        vCode = vCode.replace( '5', ')');
					        vCode = vCode.replace( '6', '!');
					        vCode = vCode.replace( '7', '#');
					        vCode = vCode.replace( '8', '%');
					        vCode = vCode.replace( '9', '~');
					        vCode = vCode.replace( '0', '(');
//							System.out.println(vCode);
					        new Writer().codingFile(vCode, xp, m, d, gw, s, gen, c,save);
					        
					}
						
						private long idCoder(String user)
						{
							String[] realid=user.split("-");
							return Integer.parseInt(realid[3])*5;
						}
						private long xpCoder(String user)
						{
							String[] realid=user.split(" ");
							return Integer.parseInt(realid[0])*3+Integer.parseInt(realid[1])*5+Integer.parseInt(realid[2])*9+159;	
						}
						private long cCoder(String c) {
							
							return Integer.parseInt(Integer.valueOf(c,2).toString())+99;
						}
						private long mCoder(String m) {
							
							return Integer.parseInt(Integer.valueOf(m,2).toString())*13;
						}
						private long dCoder(String d) {
							
							return Integer.parseInt(Integer.valueOf(d,2).toString())*15;
						}
						private int sCoder(String s) {
							int num3=0;
							for (int i = 0; i <= 39; i++) {
								if (s.charAt(i)=='1') {
									num3 += 1 << (39 -i);
								}
							}
							
							return num3+175;
						}
					    
					
					
					
				
			
		});
		
		createbankbutton.setBounds(512, 246, 127, 54);
		contentPane.add(createbankbutton);
		
		JLabel useridlabel = new JLabel("\u751F\u7269ID\uFF1A");
		useridlabel.setForeground(Color.MAGENTA);
		useridlabel.setFont(new Font("楷体", Font.PLAIN, 20));
		useridlabel.setBounds(10, 12, 107, 33);
		contentPane.add(useridlabel);
		
		JLabel enlabel = new JLabel("EN\u7ECF\u9A8C\uFF1A");
		enlabel.setForeground(Color.MAGENTA);
		enlabel.setFont(new Font("楷体", Font.PLAIN, 20));
		enlabel.setBounds(10, 70, 107, 33);
		contentPane.add(enlabel);
		
		JLabel wolabel = new JLabel("WO\u7ECF\u9A8C\uFF1A");
		wolabel.setForeground(Color.MAGENTA);
		wolabel.setFont(new Font("楷体", Font.PLAIN, 20));
		wolabel.setBounds(10, 115, 107, 33);
		contentPane.add(wolabel);
		
		JLabel colabel = new JLabel("CO\u7ECF\u9A8C\uFF1A");
		colabel.setForeground(Color.MAGENTA);
		colabel.setFont(new Font("楷体", Font.PLAIN, 20));
		colabel.setBounds(10, 156, 107, 33);
		contentPane.add(colabel);
		
		mCheckBox = new JCheckBox("\u89E3\u9501\u5168\u90E8\u52CB\u7AE0");
		mCheckBox.setForeground(Color.MAGENTA);
		mCheckBox.setFont(new Font("楷体", Font.PLAIN, 20));
		mCheckBox.setBounds(6, 210, 288, 23);
		contentPane.add(mCheckBox);
		
		dCheckBox = new JCheckBox("\u89E3\u9501\u5168\u90E8\u80A9\u7AE0");
		dCheckBox.setForeground(Color.MAGENTA);
		dCheckBox.setFont(new Font("楷体", Font.PLAIN, 20));
		dCheckBox.setBounds(6, 235, 288, 23);
		contentPane.add(dCheckBox);
		
		cCheckBox = new JCheckBox("\u89E3\u9501\u65E7\u7248+EVA\u5168\u90E8\u519B\u670D\u517118\u5957");
		cCheckBox.setForeground(Color.MAGENTA);
		cCheckBox.setFont(new Font("楷体", Font.PLAIN, 20));
		cCheckBox.setBounds(6, 260, 288, 23);
		contentPane.add(cCheckBox);
		
		sCheckBox = new JCheckBox("\u89E3\u9501\u5168\u90E8\u5929\u8D4B");
		sCheckBox.setForeground(Color.MAGENTA);
		sCheckBox.setFont(new Font("楷体", Font.PLAIN, 20));
		sCheckBox.setBounds(6, 285, 288, 33);
		contentPane.add(sCheckBox);
		
		JLabel helplabel_1 = new JLabel("<html><p>\u6CE8\u610F\uFF1A\u65B0\u7248\u519B\u670D\u4E0E\u5929\u8D4B\u5747\u9700\u8981\u6253\u4E00\u628A\u540E\u663E\u793A\u5DF2\u89E3\u9501XXX\u540E\u4FDD\u5B58\u65B9\u53EF\u4EE5\u540E\u6B63\u5E38\u4F7F\u7528</p>\r\n<p>\u5373\u4F7F\u4E0D\u52FE\u9009\u4EE5\u4E0A\u56DB\u9879\uFF0C\u7531\u4E8EXP\u6216\u5176\u4ED6\u6761\u4EF6\u8FBE\u6210\uFF0C\u8FDB\u5165\u6E38\u620F\u540E\u8FD8\u662F\u4F1A\u77AC\u95F4\u89E3\u9501\u90E8\u5206</p>\r\n<p>\u81EA\u884C\u8BA1\u7B97\u4E09\u79CDXP\u76F8\u52A0\u9664\u4EE5\u603B\u5C40\u6570\u5927\u4E8E10000\u5219\u4F1A\u5728\u5F00\u5C40\u663E\u793A\u6539\u6863</p>\r\n<p>\u51E0\u79CD\u6A21\u5F0F\u5177\u4F53\u5C40\u6570\u4E4B\u548C\u5E94\u5728\u603B\u5C40\u6570\u9664\u4EE510\u52305\u4E3A\u5B9C</p>\r\n<p>\u8F6F\u4EF6\u5F00\u6E90\uFF0C\u61D2\u5F97\u8BBE\u7F6E\u6761\u4EF6\u9650\u5236\uFF0C\u7531\u4E8E\u4E71\u586B\u5BFC\u81F4\u5B58\u6863\u51FA\u9519\u81EA\u5DF1\u68C0\u67E5\uFF0C\u6982\u4E0D\u8D1F\u8D23</p>\r\n<p>\u51FA\u73B0BUG\u6B22\u8FCE\u5411\u53F3\u4E0B\u89D2\u8054\u7CFB\u65B9\u5F0F\u53CD\u9988</p></html>\r\n");
		helplabel_1.setFont(new Font("宋体", Font.PLAIN, 12));
		helplabel_1.setForeground(Color.RED);
		helplabel_1.setVerticalAlignment(SwingConstants.TOP);
		helplabel_1.setBounds(10, 319, 558, 94);
		contentPane.add(helplabel_1);
		
		useridTextField = new JTextField();
		useridTextField.setText("5-S2-1-1234567");
		useridTextField.setBounds(81, 18, 273, 25);
		contentPane.add(useridTextField);
		useridTextField.setColumns(10);
		
		enTextField = new JTextField();
		enTextField.setText("1");
		enTextField.setColumns(10);
		enTextField.setBounds(81, 78, 136, 25);
		contentPane.add(enTextField);
		
		woTextField = new JTextField();
		woTextField.setText("1");
		woTextField.setColumns(10);
		woTextField.setBounds(81, 121, 136, 25);
		contentPane.add(woTextField);
		
		coTextField = new JTextField();
		coTextField.setText("1");
		coTextField.setColumns(10);
		coTextField.setBounds(81, 161, 136, 25);
		contentPane.add(coTextField);
		
		JLabel label = new JLabel("\u603B\u5C40\u6570\uFF1A");
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("楷体", Font.PLAIN, 20));
		label.setBounds(335, 70, 107, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u65B0\u5175\uFF1A");
		label_1.setForeground(Color.MAGENTA);
		label_1.setFont(new Font("楷体", Font.PLAIN, 20));
		label_1.setBounds(335, 115, 107, 33);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u666E\u901A\uFF1A");
		label_2.setForeground(Color.MAGENTA);
		label_2.setFont(new Font("楷体", Font.PLAIN, 20));
		label_2.setBounds(335, 156, 107, 33);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u603B\u590D\u6D3B\u6570\uFF1A");
		label_3.setForeground(Color.MAGENTA);
		label_3.setFont(new Font("楷体", Font.PLAIN, 20));
		label_3.setBounds(490, 70, 107, 33);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u5BF9\u6297\uFF1A");
		label_4.setForeground(Color.MAGENTA);
		label_4.setFont(new Font("楷体", Font.PLAIN, 20));
		label_4.setBounds(490, 113, 107, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u751F\u5B58\uFF1A");
		label_5.setForeground(Color.MAGENTA);
		label_5.setFont(new Font("楷体", Font.PLAIN, 20));
		label_5.setBounds(490, 153, 107, 33);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u56F0\u96BE\uFF1A");
		label_6.setForeground(Color.MAGENTA);
		label_6.setFont(new Font("楷体", Font.PLAIN, 20));
		label_6.setBounds(335, 200, 107, 33);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u75AF\u72C2\uFF1A");
		label_7.setForeground(Color.MAGENTA);
		label_7.setFont(new Font("楷体", Font.PLAIN, 20));
		label_7.setBounds(335, 241, 107, 33);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u5669\u68A6\uFF1A");
		label_8.setForeground(Color.MAGENTA);
		label_8.setFont(new Font("楷体", Font.PLAIN, 20));
		label_8.setBounds(335, 285, 107, 33);
		contentPane.add(label_8);
		
		JLabel lblPmc = new JLabel("PMC\uFF1A");
		lblPmc.setForeground(Color.MAGENTA);
		lblPmc.setFont(new Font("楷体", Font.PLAIN, 20));
		lblPmc.setBounds(500, 191, 107, 33);
		contentPane.add(lblPmc);
		
		genTextField = new JTextField();
		genTextField.setText("1");
		genTextField.setColumns(10);
		genTextField.setBounds(408, 70, 79, 25);
		contentPane.add(genTextField);
		
		saveTextField = new JTextField();
		saveTextField.setText("0");
		saveTextField.setColumns(10);
		saveTextField.setBounds(578, 70, 79, 25);
		contentPane.add(saveTextField);
		
		xTextField = new JTextField();
		xTextField.setText("1");
		xTextField.setColumns(10);
		xTextField.setBounds(387, 115, 79, 25);
		contentPane.add(xTextField);
		
		dTextField = new JTextField();
		dTextField.setText("1");
		dTextField.setColumns(10);
		dTextField.setBounds(541, 115, 79, 25);
		contentPane.add(dTextField);
		
		pTextField = new JTextField();
		pTextField.setText("1");
		pTextField.setColumns(10);
		pTextField.setBounds(387, 161, 79, 25);
		contentPane.add(pTextField);
		
		sTextField = new JTextField();
		sTextField.setText("1");
		sTextField.setColumns(10);
		sTextField.setBounds(541, 156, 79, 25);
		contentPane.add(sTextField);
		
		kTextField = new JTextField();
		kTextField.setText("1");
		kTextField.setColumns(10);
		kTextField.setBounds(387, 206, 79, 25);
		contentPane.add(kTextField);
		
		pmcTextField = new JTextField();
		pmcTextField.setText("1");
		pmcTextField.setColumns(10);
		pmcTextField.setBounds(541, 196, 79, 25);
		contentPane.add(pmcTextField);
		
		fTextField = new JTextField();
		fTextField.setText("1");
		fTextField.setColumns(10);
		fTextField.setBounds(387, 243, 79, 25);
		contentPane.add(fTextField);
		
		eTextField = new JTextField();
		eTextField.setText("1");
		eTextField.setColumns(10);
		eTextField.setBounds(387, 285, 79, 25);
		contentPane.add(eTextField);
		
		JLabel label_9 = new JLabel("\u4E0D\u6B7B\u7A81\u88AD3");
		label_9.setForeground(Color.ORANGE);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.BOLD, 50));
		label_9.setBounds(387, 0, 328, 60);
		contentPane.add(label_9);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(MainWindow.class.getResource("/com/SwoTec/image/img1.jpeg")));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(476, 312, 181, 124);
		contentPane.add(lblNewLabel);
		
		JLabel lblSi = new JLabel("M\uFF1A");
		lblSi.setForeground(Color.MAGENTA);
		lblSi.setFont(new Font("楷体", Font.PLAIN, 20));
		lblSi.setBounds(10, 532, 107, 33);
		contentPane.add(lblSi);
		
		JLabel lblUn = new JLabel("D\uFF1A");
		lblUn.setForeground(Color.MAGENTA);
		lblUn.setFont(new Font("楷体", Font.PLAIN, 20));
		lblUn.setBounds(10, 576, 107, 33);
		contentPane.add(lblUn);
		
		JLabel lblDe = new JLabel("C\uFF1A");
		lblDe.setForeground(Color.MAGENTA);
		lblDe.setFont(new Font("楷体", Font.PLAIN, 20));
		lblDe.setBounds(10, 622, 107, 33);
		contentPane.add(lblDe);
		
		JLabel lblM = new JLabel("S\uFF1A");
		lblM.setForeground(Color.MAGENTA);
		lblM.setFont(new Font("楷体", Font.PLAIN, 20));
		lblM.setBounds(10, 668, 107, 33);
		contentPane.add(lblM);
		
		meTextField = new JTextField();
		meTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				String s = meTextField.getText();
				if(s.length() >= 13) arg0.consume();
			}
		});
		meTextField.setText("0000000000000");
		meTextField.setColumns(10);
		meTextField.setBounds(35, 532, 431, 25);
		contentPane.add(meTextField);
		
		deTextField = new JTextField();
		deTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				String s = deTextField.getText();
				if(s.length() >= 10) e.consume();
			}
		});
		deTextField.setText("0000000000");
		deTextField.setColumns(10);
		deTextField.setBounds(35, 578, 431, 25);
		contentPane.add(deTextField);
		
		ciTextField = new JTextField();
		ciTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				String s = ciTextField.getText();
				if(s.length() >= 17) e.consume();
			}
		});
		ciTextField.setText("00000000000000000");
		ciTextField.setColumns(10);
		ciTextField.setBounds(35, 622, 431, 25);
		contentPane.add(ciTextField);
		
		siTextField = new JTextField();
		siTextField.setText("000000000000000000000000000000000000000");
		siTextField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				String s = siTextField.getText();
				if(s.length() >= 39) e.consume();
			}
		});
		siTextField.setColumns(10);
		siTextField.setBounds(35, 668, 431, 25);
		contentPane.add(siTextField);
		
		JLabel label_10 = new JLabel("\u5341\u4E09\u4F4D");
		label_10.setForeground(Color.MAGENTA);
		label_10.setFont(new Font("楷体", Font.PLAIN, 20));
		label_10.setBounds(476, 524, 107, 33);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u5341\u4F4D");
		label_11.setForeground(Color.MAGENTA);
		label_11.setFont(new Font("楷体", Font.PLAIN, 20));
		label_11.setBounds(476, 570, 107, 33);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u5341\u4E03\u4F4D");
		label_12.setForeground(Color.MAGENTA);
		label_12.setFont(new Font("楷体", Font.PLAIN, 20));
		label_12.setBounds(476, 616, 107, 33);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u4E09\u5341\u4E5D\u4F4D");
		label_13.setForeground(Color.MAGENTA);
		label_13.setFont(new Font("楷体", Font.PLAIN, 20));
		label_13.setBounds(476, 662, 107, 33);
		contentPane.add(label_13);
		
		JLabel lblSt = new JLabel("ST\u7B2C\u5341\u56DB\u4F4D");
		lblSt.setForeground(Color.MAGENTA);
		lblSt.setFont(new Font("楷体", Font.PLAIN, 20));
		lblSt.setBounds(558, 532, 107, 33);
		contentPane.add(lblSt);
		
		JLabel lblBb = new JLabel("BB\u7B2C\u5341\u4E03\u4F4D");
		lblBb.setForeground(Color.MAGENTA);
		lblBb.setFont(new Font("楷体", Font.PLAIN, 20));
		lblBb.setBounds(558, 559, 107, 33);
		contentPane.add(lblBb);
		
		JLabel lblBo = new JLabel("BO\u7B2C\u5341\u4E5D\u4F4D");
		lblBo.setForeground(Color.MAGENTA);
		lblBo.setFont(new Font("楷体", Font.PLAIN, 20));
		lblBo.setBounds(558, 588, 107, 33);
		contentPane.add(lblBo);
		
		transferTextField = new JTextField();
		transferTextField.setColumns(10);
		transferTextField.setBounds(10, 708, 431, 25);
		contentPane.add(transferTextField);
		
		JButton transferButton = new JButton("code->num");
		transferButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		transferButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String tran=transferTextField.getText().toString();
				tran = tran.replace( '@', '1');
		        tran = tran.replace( '$', '2');
		        tran = tran.replace( '^', '3');
		        tran = tran.replace( '*', '4');
		        tran = tran.replace( ')', '5');
		        tran = tran.replace( '!', '6');
		        tran = tran.replace( '#', '7');
		        tran = tran.replace( '%', '8');
		        tran = tran.replace( '~', '9');
		        tran = tran.replace( '(', '0');
		        
		        JOptionPane.showMessageDialog(null, tran);
			}
		});
		transferButton.setBounds(455, 706, 107, 33);
		contentPane.add(transferButton);
		
		JButton btnNumcode = new JButton("num->code");
		btnNumcode.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String traner=transferTextField.getText().toString();
				traner = traner.replace( '1', '@');
		        traner = traner.replace( '2', '$');
		        traner = traner.replace( '3', '^');
		        traner = traner.replace( '4', '*');
		        traner = traner.replace( '5', ')');
		        traner = traner.replace( '6', '!');
		        traner = traner.replace( '7', '#');
		        traner = traner.replace( '8', '%');
		        traner = traner.replace( '9', '~');
		        traner = traner.replace( '0', '(');
				JOptionPane.showMessageDialog(null, traner);
			}
		});
		btnNumcode.setBounds(578, 708, 107, 33);
		contentPane.add(btnNumcode);
		
		seeCheckBox = new JCheckBox("\u6539\u6863\u6807\u8BC6");
		seeCheckBox.setForeground(Color.MAGENTA);
		seeCheckBox.setFont(new Font("楷体", Font.PLAIN, 20));
		seeCheckBox.setBounds(558, 668, 127, 23);
		contentPane.add(seeCheckBox);
		
		JLabel lblGk = new JLabel("GK\u7B2C\u4E09\u5341\u4E03\u4F4D");
		lblGk.setForeground(Color.MAGENTA);
		lblGk.setFont(new Font("楷体", Font.PLAIN, 20));
		lblGk.setBounds(558, 616, 147, 33);
		contentPane.add(lblGk);
		
		
			
		
	}



	public JButton getCreatebankbutton() {
		return createbankbutton;
	}



	public JTextField getUseridTextField() {
		return useridTextField;
	}

	public JTextField getEnTextField() {
		return enTextField;
	}

	public JTextField getWoTextField() {
		return woTextField;
	}

	public JTextField getCoTextField() {
		return coTextField;
	}

	public JTextField getGenTextField() {
		return genTextField;
	}

	public JTextField getSaveTextField() {
		return saveTextField;
	}

	public JTextField getxTextField() {
		return xTextField;
	}

	public JTextField getdTextField() {
		return dTextField;
	}

	public JTextField getpTextField() {
		return pTextField;
	}

	public JTextField getsTextField() {
		return sTextField;
	}

	public JTextField getkTextField() {
		return kTextField;
	}

	public JTextField getPmcTextField() {
		return pmcTextField;
	}

	public JTextField getfTextField() {
		return fTextField;
	}

	public JTextField geteTextField() {
		return eTextField;
	}

	public JCheckBox getsCheckBox() {
		return sCheckBox;
	}

	public JCheckBox getcCheckBox() {
		return cCheckBox;
	}

	public JCheckBox getmCheckBox() {
		return mCheckBox;
	}

	public JCheckBox getdCheckBox() {
		return dCheckBox;
	}
}
