package apsii;

import javax.print.PrintException;

public class Teste implements LerArquivo {
	@Override
	public boolean teste(String file) {
		if (file != null) {
			System.out.println("Arquivo n�o corrompido");
			return true;
		}else
			System.out.println("Arquivo corrompido");
		return false;
	}
}
