import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Calsi extends JFrame implements ActionListener{
	JLabel num1Label,num2Label,resultLabel,operationsLabel;
	JTextField num1TField,num2TField,resultTField;
	JButton addButton;
	public Calsi(){
	setTitle("Calculator");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	num1Label = new JLabel("enter 1st num");
	num2Label = new JLabel("enter 2nd num");
	resultLabel = new JLabel("result");
	num1TField = new JTextField(20);
	num2TField = new JTextField(20);
	resultTField= new JTextField(20);
	addButton = new JButton("+");
	addButton.addActionListener(this);
	setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
	add(num1Label);add(num1TField);
	add(num2Label);add(num2TField);
	add(addButton);
	add(resultLabel);add(resultTField);
	setSize(400,200);
	setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae){
	int num1 = Integer.parseInt(num1TField.getText());
	int num2 = Integer.parseInt(num2TField.getText());
	int result = 0;
	if(ae.getSource() == addButton){
		result = num1+num2;
	}
	resultTField.setText(result+"");
	}
	public static void main(String args[]){
		System.out.println("Hi");
		Calsi myCalsi = new Calsi();
	}
	}
	
	 

	
