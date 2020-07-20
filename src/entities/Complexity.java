package entities;

public class Complexity {
	
	private String password;
	
	public Complexity (String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int validaComplexidade() {
		boolean isUpper = false;
		boolean isLower = false;
		boolean isDigit = false;
		boolean invalid = false;
		if (password.length() >= 8 && password.length() <= 32) {			//testa se a senha tem de 8 a 32 caracteres
			int n = password.length();
			for(int i = 0; i < n; i++ ) {
				char ch = password.charAt(i);
				if (Character.isUpperCase(ch)) {
					isUpper = true;											//salva se tem letra maiuscula
				}
				else if (Character.isLowerCase(ch)) {
					isLower = true;											//salva se tem letra minuscula
					}
				else if (Character.isDigit(ch)) {
					isDigit = true;											//salva se tem numero
				}
				else if (!Character.isAlphabetic(ch)) {					    //testa caracteres invalidos
					invalid = true;
				}
				//unica forma que encontei de testar acentuacao
				if (ch == 'á' || ch == 'à' || ch == 'ã' ||ch == 'ä' || ch == 'â' || ch == 'Á' || ch == 'À' || ch == 'Ã' || ch == 'Ä' || ch == 'Â' ||
				    ch == 'é' || ch == 'è' || ch == 'ë' ||ch == 'ê' || ch == 'É' ||	ch == 'È' || ch == 'Ë' || ch == 'Ê' ||
				    ch == 'í' || ch == 'ì' || ch == 'ï' ||ch == 'î' || ch == 'Í' || ch == 'Ì' || ch == 'Ï' || ch == 'Î' ||
				    ch == 'ó' || ch == 'ò' || ch == 'õ' ||ch == 'ö' || ch == 'ô' || ch == 'Ó' || ch == 'Ò' || ch == 'Õ' || ch == 'Ö' || ch == 'Ô' ||
				    ch == 'ú' || ch == 'ù' || ch == 'ü' ||ch == 'û' || ch == 'Ú' || ch == 'Ù' || ch == 'Ü' || ch == 'Û') {	
					invalid = true;
				}
			 }
			if (isUpper == true && isLower == true && isDigit == true && invalid == false) 
				return 1;
			else
				return 0;
			}
			
		else
			return 0;
	}
	
}
