package informaticAlmi;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.Properties;
import java.util.function.Supplier;
import java.util.logging.Logger;

import javax.net.ssl.SSLContext;

import oracle.jdbc.AccessToken;
import oracle.jdbc.OracleConnectionBuilder;
import oracle.jdbc.datasource.OracleDataSource;

public class Basedatos {
	
	private OracleDataSource ods;
	private String url;
	private Connection conn;
	private Statement stmt;
	private PreparedStatement sent;
	private ResultSet rset;
	
	public Basedatos() {
		//STRING DE CONEXION
		url = "jdbc:oracle:thin:@//192.168.0.104/orclcdb";
		try {
			//CONEXION A LA BASE DE DATOS
			ods = new oracle.jdbc.pool.OracleDataSource();
			ods.setURL(url);
			ods.setUser("potitos");
			ods.setPassword("Almi12345");
			conn = ods.getConnection();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//selectTipo();
	}
	/*public String selectTipo(int id) {
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery ("SELECT tipo_componente.nombre FROM tipo_componente, componente where tipo_componente.id_tipo_componente=?");
			return rset.getString (1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
	
	public void comprar(int id_comp, int cantidad, int cliente) {
		String sql="BEGIN venta(?,?,?); END;";
		try {
			sent= conn.prepareStatement(sql);
			sent.setInt(1, cliente);
			sent.setInt(2, id_comp);
			sent.setInt(3, cantidad);
			sent.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//FUNION DE SELECT TODOS LOS COMPONENTES
	public ResultSet selectComponentes() {
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery ("SELECT id_componente, nombre ,  precio , stock , id_tipo_componente, imagen FROM componente");
			return rset;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//FUNION DE SELECT TODOS LOS CLIENTES
	public ResultSet selectClientes() {
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery ("SELECT id_cliente, dni, nombre, apellido1, apellido2, email, poblacion, pais, direccion FROM cliente");
			return rset;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//FUNCION DE DADA DE ALTA DE USUARIOS
	public int insertClientes(String dni, String nombre, String apellido1, String apellido2, String email, String direccion, String poblacion, String pais) {
		
		try {
			sent = conn.prepareStatement("INSERT INTO cliente (dni, nombre, apellido1,apellido2,email, direccion,poblacion,pais) VALUES (?,?,?,?,?,?,?,?)");
			sent.setString(1, dni);
			sent.setString(2, nombre);
			sent.setString(3, apellido1);
			sent.setString(4, apellido2);
			sent.setString(5, email);
			sent.setString(6, direccion);
			sent.setString(7, poblacion);
			sent.setString(8, pais);
			
			return sent.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	//SELECCION DE MAXIMO ID
	public int maxId() {

		String strSent;
		
		strSent="SELECT MAX(id_cliente) FROM cliente";

		try {
			sent=conn.prepareStatement(strSent, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rset=sent.executeQuery();
			if(rset.first()) {
				return rset.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
