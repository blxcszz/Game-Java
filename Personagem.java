package jogojava;
import java.util.Random;
import java.util.Scanner;

public class Personagem{
    String nome;
    int resp, respM;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    int comida = 0;
    int couro = 0;
    int armadura = 0;
    int hp = 10;
    int horns = 0;
    int woods = 0;
    int arma = 0;
    int ferramenta = 0;
    
    Random rdm = new Random();   
    
    Scanner scanner = new Scanner(System.in);
    
    
    int numCr = rdm.nextInt(10 + 1);
    
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
                System.out.println(nome + " PASSOU O DIA CACANDO...");
                System.out.println("");
                System.out.println(nome + " tem 3 opcoes de caca");
                System.out.println("");
                System.out.println("[1] coelho");
                System.out.println("[2] veado");
                System.out.println("[3] touro");
                System.out.println("");
                System.out.println("escolha a o que quer cacar");
                int cc = scanner.nextInt();
                System.out.println("");

                switch (cc){
                    case 1:
                        int numC = rdm.nextInt(10 + 1);
                        
                        if (arma >= 1){
                            if (numC == 1 || numC == 2 || numC == 3 || numC == 4 || numC == 5 || numC == 6 || numC == 7 || numC == 8 || numC == 9 || numC == 10){

                            System.out.println(nome + " ganhou uma carne");

                            comida = Math.min(comida+1, 10);

                            if (numCr == 1 || numCr == 2 || numCr == 3 || numCr == 4 || numCr == 5){
                            System.out.println(nome + " conseguiu um couro");
                            couro = Math.min(couro+1, 20);
                            }
                          }else{System.out.println(nome + " foi burro o suficiente pra nao conseguir cacar um coelho, e tu tava armado cara");}        
                            
                        }else{
                            if (numC == 1 || numC == 2 || numC == 3 || numC == 4 || numC == 5 || numC == 6 || numC == 7 || numC == 8){

                            System.out.println(nome + " ganhou uma carne");

                            comida = Math.min(comida+1, 10);

                            if (numCr == 1 || numCr == 2 || numCr == 3){
                            System.out.println(nome + " conseguiu um couro");
                            couro = Math.min(couro+1, 20);
                            }
                          }else{System.out.println(nome + " foi burro o suficiente pra nao conseguir cacar um coelho");} 
                        
                        }
                        
                        energia -=2;
                    break;



                    case 2:                  
                        int numV = rdm.nextInt(10 + 1);
                        
                        if (arma >=1){
                        
                            if (numV == 1 || numV == 2 || numV == 3 || numV == 4 || numV == 5 || numV == 6){

                                System.out.println(nome + " ganhou duas carnes");
                                System.out.println("");
                                System.out.println("e ai, vai comer o veado?");

                                comida = Math.min(comida+2, 10);

                                if (numCr == 1 || numCr == 2 || numCr == 3 || numCr == 4){
                                   System.out.println(nome + " conseguiu 3 couro");
                                   couro = Math.min(couro+3, 20);
                                }
                                
                                }else{

                                 System.out.println(nome + " não conseguiu cacar o veado, ihhh la ele");

                                 if (armadura == 10){hp = Math.min(hp-1, 0);}
                                 else if(armadura <= 9){hp = Math.min(hp-2, 0);}
                                 else if(armadura <= 6){hp = Math.min(hp-3, 0);}
                                 else if(armadura <= 3){hp = Math.min(hp-4, 0);}
                                 else if(armadura == 0){hp = Math.min(hp-5, 0);}
                                }                        
                        }else{
                        
                            if (numV == 1 || numV == 2 || numV == 3 || numV == 4 || numV == 5){

                              System.out.println(nome + " ganhou duas carnes");
                              System.out.println("");
                              System.out.println("e ai, vai comer o veado?");

                              comida = Math.min(comida+2, 10);

                                if (numCr == 1 || numCr == 2 || numCr == 3){

                                  System.out.println(nome + " conseguiu 3 couro e 1 chifre");
                                  couro = Math.min(couro+3, 20);
                                  horns = Math.min(horns+1, 10);
                                }

                            }else{

                               System.out.println(nome + " não conseguiu cacar o veado, ihhh la ele");

                               if (armadura == 10){hp = Math.min(hp-1, 0);}
                               else if(armadura <= 9){hp = Math.min(hp-2, 0);}
                               else if(armadura <= 6){hp = Math.min(hp-3, 0);}
                               else if(armadura <= 3){hp = Math.min(hp-4, 0);}
                               else if(armadura == 0){hp = Math.min(hp-5, 0);}
                            }                        
                        }
                        energia -=2;
                    break;

                    case 3:

                        int numT = rdm.nextInt(10 + 1);
                        
                        if (arma == 2){
                            if (numT == 1 || numT == 2 || numT == 3){

                            System.out.println(nome + " ganhou cinco carnes");
                            System.out.println("");
                            System.out.println("vai levar os chifres tbm?");

                            comida = Math.min(comida+5, 10);

                            if (numCr == 1){
                               System.out.println(nome + "conseguiu 4 couros e 2 chifres");
                               couro = Math.min(couro+4, 20);
                               horns = Math.min(horns+2, 10);
                            }
                            
                        }else{

                           System.out.println(nome + " levou arma e não conseguiu cacar touro, e ainda levou chifrada, mas e um corno mesmo");
                           if (armadura == 10){hp = Math.min(hp-1, 0);}
                           else if(armadura <= 9){hp = Math.min(hp-3, 0);}
                           else if(armadura <= 6){hp = Math.min(hp-5, 0);}
                           else if(armadura <= 3){hp = Math.min(hp-7, 0);}
                           else if(armadura == 0){hp = Math.min(hp-10, 0);}
                        }                  
                        
                        }else{
                        
                            if (numT == 1 || numT == 2 ){

                          System.out.println(nome + " ganhou cinco carnes");
                          System.out.println("");
                          System.out.println("vai levar os chifres tbm?");

                          comida = Math.min(comida+5, 10);
                          
                            if (numCr == 1){

                                System.out.println(nome + "conseguiu 4 couros");
                                couro = Math.min(couro+4, 20);
                            }
                            
                        }else{

                           System.out.println(nome + " não conseguiu cacar touro, e ainda levou chifrada, mas é um corno mesmo");
                           if (armadura == 10){hp = Math.min(hp-1, 0);}
                           else if(armadura <= 9){hp = Math.min(hp-3, 0);}
                           else if(armadura <= 6){hp = Math.min(hp-5, 0);}
                           else if(armadura <= 3){hp = Math.min(hp-7, 0);}
                           else if(armadura == 0){hp = Math.min(hp-10, 0);}
                        }                  
                        
                        }
                           

                        energia -=4;
                    break;
                }           
	}else{
            System.out.println(nome + " ESTA SEM ENERGIA PARA CACAR!");
	}
            fome = Math.min(fome+1, 10);
            sono = Math.min(sono+1, 10);			
        }
        
	public void comer(){
	if(fome >= 1 && comida >= 1){
            System.out.println(nome + " RESOLVEU SE ALIMENTAR HOJE...");	
            energia = Math.min(energia+1, 10);
            fome = Math.min(fome-1, 10);
            comida = Math.min(comida-1, 10);
	}else{
            System.out.println(nome + " ESTA SEM FOME OU SEM COMIDA!");
            fome = Math.min(fome+1, 10);
         }
	}
	public void dormir(){
            if(sono >= 1){
		System.out.println(nome + " PASSOU O DIA DORMINDO...");
		sono = Math.max(sono-1,0);
		energia = energia + 1 <= 10 ? energia + 1 : 10;
                fome = Math.min(fome+1, 10);
            }
            else{
                System.out.println(nome + " ESTA SEM SONO");
                fome = Math.min(fome+1, 10);
            }
	}
        
        public void makeW(){
            
            System.out.println("voce entrou na bancada de trabalho!");
            System.out.println("podemos fazer: armas e armaduras");
            System.out.println("");
            System.out.println("[1] armas");
            System.out.println("[2] armaduras");
            System.out.println("[3] ferramenta");
            System.out.println("");
            System.out.println("o que voce quer fazer?");
            int respw = scanner.nextInt();
            
            switch(respw){
                case 1:
                    
                    if (horns == 2 && woods == 1){
                        System.out.println("oh, os tutorias do minecraft tão rendendo em");
                        arma = Math.min(arma+1, 2);
                    }else{
                        System.out.println("ta querendo fazer arma com vento?");
                    }
                break;
                
                case 2:
                    
                    if (couro == 4){
                        System.out.println("ta conseguindo fazer muita coisa em " + nome);
                        
                        if (couro >= 6){                
                            couro -=6;
                            armadura = Math.min(armadura+1,10);                
                        }
                    }else{
                        System.out.println(nome + ", vai rancar o couro do outro jogador pra fazer a armadura, porque com isso daqui nao vai rolar");                    
                    }
                break;
                
                case 3:
                    if (horns == 1 && woods == 1){
                        System.out.println(" ai sim " + nome + ", vai poder parar de dar soco na arvore pra descontar a raiva");
                    }else{
                        System.out.println("eh " + nome + ", pelo jeito tu ainda vai continuar emozinho, desocntando a raiva na arvore, tadinho(a)");
                    }
                    
                break;
                
            }        
        }
        
        public void goWood(){         
          if(energia == 1){   
              
              System.out.println(nome + "DECIDIU COLETAR PAU");
              if (ferramenta == 1){
                
                System.out.println("");
                System.out.println("isso boy, mete o machado nele");
                woods = Math.min(woods+4,20);
              }else{
                  System.out.println("");
                  System.out.println("ta muito inspirado no mine mesmo em boy, ta quebrando arvore no murro");
                  woods = Math.min(woods+1,20);                  
              }
              
            }
          energia--;
        }
        
        public void verday(){
            if(fome == 10 || energia <= 1 || hp == 0){
                
                System.out.println(nome + " nao tankou o bostil e foi de americanas");        
            }else{
                
                System.out.println(nome + " conseguiu sobreviver por mais um dia");                             
            }
            
        } 
        
        public void contD(){
            int day = 1;
            System.out.println("os jogadores sobreiveram ao dia: " + day);
            day++;
        
        }
        
        public void status(){
            System.out.println(nome + " ESTA COM:");
            System.out.println(hp + " pontos de vida");
            System.out.println(energia + " pontos de energia,");
            System.out.println(sono + " pontos de sono,");
            System.out.println(fome + " pontos de fome");
            System.out.println(comida + " unidades de carnes");
            System.out.println(couro + " couros");
            System.out.println(armadura + " pontos de armadura");
            System.out.println(woods + " madeira(s)");
            System.out.println("---------------------");
        }
        
        public void manual(){
                System.out.println("MANUAL DO JOGO:");
                System.out.println("OS DOIS JOGADORES COMECAM COM 10 DE ENERGIA, 10 DE HP, 0 DE FOME, 0 DE SONO E 0 DE ARMADURA!");
                System.out.println("OS JOGADORES PODEM DORMIR, COMER, FAZER ARMADURA OU CACAR!");
                System.out.println("");
                System.out.println("SE UM JOGADOR DORMIR, ELE PERDE 1 PONTO DE SONO E GANHA 1 DE ENERGIA E 1 DE FOME!");
                System.out.println("");
                System.out.println("SE UM JOGADOR COMER, ELE GANHA 1 PONTO DE ENERGIA, GANHA 1 PONTO DE VIDA E PERDE 1 DE FOME!");
                System.out.println("");
                System.out.println("SE UM JOGADOR CACAR, ELE PERDE PONTOS DE ENERGIA EQUIVALENTE AOS ANIMAIS QUE VOCE CACA");
                System.out.println("E GANHA 1 DE FOME E 1 DE SONO!\"");
                System.out.println("");
                System.out.println("UM JOGADOR SÓ PODE COMER SE ELE POSSUIR CARNE, A CADA UMA CACADA O JOGADOR GANHA CARNE EQUIVALENTE AO ANIMAL QUE CACA!");
                System.out.println("");
                System.out.println("OS JOGADORES SÓ PODEM CRAFTAR ARMADURAS SE TIVEREM 6 COUROS");
                System.out.println("COURO PODE SER OBTIDO AO CACAR ANIMAIS, E A QUANTIDADE VARIA DO TAMANHO DO ANIMAL");
                System.out.println("=================================================================================");
            
        }
      public void escolha(){
        switch (resp) {
            case 1 -> dormir();
            case 2 -> cacar();
            case 3 -> comer();
            case 4 -> makeW();
            case 5 -> goWood();
            default -> {
            }
        }
      }
}       	
