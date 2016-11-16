package dto;

import java.io.Serializable;

public class CredentialDTO implements Serializable {

	private static final long serialVersionUID = -188365156698426191L;

	public CredentialDTO() {
		super();
	}

	public CredentialDTO(String username, String password, String type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	private String username;
	private String password;
	private String type;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
