package br.com.stefanini.projetodois.model.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountHolderValidate {

	public Boolean isNome(String nome) {
		Pattern p = Pattern.compile("[a-zA-Z ]{2,50}");
		Matcher m = p.matcher(nome);
		return m.matches();
	}

	public Boolean isIdAccountHolder(Integer id) {
		if (id <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(email);
		return m.matches();
	}

}
