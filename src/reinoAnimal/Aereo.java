package reinoAnimal;

//Herda da classe Animal
public class Aereo extends Animal {
    private double altVoo;

    //Construtor da classe
    public Aereo(String especie, String sexo, String dataNascimento, double altVoo) {
        super(especie, sexo, dataNascimento);
        this.altVoo = altVoo;
    }

    //Método parra informar que o animal está voando
	public void voar() {
        System.out.println("O animal está voando...");
    }

	//Está sobreescrevendo o método comer da classe Animal
    @Override
    public void comer() {
        System.out.println("O animal aéreo está comendo...");
    }

    //Método que imprime a informação da altura de voo do animal   
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Altitude de Voo: " + altVoo + "m");
    }
    
    //Abaixo todos os getter's e setter's
    public double getAltVoo() {
		return altVoo;
	}

	public void setAltVoo(double altVoo) {
		this.altVoo = altVoo;
	}
}

