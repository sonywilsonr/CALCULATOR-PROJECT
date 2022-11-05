package calculatorjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Frame implements ActionListener {
	
	boolean isoperatorclicked=false;
	
	 Double num1,num2,result;
	 char operators;
	
	 JFrame jf;
	 JLabel displaylabel;
	 JButton Sevenbutton,Eightbutton,Ninebutton,Fourbutton,Fivebutton,Sixbutton,Onebutton,
	 Twobutton,Threebutton,Zerobutton,Dotbutton,Equalbutton,
	 Addbutton,minusbutton,mulbutton,dividebutton,clearbutton ;
	 
	public Frame() {
		
	    jf=new JFrame("Calculator");
		
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setLocation(300,150);
		
		displaylabel =new JLabel("");
		displaylabel.setFont(new Font("Serif", Font. BOLD, 20));
		displaylabel.setBounds(30,40,540,40 );
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setForeground(Color.WHITE);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jf.add(displaylabel);
		
	    Sevenbutton =new JButton("7");
	    Sevenbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
		Sevenbutton.setBounds(50,150,80,80);
		Sevenbutton.setBackground(Color.black);
		Sevenbutton.setOpaque(true);
		Sevenbutton.setForeground(Color.WHITE);
		Sevenbutton.addActionListener(this);
		 jf.add(Sevenbutton);
		 
		    Eightbutton =new JButton("8");
		    Eightbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
			Eightbutton.setBounds(150,150,80,80);
			Eightbutton.setBackground(Color.black);
			Eightbutton.setOpaque(true);
			Eightbutton.setForeground(Color.WHITE);
			Eightbutton.addActionListener(this);
			 jf.add(Eightbutton);
		
			    Ninebutton =new JButton("9");
			    Ninebutton.setFont(new Font("DIALOG", Font. BOLD, 20));
				Ninebutton.setBounds(250,150,80,80);
				Ninebutton.setBackground(Color.black);
				Ninebutton.setOpaque(true);
				Ninebutton.setForeground(Color.WHITE);
				Ninebutton.addActionListener(this);
				 jf.add(Ninebutton);
			

					 Fourbutton =new JButton("4");
					 Fourbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
					 Fourbutton.setBounds(50,250,80,80);
					 Fourbutton.setBackground(Color.black);
					 Fourbutton.setOpaque(true);
					 Fourbutton.setForeground(Color.WHITE);
					 Fourbutton.addActionListener(this);
					 jf.add(Fourbutton);
					 
					    Fivebutton =new JButton("5");
					    Fivebutton.setFont(new Font("DIALOG", Font. BOLD, 20));
						Fivebutton.setBounds(150,250,80,80);
						Fivebutton.setBackground(Color.black);
						Fivebutton.setOpaque(true);
						Fivebutton.setForeground(Color.WHITE);
						Fivebutton.addActionListener(this);
						 jf.add(Fivebutton);
					
						     Sixbutton =new JButton("6");
						     Sixbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
							 Sixbutton.setBounds(250,250,80,80);
							 Sixbutton.setBackground(Color.black);
							 Sixbutton.setOpaque(true);
							 Sixbutton.setForeground(Color.WHITE);
							 Sixbutton.addActionListener(this);
							 jf.add(Sixbutton);
						
							    Onebutton =new JButton("1");
							    Onebutton.setFont(new Font("DIALOG", Font. BOLD, 20));
								Onebutton.setBounds(50,350,80,80);
								Onebutton.setBackground(Color.black);
								Onebutton.setOpaque(true);
								Onebutton.setForeground(Color.WHITE);
								Onebutton.addActionListener(this);
								 jf.add(Onebutton);
								 
								    Twobutton =new JButton("2");
								    Twobutton.setFont(new Font("DIALOG", Font. BOLD, 20));
									Twobutton.setBounds(150,350,80,80);
									Twobutton.setBackground(Color.black);
									Twobutton.setOpaque(true);
									Twobutton.setForeground(Color.WHITE);
									Twobutton.addActionListener(this);
									 jf.add(Twobutton);
								
							            Threebutton =new JButton("3");
							            Threebutton.setFont(new Font("DIALOG", Font. BOLD, 20));
										Threebutton.setBounds(250,350,80,80);
										Threebutton.setBackground(Color.black);
										Threebutton.setOpaque(true);
										Threebutton.setForeground(Color.WHITE);
										Threebutton.addActionListener(this);
										 jf.add(Threebutton);
									
		
					
                                            Zerobutton =new JButton("0");
                                            Zerobutton.setFont(new Font("DIALOG", Font. BOLD, 20));
											Zerobutton.setBounds(150,450,80,80);
											Zerobutton.setBackground(Color.black);
											Zerobutton.setOpaque(true);
											Zerobutton.setForeground(Color.WHITE);
											Zerobutton.addActionListener(this);
											 jf.add(Zerobutton);
										
											    Equalbutton =new JButton("=");
											    Equalbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
												Equalbutton.setBounds(250,450,80,80);
												Equalbutton.setBackground(Color.DARK_GRAY);
												Equalbutton.setOpaque(true);
												Equalbutton.setForeground(Color.WHITE);
												Equalbutton.addActionListener(this);
												 jf.add(Equalbutton);
												 
												    Dotbutton =new JButton(".");
												    Dotbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
													Dotbutton.setBounds(50,450,80,80);
													Dotbutton.setBackground(Color.DARK_GRAY);
													Dotbutton.setOpaque(true);
													Dotbutton.setForeground(Color.WHITE);
													Dotbutton.addActionListener(this);
													 jf.add(Dotbutton);
													 
													 
													 
													 
													
									                            Addbutton =new JButton("+");
									                            Addbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
																Addbutton.setBounds(400,150,80,80);
																Addbutton.setBackground(Color.LIGHT_GRAY);
																Addbutton.setOpaque(true);
																Addbutton.setForeground(Color.BLACK);
																Addbutton.addActionListener(this);
																 jf.add(Addbutton);	
																 
																    minusbutton =new JButton("-");
																    minusbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
																	minusbutton.setBounds(400,250,80,80);
																	minusbutton.setBackground(Color.LIGHT_GRAY);
																	minusbutton.setOpaque(true);
																	minusbutton.setForeground(Color.BLACK);
																	minusbutton.addActionListener(this);
																	 jf.add(minusbutton);
													 
																	    mulbutton =new JButton("*");
																	    mulbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
																		mulbutton.setBounds(400,350,80,80);
																		mulbutton.setBackground(Color.LIGHT_GRAY);
																		mulbutton.setOpaque(true);
																		mulbutton.setForeground(Color.BLACK );
																		mulbutton.addActionListener(this);
																		 jf.add(mulbutton);
													 
													    dividebutton =new JButton("÷");
													    dividebutton.setFont(new Font("DIALOG", Font. BOLD, 20));
														dividebutton.setBounds(400,450,80,80);
														dividebutton.setBackground(Color.LIGHT_GRAY);
														dividebutton.setOpaque(true);
														dividebutton.setForeground(Color.BLACK);
														dividebutton.addActionListener(this);
														 jf.add(dividebutton);
														 
														    clearbutton =new JButton("C");
														    clearbutton.setFont(new Font("DIALOG", Font. BOLD, 20));
															clearbutton.setBounds(490,150,80,80);
															clearbutton.setBackground(Color.LIGHT_GRAY);
															clearbutton.setOpaque(true);
															clearbutton.setForeground(Color.BLACK);
															clearbutton.addActionListener(this);
															 jf.add(clearbutton);	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	

	public static void main(String[] args) {
		new Frame();
		
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==Sevenbutton){
			if(isoperatorclicked) 
			{displaylabel.setText("7");
				isoperatorclicked=false;}
			else{
				displaylabel.setText(displaylabel.getText()+"7");}
			
			
			}else if(e.getSource()==Eightbutton)
			{
		
		if(isoperatorclicked) 
		{
			
			displaylabel.setText("8");
			isoperatorclicked=false;
	    }else 
			{
			displaylabel.setText(displaylabel.getText()+"8");
		}
		
	
		
	}else if(e.getSource()==Ninebutton) {
		
		if(isoperatorclicked) {
			
			displaylabel.setText("9");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"9");
		}
		
		
		
	}else if(e.getSource()==Fourbutton) {
		
		if(isoperatorclicked) {
			
			displaylabel.setText("4");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"4");
		}
		
		
	}else if(e.getSource()==Fivebutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("5");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"5");
		}
		
		
		
	}else if(e.getSource()==Sixbutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("6");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"6");
		}
		
		
	}else if(e.getSource()==Onebutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("1");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"1");
		}
		
		
	}else if(e.getSource()==Twobutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("2");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"2");
		}
		
		
	}else if(e.getSource()==Threebutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("3");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"3");
		}
		
		
	}else if(e.getSource()==Zerobutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText("0");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+"0");
		}
		
		
	}else if(e.getSource()==Dotbutton) {
		if(isoperatorclicked) {
			
			displaylabel.setText(".");
			isoperatorclicked=false;
			
			
		}else {
			displaylabel.setText(displaylabel.getText()+".");
		}
		
		
	}else if(e.getSource()==Addbutton) {
	
         isoperatorclicked=true;
         num1= Double.parseDouble(displaylabel.getText());
         operators= '+';
         displaylabel.setText("");
		
	}else if(e.getSource()==minusbutton) {
		isoperatorclicked=true;
        num1=Double.parseDouble(displaylabel.getText());
        operators= '-';
        displaylabel.setText("");
		
		
	}else if(e.getSource()==mulbutton) {
		isoperatorclicked=true;
        num1=Double.parseDouble(displaylabel.getText());
        operators= '*';
        displaylabel.setText("");
		
		
		
	}else if(e.getSource()==dividebutton) {
		isoperatorclicked=true;
        num1=Double.parseDouble(displaylabel.getText());
        operators= '/';
        displaylabel.setText("");
		
		
	}else if(e.getSource()==Equalbutton) {
		 num2=Double.parseDouble(displaylabel.getText());
		 
		 switch(operators) {
		 case '+':
			 result=num1+num2;
			 break;
			 
		 case '-':
			 result=num1-num2;
			 break;
			 
		 case '*':
			 result=num1*num2;
			 break;
			 
		 case '/':
			 result=num1/num2;
			 break;
		 }
		 
	displaylabel.setText(String.valueOf(result));
	
		
	}else if(e.getSource()==clearbutton) {
		displaylabel.setText("");
		
	}
		
	}
	}
