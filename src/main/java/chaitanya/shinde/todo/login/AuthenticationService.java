package chaitanya.shinde.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("test");
		boolean isValidPassword = password.equalsIgnoreCase("test123");

		return isValidUsername && isValidPassword;
	}
}
