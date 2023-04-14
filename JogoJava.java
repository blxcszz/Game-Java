package jogojava;

import java.util.Scanner;

public class JogoJava {

    public static void main(String[] args) throws InterruptedException{
	Personagem player1 = new Personagem(10,0,0);
	Personagem player2 = new Personagem(10,0,0);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro jogador: ");        
	player1.nome = scanner.next();
        System.out.println("Digite o nome do segundo jogador: ");  
	player2.nome = scanner.next();
        
        System.out.println("===============================================");
        System.out.println("QUE COMECEM OS JOGOS!");
        System.out.println("O JOGADOR " + player1.nome + " JUNTO COM O JOGADOR " + player2.nome);
        System.out.println("DEVEM SOBREVIVER O MAXIMO DE DIAS POSSIVEIS");
        System.out.println("QUEM SOBREVIVER POR MAIS DIAS, GANHA!");
        System.out.println("===============================================");
        Thread.sleep(3000);
        System.out.println("Voce deseja ler o manual? \n [ 1 ]SIM \n [ 0 ]NAO");
        player1.respM = scanner.nextInt();
        
        if(player1.respM == 1){
           player1.manual(); 
        }
        System.out.println("=================================================================================");
        
        
        for( int num = 0; num <= 10; num++){
            if(player1.energia == 0 || player1.fome == 10 || player1.sono == 10|| player1.hp == 0 || player2.energia == 0 || player2.fome == 10 || player2.sono == 10 || player2.hp == 0){
                break;
            }
            System.out.println("[ 1 ] DORMIR");
            System.out.println("[ 2 ] CACAR");
            System.out.println("[ 3 ] COMER");
            System.out.println("[ 4 ] CRAFTING");
            System.out.println("[ 5 ] COLETAR MADEIRA");
            System.out.println("O que voce decidiu fazer, " + player1.nome + "?");
            player1.resp = scanner.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("[ 1 ] DORMIR");
            System.out.println("[ 2 ] CACAR");
            System.out.println("[ 3 ] COMER");
            System.out.println("[ 4 ] CRAFTING");
            System.out.println("[ 5 ] COLETAR MADEIRA");
            System.out.println("O que voce decidiu fazer, " + player2.nome + "?");
            player2.resp = scanner.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       
            player1.escolha();
            player2.escolha();
                                     
            
            System.out.println("---------------------");
            System.out.println("STATUS DOS JOGADORES:");
            System.out.println("---------------------");
            player1.status();
            player2.status();
            player2.verday();            
            player1.verday(); 
            player1.contD();
            player2.contD();
            }
            System.out.println("=================================================================================");
          
    }	
}    
   

