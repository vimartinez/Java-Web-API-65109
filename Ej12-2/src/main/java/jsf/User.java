package jsf;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class User {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String iniciarSesion() {

		//emular conexión a bd bd
		Map<String, String> listaUsuarios = new HashMap<>();
		listaUsuarios.put("usuario1", "1234");
		listaUsuarios.put("usuario2", "1234");
		listaUsuarios.put("usuario3", "1234");
		listaUsuarios.put("usuario4", "1234");

		for (Entry<String, String> entry : listaUsuarios.entrySet()) {
			String clave = entry.getKey();
			String valor = entry.getValue();

			if (clave.equals(getUserName()) && valor.equals(getPassword())) {
				System.out.println("Usuario encontrado");
				return "home";
			}
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage("user", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o Clave incorrectos", null));
		return null;
	}
	

}
