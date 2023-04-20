package com.mycompany.retria.MODEL;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Inovacao {
	public void execCommand(String commandLine) throws IOException {
        List<String> retorno = new ArrayList();
        
        try {
            Process p = Runtime.getRuntime().exec(commandLine);

            Scanner scanner = new Scanner(new InputStreamReader(p.getInputStream(), "UTF-8"));
            
            while (scanner.hasNextLine()) {
                
                String linha = scanner.nextLine();
                		
    			retorno.add(linha);
            }
            scanner.close();
            
            String fraseFinal = retorno.get(retorno.size() - 1);
            System.out.println(fraseFinal);
            
            if (retorno.size() > 2) {
            	System.out.println("Conexão teste foi bem sucedida");
            	
            } else {
            	System.out.println("Conexão não foi bem sucedida");
            }
            
        } catch (IOException e) {
            System.out.println(new IOException(String.format("Falha ao executar comando %s. Erro: %s", commandLine, e.toString())));
        }
        
        
    }

}
