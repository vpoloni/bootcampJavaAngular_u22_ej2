package TA22.TA22Ej2.Controllers;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import TA22.TA22Ej2.Models.ConexioSQL;
import TA22.TA22Ej2.Models.Model;
import TA22.TA22Ej2.Vista.Vista;
import TA22.TA22Ej2.Vista.Vista2;

public class Controlador implements ActionListener {

	private Vista vista;
	private Vista2 vista2;
	private Model model;
	private ConexioSQL conexio;
	private java.sql.ResultSet resultSet;

	public Controlador(Model model, Vista vista,Vista2 vista2, ConexioSQL conexio) {

		this.vista = vista;
		this.vista2 = vista2;
		this.model = model;
		this.conexio = conexio;
		this.vista.btnNewButton_update.addActionListener(this);
		this.vista.btnNewButton_clients.addActionListener(this);
		this.vista.btnNewButton_atras.addActionListener(this);
		this.vista.btnNewButton_crear.addActionListener(this);
		this.vista.btnNewButton_eliminar.addActionListener(this);
		this.vista.btnNewButton_editar.addActionListener(this);
		this.vista.btnNewButton_videos.addActionListener(this);
		this.vista2.btnNewButton_aceptar.addActionListener(this);
		this.vista2.btnNewButton_atras1.addActionListener(this);
		this.vista2.btnNewButton_eliminar1.addActionListener(this);
		this.vista2.btnNewButton_crear1.addActionListener(this);
		this.vista2.btnNewButton_llista.addActionListener(this);

		vista.setVisible(true);
		System.out.println(model.getResultSet());
	}

	public void actionPerformed(ActionEvent evento) {

		if (vista.btnNewButton_update == evento.getSource()) {
			
			model.ActualizarClient();
			vista.llistaclients.setText(model.getResultSet());
			vista.llistaclients.setVisible(true);
		}
		if (vista.btnNewButton_clients == evento.getSource()) {
			vista.llistaclients.setText(model.getResultSet());
			vista.llistaclients.setVisible(true);
		}
		if (vista.btnNewButton_atras == evento.getSource()) {
			vista.contentPane.setVisible(true);
			vista.llistaclients.setVisible(false);
		}

		if (vista.btnNewButton_eliminar == evento.getSource()) {
			try {
				String id = JOptionPane.showInputDialog("Que Id quieres eliminar?");
				int ID = Integer.parseInt(id);
				model.DeleteValorClient(ID);
			} catch (NullPointerException | NumberFormatException e) {

				JOptionPane.showMessageDialog(vista, "Introduce los datos bien.", null, 0);
			}
		}

		if (vista.btnNewButton_editar == evento.getSource()) {
			JOptionPane.showMessageDialog(vista,
					"Para editar primero tienes qe rellenar las casillas que quieras cambiar. ", null, 0);
			try {
				String id = JOptionPane.showInputDialog("Que Id vas a modificar?");
				int ID = Integer.parseInt(id);
				model.DeleteValorClient(ID);

				String nom = vista.textField_2.getText();
				String cognom = vista.textField.getText();
				String direccio = vista.textField_1.getText();
				String dni = vista.textField_4.getText();
				String data = vista.textField_3.getText();
				int DNI = Integer.parseInt(dni);
				model.Editar(ID, nom, cognom, direccio, DNI, data);
			} catch (NullPointerException | NumberFormatException ex) {

				JOptionPane.showMessageDialog(vista, "No has introducido bien los datos ", null, 0);
			}
		}
			if (vista.btnNewButton_crear == evento.getSource()) {
				try {
					String nom = vista.textField_2.getText();
					String cognom = vista.textField.getText();
					String direccio = vista.textField_1.getText();
					String dni = vista.textField_4.getText();
					int DNI = Integer.parseInt(dni);
					String data = vista.textField_3.getText();

					model.CrearClient(nom, cognom, direccio, DNI, data);
				} catch (NullPointerException | NumberFormatException e) {

					JOptionPane.showMessageDialog(vista, "Introduce los datos bien.", null, 0);
				}

			}
			
			if (vista.btnNewButton_videos == evento.getSource()) {
					String id = JOptionPane.showInputDialog("Introduce la id para ver los videos de este usuario.");
					try {
					int ID = Integer.parseInt(id);	
							vista2.setVisible(true);
						
					
				} catch (NullPointerException | NumberFormatException e) {

					JOptionPane.showMessageDialog(vista, "Introduce los datos bien.", null, 0);
				}
					
			}
					
			if (vista2.btnNewButton_llista == evento.getSource()) {
						vista2.llistavideos.setText(model.getResultSet1());
						vista2.llistavideos.setVisible(true);
			}
			if (vista2.btnNewButton_atras1 == evento.getSource()) {
						vista2.contentPane.setVisible(true);
						vista2.llistavideos.setVisible(false);
			}
			if (vista2.btnNewButton_crear1 == evento.getSource()) {
						try {
							String titol = vista2.textField_2.getText();
							String director = vista2.textField.getText();
							String cli_id = vista2.textField_1.getText();
							int cli_id1 = Integer.parseInt(cli_id);

							model.CrearVideo(titol, director, cli_id1);
						} catch (NullPointerException | NumberFormatException e) {

							JOptionPane.showMessageDialog(vista2, "Introduce los datos bien.", null, 0);
						}

				}

			if (vista2.btnNewButton_eliminar1 == evento.getSource()) {
						try {
							String id1 = JOptionPane.showInputDialog("Que Id quieres eliminar?");
							int ID = Integer.parseInt(id1);
							model.DeleteValorVideo(ID);
						} catch (NullPointerException | NumberFormatException e) {

							JOptionPane.showMessageDialog(vista2, "Introduce los datos bien.", null, 0);
						}
			}
			if (vista2.btnNewButton_aceptar == evento.getSource()) {
				vista.setVisible(true);
				vista2.setVisible(false);
			}
	}
			

		
	}

