package Programa;

import java.sql.SQLException;

public class ProgramaPrincipal{
	public static void main(String[] args) throws SQLException{
		AccesoBD abd= new AccesoBD("src/main/resources/bdproperties.properties");
		
		abd.conectar();
		abd.desconectar();
	}
		
		
}
