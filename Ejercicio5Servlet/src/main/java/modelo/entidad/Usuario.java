package modelo.entidad;

public class Usuario {
	
	String usuario;
	String password;
	
	public String getUsuario() {
		return usuario;
	}
	
	

	public Usuario(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}



	public void setNombreUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + usuario + ", password=" + password + "]";
	}
	
	

}
