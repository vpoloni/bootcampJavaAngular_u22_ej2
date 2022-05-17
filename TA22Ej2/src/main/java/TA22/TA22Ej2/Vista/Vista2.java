package TA22.TA22Ej2.Vista;

import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vista2 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private JLabel lblNewLabel;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	private JLabel lblNewLabel_3;
	public JTextPane llistavideos;
	public JButton btnNewButton_aceptar;
	public JButton btnNewButton_eliminar1;
	public JButton btnNewButton_crear1;
	public JButton btnNewButton_llista;
	public JButton btnNewButton_atras1;
	

	
	public Vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel = new JLabel("Video");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(179, 11, 65, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(84, 96, 101, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(280, 50, 111, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(84, 50, 101, 28);
		contentPane.add(textField_2);
		
		
		JLabel lblNewLabel_1 = new JLabel("titol:");
		lblNewLabel_1.setBounds(28, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("direccio:");
		lblNewLabel_2.setBounds(28, 103, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("cli_id:");
		lblNewLabel_3.setBounds(224, 57, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		
		btnNewButton_aceptar = new JButton("Aceptar");
		btnNewButton_aceptar.setBounds(151, 198, 101, 23);
		contentPane.add(btnNewButton_aceptar);
		
		btnNewButton_eliminar1 = new JButton("ELIMINAR");
		btnNewButton_eliminar1.setBounds(10, 198, 89, 23);
		contentPane.add(btnNewButton_eliminar1);

		btnNewButton_crear1 = new JButton("CREAR");
		btnNewButton_crear1.setBounds(318, 198, 89, 23);
		contentPane.add(btnNewButton_crear1);
		
		btnNewButton_llista = new JButton("LLISTA DE VIDEOS");
		btnNewButton_llista.setBounds(40, 148, 145, 23);
		contentPane.add(btnNewButton_llista);
		
		
		
		llistavideos = new JTextPane();
		llistavideos.setBounds(0, 0, 434, 250);
		contentPane.add(llistavideos,2,0);
		llistavideos.setVisible(false);
		
		btnNewButton_atras1 = new JButton("Atras");
	    btnNewButton_atras1.setBounds(10, 198, 89, 23);
		llistavideos.add(btnNewButton_atras1);
	
	}
}
