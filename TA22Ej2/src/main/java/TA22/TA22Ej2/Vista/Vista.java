package TA22.TA22Ej2.Vista;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Vista extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	private JLabel lblNewLabel;
	public JTextPane llistaclients;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	public JButton btnNewButton_update;
	public JButton btnNewButton_clients;
	public JButton btnNewButton_crear;
	public JButton btnNewButton_eliminar;
	public JButton btnNewButton_editar;
	public JButton btnNewButton_atras;
	public JButton btnNewButton_videos;
	
	

	
	public Vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel = new JLabel("Client");
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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 144, 111, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(280, 96, 111, 28);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Nom:");
		lblNewLabel_1.setBounds(28, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cognom:");
		lblNewLabel_2.setBounds(28, 103, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Direccio:");
		lblNewLabel_3.setBounds(224, 57, 58, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("data:");
		lblNewLabel_4.setBounds(236, 151, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Dni:");
		lblNewLabel_5.setBounds(248, 103, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		btnNewButton_update = new JButton("UPDATE");
		btnNewButton_update.setBounds(218, 216, 95, 23);
		contentPane.add(btnNewButton_update);
		
		 btnNewButton_clients = new JButton("LISTA CLIENTES");
		btnNewButton_clients.setBounds(72, 135, 122, 28);
		contentPane.add(btnNewButton_clients);
		
		 btnNewButton_crear = new JButton("CREAR");
		btnNewButton_crear.setBounds(115, 216, 95, 23);
		contentPane.add(btnNewButton_crear);
		
		 btnNewButton_eliminar = new JButton("ELIMINAR");
		btnNewButton_eliminar.setBounds(10, 216, 95, 23);
		contentPane.add(btnNewButton_eliminar);
	
		llistaclients = new JTextPane();
		llistaclients.setBounds(0, 0, 434, 250);
		contentPane.add(llistaclients,2,0);
		llistaclients.setVisible(false);
		
		btnNewButton_atras = new JButton("ATRAS");
		btnNewButton_atras.setBounds(323, 216, 95, 23);
		llistaclients.add(btnNewButton_atras);
		
		btnNewButton_editar = new JButton("EDITAR");
		btnNewButton_editar.setBounds(323, 216, 95, 23);
		contentPane.add(btnNewButton_editar);
		
		btnNewButton_videos = new JButton("BUSCAR VIDEOS");
		btnNewButton_videos.setBounds(72, 174, 122, 28);
		contentPane.add(btnNewButton_videos);
		
		
	}
}
