package reinoAnimal;


// Classe de entrada do programa que faz a criação e interação com as instâncias dos diferentes tipos de animais
public class Principal {

	public static void main(String[] args) {

		// Cria as instâncias dos tipos de animais diferentes
        Aquatico aq1 = new Aquatico("Carcharias taurus", "fêmea", "7", "água salgada", false);
        Aquatico aq2 = new Aquatico("Pygocentrus nattereri", "macho", "3", "água doce", true);
        
        Terrestre ter1 = new Terrestre("Felis catus", "fêmea", "2", "Ásia", true);
        Terrestre ter2 = new Terrestre("Hydrochoerus hydrochaeris", "macho", "8", "América do Sul", true);

        Aereo aer1 = new Aereo("Coragyps atratus", "macho", "3", 54.5);
        Aereo aer2 = new Aereo("Amazona aestiva", "fêmea", "10", 37.9);

        //Exibe as informações dos animais e ações definidas em cada classe
        System.out.println("Animais aquáticos");
        aq1.perfil();
        aq1.nadar();
        aq1.comer();
        System.out.println();

        aq2.perfil();
        aq2.nadar();
        aq2.comer();
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Animais terrestres");
        ter1.perfil();
        ter1.mover();
        ter1.comer();
        System.out.println();

        ter2.perfil();
        ter2.mover();
        ter2.comer();
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Animais aéreos");
        aer1.perfil();
        aer1.voar();
        aer1.comer();
        System.out.println();

        aer2.perfil();
        aer2.voar();
        aer2.comer();
        System.out.println("----------------------------------------------------------------------");

        //Usando o contador da classe superior, ele exibe a quantidade de animais instanciados
        System.out.println("Quantidade de animais instanciados: " + Animal.getContador());
    }
}

