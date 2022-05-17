package TA22.TA22Ej2.Models;

public class Model {
	String resultSet;
	String resultSet1;

	final private String NombreBD = "Ejercicio2", Client = "Clients", Video = "Videos";
	{
		new ConexioSQL();
		ConexioSQL.openConnection();
		// if(ConexioSQL.existeixBD(NombreBD)==false) {

		// ConexioSQL.createDB(NombreBD) ;
		// ConexioSQL.createTable(NombreBD, Client, Clients);
		// ConexioSQL.createTable(NombreBD, Video, Videos);
		// }
		this.resultSet = ConexioSQL.getValuesClient(NombreBD, Client);
		this.resultSet1 = ConexioSQL.getValuesVideo(NombreBD, Video);
	}

	public static String Clients = "(" + "id int(11) NOT NULL AUTO_INCREMENT," + "nom varchar(250) DEFAULT NULL,"
			+ "cognom varchar(250) DEFAULT NULL," + "direccio varchar(250) DEFAULT NULL," + "dni int(11) DEFAULT NULL,"
			+ "data varchar(34) DEFAULT NULL," + "PRIMARY KEY (id));";

	public static String Videos = "(" + "id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,"
			+ "titol varchar(250) DEFAULT NULL," + "director varchar(250) DEFAULT NULL,"
			+ "cli_id int(11) DEFAULT NULL," + "KEY (cli_id),"
			+ "FOREIGN KEY (cli_id) REFERENCES Clients (id) ON UPDATE CASCADE ON DELETE CASCADE);";

	public void setResultSet1(String resultSet1) {
		this.resultSet1 = resultSet1;
	}

	public String getResultSet1() {
		return resultSet1;
	}

	public String getResultSet() {

		return resultSet;
	}

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}

	public void ActualizarClient() {
		this.resultSet = ConexioSQL.getValuesClient(NombreBD, Client);
	}

	public void ActualizarVideo() {
		this.resultSet = ConexioSQL.getValuesVideo(NombreBD, Video);
	}

	public void DeleteValorClient(int ID) {
		ConexioSQL.deleteRecord(NombreBD, Client, ID);
	}

	public void DeleteValorVideo(int Id) {
		ConexioSQL.deleteRecord(NombreBD, Video, Id);
	}

	public void Editar(int id, String nom, String cognom, String direccio, int dni, String data) {
		ConexioSQL.insertDataClienteditar(NombreBD, Client, id, nom, cognom, direccio, dni, data);
	}

	public void CrearClient(String nom, String cognom, String direccio, int dni, String data) {
		ConexioSQL.insertDataClient(NombreBD, Client, nom, cognom, direccio, dni, data);
	}

	public void CrearVideo(String titol, String direccio, int cli_id) {
		ConexioSQL.insertDataVideo(NombreBD, Video, titol, direccio, cli_id);
	}

}