package zadaca17;

/**
 * Naziv klase Kalkulator
 * 
 * @author Dejan Mladjenovic
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Kalkulator extends JFrame implements ActionListener {
	
	JLabel labela;
	JPanel panel;
	JTextField polje;
	String oznake[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "C", "+", "-", "*", "/", "sqrt", "="};
	JButton[] dugmad;
	char op = '+';
	double rez = 0;
	
	public Kalkulator(){
		super("Kalkulator");
		setVisible(true);
		dodajKomponente();
		pack();
		setResizable(false);
	}
	
	void dodajKomponente(){
		polje = new JTextField();
		add(polje, "North");
		
		labela = new JLabel("0.0");
		add(labela, "Center");
		labela.setSize(20, 20);
		JPanel panel = new JPanel();
		dugmad = new JButton[oznake.length];
		panel.setLayout(new GridLayout(6, 3));
		for(int i = 0; i < oznake.length; i++){
			dugmad[i] = new JButton(oznake[i]);
			dugmad[i].addActionListener(this);
			panel.add(dugmad[i]);
		}
		add(panel, "South");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int k;
		for (k = 0; k < dugmad.length; k++)
			if (e.getSource() == dugmad[k])
				break;
		if (k < 10) {
			String text;
			text = polje.getText();
			text = text + dugmad[k].getText();
			polje.setText(text);
			return;
		}
		if (dugmad[k].getText().equals(".")) {
			String text;
			text = polje.getText();
			text = text + ".";
			polje.setText(text);
			dugmad[k].setEnabled(false);
		}
		if (dugmad[k].getText().equals("+") || dugmad[k].getText().equals("-") || dugmad[k].getText().equals("*")
				|| dugmad[k].getText().equals("/") || dugmad[k].getText().equals("=")) {
			double pod = Double.parseDouble(polje.getText());
			switch (op) {
			case '+':
				rez += pod;
				break;
			case '-':
				rez -= pod;
				break;
			case '*':
				rez *= pod;
				break;
			case '/':
				rez /= pod;
				break;
			}
			op = dugmad[k].getText().charAt(0);
			polje.setText("");
			dugmad[10].setEnabled(true);
			labela.setText(Double.toString(rez));
			return;
		}
		if (dugmad[k].getText().equals("C")) {
			rez = 0.0;
			op = '+';
			polje.setText("");
			labela.setText("0.0");
			return;
		}
		if (dugmad[k].getText().equals("sqrt")) {
			String text;
			text = polje.getText();
			rez = Double.parseDouble(text);
			rez = Math.sqrt(rez);
			polje.setText("");
			labela.setText(Double.toString(rez));
			return;
		}
	}
	
	public static void main(String args[]){
		Kalkulator a = new Kalkulator();
	}
}
