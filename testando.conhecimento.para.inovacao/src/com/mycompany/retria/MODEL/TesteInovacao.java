package com.mycompany.retria.MODEL;

import java.io.IOException;

public class TesteInovacao {
	public static void main(String[] args) throws IOException {
		Inovacao ino = new Inovacao();
		
		ino.execCommand("ping www.google.com");
		//ino.execCommand("ping www.kajskase.com");
		//ino.execCommand("pi www.google.com");
	}
}
