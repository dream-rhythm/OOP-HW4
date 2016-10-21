package fcu.iecs.oop.password;

public class PasswordEncorder {

	public String encode(String password){
		password=password.replace('a', '4').replace('A', '4');
		password=password.replace('e', '3').replace('E', '3');
		password=password.replace('i', '1').replace('I', '1');
		password=password.replace('o', '0').replace('O', '0');
		password=password.replace('t', '7').replace('T', '7');
		return password;
	}

}
