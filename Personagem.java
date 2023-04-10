package jogojava;
import java.util.Scanner;

public class Personagem{
    Scanner scanner = new Scanner(System.in);
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    public Personagem(int energia, int fome, int sono){
	if(energia >= 0 && energia <=10)
            this.energia = energia;
            if(fome >= 0 && fome <=10)
            this.fome = fome;
            
            if(sono >= 0 && sono <=10)
            this.sono = sono;		
	}
	
	public Personagem(String nome, int energia, int fome, int sono){
            this(energia,fome,sono);
            this.nome = nome;	
	}

	
	public void cacar(){
            if(energia >= 2){
            System.out.println(nome + " esta cacando");
            energia -=2;			
	}else{
            System.out.println(nome + " esta sem energia para cacar");
	}
            fome = Math.min(fome+1, 10);
            sono = Math.min(sono+1, 10);			
        }
	public void comer(){
	if(fome >= 1){
            System.out.println(nome + " esta comendo");	
            energia = Math.min(energia+1, 10);
	}else{
            System.out.println(nome + " esta sem fome");
         }
	}
	public void dormir(){
            if(sono >= 1){
		System.out.println(nome + " esta dormindo");
		sono = Math.max(sono-1,0);
		energia = energia + 1 <= 10 ? energia + 1 : 10;
                fome = Math.min(fome+1, 10);
            }
	}
        public void verday(){
            if(fome == 10 && energia <= 1){
                
                System.out.println(nome + " nao tankou o bostil e foi de americanas");
        
            }else{
                
                System.out.println(nome + " conseguiu sobreviver por mais um dia");
                             
            }
            
        }       
}       	