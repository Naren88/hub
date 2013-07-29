package naren.sourcecodes;

import java.io.Serializable;

public class Employee implements Serializable {
	public static final long serialVersionUID = 1L;
	private String user;

	public Employee(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}