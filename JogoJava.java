package jogojava;

import java.util.Scanner;

public class JogoJava {

    public static void main(String[] args) throws InterruptedException{
	Personagem cacador = new Personagem(10,0,0);
	Personagem soneca = new Personagem(1,6,4);
	cacador.nome = "O gigante";
	soneca.nome = "Soneca";
		
        while(true){
            Thread.sleep(2000);
            cacador.cacar();			
            cacador.comer();			
            cacador.dormir();			
            cacador.cacar();			
            cacador.cacar();
            cacador.cacar();
            System.out.println("<><><><><><><><><><><><><><><>");
            Thread.sleep(3000);
            soneca.dormir();
            soneca.dormir();
            soneca.dormir();
            soneca.comer();
            soneca.cacar();
            System.out.println("===============================");
            Thread.sleep(3000);
            soneca.verday();
            Thread.sleep(3000);
            cacador.verday();            
            Thread.sleep(3000);
            System.out.println("===============================");
	}
    }    
}
