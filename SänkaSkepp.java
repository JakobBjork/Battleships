package Jakob;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SänkaSkepp implements ActionListener {
	
	int rows = 6;
	int columns = 6;
	int[][] spelplan = new int[rows][columns];
	int lEtt1 = 1;int lEtt2 = 1;int lTvå1 = 2;int lTvå2 = 2;int mEtt1 = 3;int mEtt2 = 3;int mEtt3 = 3;int mTvå1 = 4;int mTvå2 = 4;int mTvå3 = 4;int sEtt1 = 5;int sEtt2 = 5;int sEtt3 = 5;int sEtt4 = 5;
	int stortSkepp = 0;
	int mellanSkepp1 = 0;
	int mellanSkepp2 = 0;
	int litetSkepp1 = 0;
	int litetSkepp2 = 0;
	
	public SänkaSkepp(){
	JFrame ram = new JFrame();
	JButton a1, a2, a3, a4, a5, a6, b1, b2, b3, b4, b5, b6, c1, c2, c3, c4, c5, c6, d1, d2, d3, d4, d5, d6, e1, e2, e3, e4, e5, e6, f1, f2, f3, f4, f5, f6;
	
	
	
	int lEttRiktning = (int) (Math.random() * 2);
	int lTvåRiktning = (int) (Math.random() * 2);
	int mEttRiktning = (int) (Math.random() * 2);
	int mTvåRiktning = (int) (Math.random() * 2);
	int sEttRiktning = (int) (Math.random() * 2);
	while(true){
	if (lEttRiktning == 0 ){
		int lEttFram = (int) (Math.random() * 5);
		int lEttSida = (int) (Math.random() * 6);
		if (spelplan[lEttFram][lEttSida] == 0 && spelplan[lEttFram + 1][lEttSida] == 0){
		spelplan[lEttFram][lEttSida] = lEtt1;
		spelplan[lEttFram + 1][lEttSida] = lEtt2;
		break;
		}
	}
	else {
		int lEttFram = (int) (Math.random() * 5);
		int lEttSida = (int) (Math.random() * 6);
		if (spelplan[lEttSida][lEttFram] == 0 && spelplan[lEttSida][lEttFram + 1] == 0){
		spelplan[lEttSida][lEttFram] = lEtt1;
		spelplan[lEttSida][lEttFram + 1] = lEtt2;
		break;
		}
	}
	}
	
	
	while(true){
	if (lTvåRiktning == 0 ){
		int lTvåFram = (int) (Math.random() * 5);
		int lTvåSida = (int) (Math.random() * 6);
		if (spelplan[lTvåFram][lTvåSida] == 0 && spelplan[lTvåFram + 1][lTvåSida] == 0){
		spelplan[lTvåFram][lTvåSida] = lTvå1;
		spelplan[lTvåFram + 1][lTvåSida] = lTvå2;
		break;
		}
	}
	else {
		int lTvåFram = (int) (Math.random() * 5);
		int lTvåSida = (int) (Math.random() * 6);
		if (spelplan[lTvåSida][lTvåFram] == 0 && spelplan[lTvåSida][lTvåFram + 1] == 0){
		spelplan[lTvåSida][lTvåFram] = lTvå1;
		spelplan[lTvåSida][lTvåFram + 1] = lTvå2;
		break;
		}
	}
	}
	
	while(true){
	if (mEttRiktning == 0 ){
		int mEttFram = (int) (Math.random() * 4);
		int mEttSida = (int) (Math.random() * 6);
		if (spelplan[mEttFram][mEttSida] == 0 && spelplan[mEttFram + 1][mEttSida] == 0){
		spelplan[mEttFram][mEttSida] = mEtt1;
		spelplan[mEttFram + 1][mEttSida] = mEtt2;
		spelplan[mEttFram + 2][mEttSida] = mEtt3;
		break;
		}
	}
	else {
		int mEttFram = (int) (Math.random() * 4);
		int mEttSida = (int) (Math.random() * 6);
		if (spelplan[mEttSida][mEttFram] == 0 && spelplan[mEttSida][mEttFram + 1] == 0){
		spelplan[mEttSida][mEttFram] = mEtt1;
		spelplan[mEttSida][mEttFram + 1] = mEtt2;
		spelplan[mEttSida][mEttFram + 2] = mEtt3;
		break;
		}
	}
	}
	
	while(true){
	if (mTvåRiktning == 0 ){
		int mTvåFram = (int) (Math.random() * 4);
		int mTvåSida = (int) (Math.random() * 6);
		if (spelplan[mTvåFram][mTvåSida] == 0 && spelplan[mTvåFram + 1][mTvåSida] == 0 && spelplan[mTvåFram + 2][mTvåSida] == 0){
		spelplan[mTvåFram][mTvåSida] = mTvå1;
		spelplan[mTvåFram + 1][mTvåSida] = mTvå2;
		spelplan[mTvåFram + 2][mTvåSida] = mTvå3;
		break;
		}
	}
	else {
		int mTvåFram = (int) (Math.random() * 4);
		int mTvåSida = (int) (Math.random() * 6);
		if (spelplan[mTvåSida][mTvåFram] == 0 && spelplan[mTvåSida][mTvåFram + 1] == 0 && spelplan[mTvåSida][mTvåFram + 2] == 0){
		spelplan[mTvåSida][mTvåFram] = mTvå1;
		spelplan[mTvåSida][mTvåFram + 1] = mTvå2;
		spelplan[mTvåSida][mTvåFram + 2] = mTvå3;
		break;
		}
	}
	}
	
	while(true){
	if (sEttRiktning == 0 ){
		int sEttFram = (int) (Math.random() * 3);
		int sEttSida = (int) (Math.random() * 6);
		if (spelplan[sEttFram][sEttSida] == 0 && spelplan[sEttFram + 1][sEttSida] == 0 && spelplan[sEttFram + 2][sEttSida] == 0 && spelplan[sEttFram + 3][sEttSida] == 0){
		spelplan[sEttFram][sEttSida] = sEtt1;
		spelplan[sEttFram + 1][sEttSida] = sEtt2;
		spelplan[sEttFram + 2][sEttSida] = sEtt3;
		spelplan[sEttFram + 3][sEttSida] = sEtt4;
		break;
		}
	}
	else {
		int sEttFram = (int) (Math.random() * 3);
		int sEttSida = (int) (Math.random() * 6);
		if (spelplan[sEttSida][sEttFram] == 0 && spelplan[sEttSida][sEttFram + 1] == 0 && spelplan[sEttSida][sEttFram + 2] == 0 && spelplan[sEttSida][sEttFram + 3] == 0){
		spelplan[sEttSida][sEttFram] = sEtt1;
		spelplan[sEttSida][sEttFram + 1] = sEtt2;
		spelplan[sEttSida][sEttFram + 2] = sEtt3;
		spelplan[sEttSida][sEttFram + 3] = sEtt4;
		break;
		}
	}
	}
	// "Facit" nedan
	/*for(int i = 0; i<rows; i++)
	{
	    for(int j = 0; j<columns; j++)
	    {
	        System.out.print(spelplan[i][j]);
	    }
	    System.out.println();
	} */

	a1 = new JButton("A1");//spelplan[0][0]
	a2 = new JButton("A2");//spelplan[0][1]
	a3 = new JButton("A3");//spelplan[0][2]
	a4 = new JButton("A4");//spelplan[0][3]
	a5 = new JButton("A5");//spelplan[0][4]
	a6 = new JButton("A6");//spelplan[0][5]
	b1 = new JButton("B1");//spelplan[1][0]
	b2 = new JButton("B2");//spelplan[1][1]
	b3 = new JButton("B3");//spelplan[1][2]
	b4 = new JButton("B4");//spelplan[1][3]
	b5 = new JButton("B5");//spelplan[1][4]
	b6 = new JButton("B6");//spelplan[1][5]
	c1 = new JButton("C1");//spelplan[2][0]
	c2 = new JButton("C2");//spelplan[2][1]
	c3 = new JButton("C3");//spelplan[2][2]
	c4 = new JButton("C4");//spelplan[2][3]
	c5 = new JButton("C5");//spelplan[2][4]
	c6 = new JButton("C6");//spelplan[2][5]
	d1 = new JButton("D1");//spelplan[3][0]
	d2 = new JButton("D2");//spelplan[3][1]
	d3 = new JButton("D3");//spelplan[3][2]
	d4 = new JButton("D4");//spelplan[3][3]
	d5 = new JButton("D5");//spelplan[3][4]
	d6 = new JButton("D6");//spelplan[3][5]
	e1 = new JButton("E1");//spelplan[4][0]
	e2 = new JButton("E2");//spelplan[4][1]
	e3 = new JButton("E3");//spelplan[4][2]
	e4 = new JButton("E4");//spelplan[4][3]
	e5 = new JButton("E5");//spelplan[4][4]
	e6 = new JButton("E6");//spelplan[4][5]
	f1 = new JButton("F1");//spelplan[5][0]
	f2 = new JButton("F2");//spelplan[5][1]
	f3 = new JButton("F3");//spelplan[5][2]
	f4 = new JButton("F4");//spelplan[5][3]
	f5 = new JButton("F5");//spelplan[5][4]
	f6 = new JButton("F6");//spelplan[5][5]
    a1.addActionListener(this);a2.addActionListener(this);a3.addActionListener(this);a4.addActionListener(this);a5.addActionListener(this);a6.addActionListener(this);
    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
    c1.addActionListener(this);c2.addActionListener(this);c3.addActionListener(this);c4.addActionListener(this);c5.addActionListener(this);c6.addActionListener(this);
    d1.addActionListener(this);d2.addActionListener(this);d3.addActionListener(this);d4.addActionListener(this);d5.addActionListener(this);d6.addActionListener(this);
    e1.addActionListener(this);e2.addActionListener(this);e3.addActionListener(this);e4.addActionListener(this);e5.addActionListener(this);e6.addActionListener(this);
    f1.addActionListener(this);f2.addActionListener(this);f3.addActionListener(this);f4.addActionListener(this);f5.addActionListener(this);f6.addActionListener(this);
	ram.add(a1);ram.add(a2);ram.add(a3);ram.add(a4);ram.add(a5);ram.add(a6);
	ram.add(b1);ram.add(b2);ram.add(b3);ram.add(b4);ram.add(b5);ram.add(b6);
	ram.add(c1);ram.add(c2);ram.add(c3);ram.add(c4);ram.add(c5);ram.add(c6);
	ram.add(d1);ram.add(d2);ram.add(d3);ram.add(d4);ram.add(d5);ram.add(d6);
	ram.add(e1);ram.add(e2);ram.add(e3);ram.add(e4);ram.add(e5);ram.add(e6);
	ram.add(f1);ram.add(f2);ram.add(f3);ram.add(f4);ram.add(f5);ram.add(f6);
	

    
	ram.setLayout(new GridLayout(6,6)); 
	ram.setSize(500,500); 
    ram.setVisible(true);
    ram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){  
       JButton pressed = (JButton) e.getSource();
       String knappText = pressed.getText();
       String kolumnText = knappText.substring(1);
       int knappKolumnNummer = Integer.parseInt(kolumnText);
       String radText = knappText.substring(0, 1);
       
       radText = radText.replace("A", "0");
       radText = radText.replace("B", "1");
       radText = radText.replace("C", "2");
       radText = radText.replace("D", "3");
       radText = radText.replace("E", "4");
       radText = radText.replace("F", "5");
       int knappRadNummer = Integer.parseInt(radText); //Varför funkar inte den här skiten?
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 5){
    	   JOptionPane.showMessageDialog(null, "Träff på stort skepp!");
    	   pressed.setText("Stor!");
    	   stortSkepp = stortSkepp + 1;
       }
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 4){
    	   JOptionPane.showMessageDialog(null, "Träff på mellanstort skepp!");
    	   pressed.setText("Mellan!");
    	   mellanSkepp2 = mellanSkepp2 + 1;
       }
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 3){
    	   JOptionPane.showMessageDialog(null, "Träff på mellanstort skepp!");
    	   pressed.setText("Mellan!");
    	   mellanSkepp1 = mellanSkepp1 + 1;
       }
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 2){
    	   JOptionPane.showMessageDialog(null, "Träff på litet skepp!");
    	   pressed.setText("Liten!");
    	   litetSkepp2 = litetSkepp2 + 1;
       }
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 1){
    	   JOptionPane.showMessageDialog(null, "Träff på litet skepp!");
    	   pressed.setText("Liten!");
    	   litetSkepp1 = litetSkepp1 + 1;
       }
       if ((spelplan[knappRadNummer][knappKolumnNummer - 1]) == 0){
    	   JOptionPane.showMessageDialog(null, "Miss!");
    	   pressed.setText("Miss!");
       }
       if (stortSkepp == 4){
   		JOptionPane.showMessageDialog(null, "Du har sänkt det stora skeppet!");
   		stortSkepp = stortSkepp + 1;
   		}
   		if (mellanSkepp2 == 3){
   		JOptionPane.showMessageDialog(null, "Du har sänkt ett mellanskepp!");
   		mellanSkepp2 = mellanSkepp2 + 1;
   		}
   		if (mellanSkepp1 == 3){
   		JOptionPane.showMessageDialog(null, "Du har sänkt ett mellanskepp!");
   		mellanSkepp1 = mellanSkepp1 + 1;
   		}
   		if (litetSkepp2 == 2){
   		JOptionPane.showMessageDialog(null, "Du har sänkt ett litet skepp!");
   		litetSkepp2 = litetSkepp2 + 1;
   		}
   		if (litetSkepp1 == 2){
   		JOptionPane.showMessageDialog(null, "Du har sänkt ett litet skepp!");
   		litetSkepp1 = litetSkepp1 + 1;
   		}
   		if ((stortSkepp + mellanSkepp2 + mellanSkepp1 + litetSkepp2 + litetSkepp1) == 19){
   		JOptionPane.showMessageDialog(null, "Grattis! Du har sänkt alla skepp!");
   		System.exit(0);
   	}
    }
	
	public static void main(String[] args) {
		new SänkaSkepp();

	}

}
