package Programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AccesoBD {
	Connection conexion;
	String ficheroProperties;
	
	public AccesoBD(String ficheroProperties) {
		super();
		this.ficheroProperties = ficheroProperties;
	}
	public boolean testConexion(){
		boolean retorno =false;
		try {
			retorno=conexion.isValid(3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}
	public void conectar (){
		Properties bdp= new Properties();
		InputStream fichero;
		try {
			fichero=new FileInputStream(ficheroProperties);
			bdp.load(fichero);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.conexion = DriverManager
					.getConnection("jdbc:mariadb://bd.iesguara.cf:3306/DAM1Alu12_Personas?",bdp);
			System.out.println(conexion.getMetaData().getDatabaseProductVersion());
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
	public void desconectar(){
		System.out.println("Intentando la desconexión");
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Desconectado");
	}
	public int insertarPersona(String nombre,String apellido,int edad) throws SQLException {
		int filas=0;
		PreparedStatement ps= conexion.prepareStatement("Insert into Persona values(?,?,?)");
		ps.setString(1, nombre);
		ps.setString(2, apellido);
		ps.setInt(3, filas);
		return ps.executeUpdate();
		
	}
	
}
