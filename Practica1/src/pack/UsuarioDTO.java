package pack;

public class UsuarioDTO {
	String user;
	String email;
	String dir;
	String tlf;
	public UsuarioDTO(String user, String email, String dir, String tlf) {
		super();
		this.user = user;
		this.email = email;
		this.dir = dir;
		this.tlf = tlf;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	
	
}
