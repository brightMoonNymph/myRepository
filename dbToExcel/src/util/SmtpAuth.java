package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SmtpAuth extends Authenticator  {
	private String username;
	private String password;
	public SmtpAuth(String username, String passsword){
			this.username = username;
			this.password = password;
	}
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
	protected PasswordAuthentication getPasswordAuthentication(){
		return new javax.mail.PasswordAuthentication(username,password);
	}
}
