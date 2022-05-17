package TA22.TA22Ej2.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

public class ConexioSQL {
	
	// Declaramos la variable de tipo conexion
	public static Connection conexion;

	// METODO QUE ABRE LA CONEXION CON SERVER MYSQL
	public static void openConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.113:3306?useTimezone=true&serverTimezone=UTC",
					"remote", "Salou321."); // credenciales temporales
			System.out.print("Server Connected");

		} catch (SQLException | ClassNotFoundException ex) {
			System.out.print("No se ha podido conectar con mi base de datos");
			System.out.println(ex.getMessage());

		}

	}
	

	// METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
	public static void closeConnection() {
		try {
			conexion.close();
			System.out.print("Server Disconnected");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.print("Error cerrando conexion");

		}
	}

	// METODO QUE CREA LA BASE DE DATOS
	public static void createDB(String name) {
		try {
			String Query = "CREATE DATABASE " + name;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("");
			System.out.println("DB creada con exito!");

			JOptionPane.showMessageDialog(null, "Se ha creado la DB " + name + " de forma exitosa.");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando la DB.");
		}
	}

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name, String query) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + " " + query;

			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertDataClient(String db, String table_name, String name, String lastname, String direction, int dni, String date) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (nom, cognom, direccio, dni, data) VALUE("
					+ "\"" + name + "\", "
					+ "\"" + lastname + "\", "
					+ "\"" + direction + "\", "
					+ "\"" + dni + "\", "
					+ "\"" + date + "\"); ";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}
	public static void insertDataClienteditar(String db, String table_name, int id, String name, String lastname, String direction, int dni, String date) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (id, nom, cognom, direccio, dni, data) VALUE("
					+ "\"" + id + "\", "
					+ "\"" + name + "\", "
					+ "\"" + lastname + "\", "
					+ "\"" + direction + "\", "
					+ "\"" + dni + "\", "
					+ "\"" + date + "\"); ";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	public static void insertDataVideo(String db, String table_name, String titol, String director, int cli_id) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (titol, director, cli_id) VALUE("
					+ "\"" + titol + "\", "
					+ "\"" + director + "\", "
				    + "\"" + cli_id + "\"); ";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}
	
	// METODO QUE OBTIENE VALORES MYSQL
	
	
	public static String getValuesClient(String db, String table_name) {
		String resultado="";
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + table_name;
			Statement st = conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				
				resultado=resultado+"ID: " + resultSet.getString("Id")+" "
				+ "Nom: " + resultSet.getString("nom")+ " "
				+ "cognom: " + resultSet.getString("cognom")+ " "
				+ "Direccio: " + resultSet.getString("direccio")+ " "
				+ "Dni: " + resultSet.getString("dni")+ " "
				+ "data: " + resultSet.getString("data")+ "\n";		
	}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
		return resultado;

	}

	public static String getValuesVideo(String db, String table_name) {
		String resultado="";
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + table_name;
			Statement st = conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				
				resultado=resultado+"ID: " + resultSet.getString("Id")+" "
				+ "titol: " + resultSet.getString("titol")+ " "
				+ "director: " + resultSet.getString("director")+ " "
				+ "data: " + resultSet.getString("cli_id")+ "\n";		
	}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
		return resultado;

	}
	// METODO QUE LIMPIA TABLAS MYSQL
	public static void deleteRecord(String db, String table_name, int ID) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\"";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Registros de tabla ELIMINADOS con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
	}

	// METODO QUE ELIMINA TABLAS MYSQL
	public static void deleteTabla(String db, String table_name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "DROP TABLE " + table_name + ";";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("TABLA ELIMINADA con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando la tabla");
		}
	}}
