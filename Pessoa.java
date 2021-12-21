import java.util.Scanner;

class Pessoa
{
    String pai, mae, serhumano, serhumano2, pai2, mae2, avomaterno, avopaterno, vomaterna, vomaterna, aux;
    Scanner input = new Scanner ( System.in );
    
    public Pessoa(String nomepai, String nomemae, String nomeindividuo){
        System.out.println("Por favor, informe o nome do pessoa: ");
        String nomein = input.next();
        nomeindividuo = nomein;
        this.individuo = nomeindividuo;
        System.out.println(" ");
        System.out.println("Por favor, informe o nome do pai: ");
        String nomep = input.next();
        nomepai = nomep;
        this.pai = nomepai;
        System.out.println(" ");
        System.out.println("Por favor, informe o nome da mãe: ");
        String nomem = input.next();
        nomemae = nomem;
        this.mae = nomemae;   
        
    }
    
    
    public void setSerhumano2(String nomepai2, String nomemae2, String nomeindividuo2){
        System.out.println(" ");
        System.out.println("Por favor, informe o nome da pessoa: ");
        String nomein = input.next();
        nomeindividuo2 = nomein;
        this.individuo2 = nomeindividuo2; 
        System.out.println(" ");
        System.out.println("Por favor, informe o nome do pai: ");
        String nomep = input.next();
        nomepai2 = nomep;
        this.pai2 = nomepai2; 
        System.out.println(" ");
        System.out.println("Por favor, informe o nome da mãe: ");
        String nomem = input.next();
        nomemae2 = nomem;
        this.mae2 = nomemae2; 
    }
    
    public void setIrmas(){
        if(this.pai == this.pai2 && this.mae == this.mae2){
            System.out.println(" ");
            System.out.println("São irmãos ou irmãs.");
        }else{
            System.out.println(" ");
            System.out.println("Não são irmãs ou irmãos...");
        }
    }
    
    public void confere(String nomeavop, String nomevop, String nomeavom, String nomevom){
        System.out.println(" ");
        System.out.println("Por favor, informe o nome do avô paterno: ");
        String nomein = input.next();
        nomeavop = nomein;
        this.avopaterno = nomeavop; 
        System.out.println(" ");
        System.out.println("Por favor, informe o nome da vó paterna: ");
        String nomep = input.next();
        nomevop = nomep;
        this.vopaterna = nomevop; 
        System.out.println(" ");
        System.out.println("Por favor, informe o nome do avô materno: ");
        String nomeout = input.next();
        nomeavom = nomeout;
        this.avomaterno = nomeavom; 
        System.out.println(" ");
        System.out.println("Por favor, informe o nome da vó materna: ");
        String nomem = input.next();
        nomevom = nomem;
        this.vomaterna = nomevom; 
        
    }
    
   
    public String getserhumano(){
        return this.serhumano;
    }
    
    public String getpai(){
        return this.pai;
    }
    
    public String getmae(){
        return this.mae;
    }
    
    public String getserhumano2(){
        return this.individuo2;
    }
    
    public String getpai2(){
        return this.pai2;
    }
    
    public String getmae2(){
        return this.mae2;
    }
    
    public String getavop(){
        return this.avopaterno;
    }
    
    public String getvop(){
        return this.vopaterna;
    }
    
    public String getavom(){
        return this.avomaterno;
    }
    
    public String getvom(){
        return this.vomaterna;
    }

}
    
public class Main{    
	public static void main(String[] args) {
	    Pessoa classe = new Pessoa("a", "b,", "c");
        System.out.println(" ");
	    System.out.println("Nome da pessoa: " + classe.getserhumano());
		System.out.println("Nome do pai: " + classe.getpai());
		System.out.println("Nome da mãe: " + classe.getmae());
	    classe.setSegundaPessoa("a", "b,", "c");
	    System.out.println(" ");
	    System.out.println("Nome da pessoa: " + classe.getserhumano2());
		System.out.println("Nome do pai: " + classe.getpai2());
		System.out.println("Nome da mãe: " + classe.getmae2());
	    classe.setIrmas();
	    classe.verifica("a", "b", "c", "d");
	    System.out.println(" ");
	    System.out.println("Nome do avô paterno: " + classe.getavop());
		System.out.println("Nome da vó paterna: " + classe.getvop());
		System.out.println("Nome do avô materno: " + classe.getavom());
		System.out.println("Nome da vó materna: " + classe.getvom());
	}
}

