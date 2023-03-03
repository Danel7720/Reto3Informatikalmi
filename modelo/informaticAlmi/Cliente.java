package informaticAlmi;

public class Cliente {
	
	private int id;
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private String poblacion;
	private String pais;
	private String direccion;
	
	
	public Cliente(int id, String dni,String nombre, String apellido1,String apellido2, String email,String poblacion, String pais,String direccion) {
		//IGUALAR LOS PARAMETROS A LAS VARIABLES LOCALES
		this.id=id;
		this.dni=dni;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.email=email;
		this.poblacion=poblacion;
		this.pais=pais;
		this.direccion=direccion;
	}
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
