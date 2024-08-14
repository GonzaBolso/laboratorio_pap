package logica;

public class Entrenador extends Usuario{
	
	private String sitioweb;
	private String disiplina;
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(String nick, String n, String ap,String mail, String pass, String sitioweb, String disiplina) {
		super(nick,n, ap, mail, pass);
		this.sitioweb = sitioweb;
		this.disiplina = disiplina; 
	}
	
	public String getSitioweb() {
		return sitioweb;
	}
	public void setSitioweb(String sitioweb) {
		this.sitioweb = sitioweb;
	}
	public String getDisiplina() {
		return disiplina;
	}
	public void setDisiplina(String disiplina) {
		this.disiplina = disiplina;
	}
	
	public String toString() {
		return "Entrenador [sitioweb=" + sitioweb + ", disiplina=" + disiplina + "]";
	}
	
}