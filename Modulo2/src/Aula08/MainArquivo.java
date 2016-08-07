package Aula08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainArquivo {
	public static void main(String[] args) {
		
		File file = new File("C:/Users/renan/Meh.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());
			int data = fis.read();
            while (data != -1) {
                   System.out.print((char)data);
                    data = fis.read();
		}
            fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Nao achou o arquivo");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
