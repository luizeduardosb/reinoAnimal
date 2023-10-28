package reinoAnimal;

public class Aereo extends Animal {
    private double altVoo;

    public Aereo(String especie, String sexo, String dataNascimento, double altVoo) {
        super(especie, sexo, dataNascimento);
        this.altVoo = altVoo;
    }

	public void voar() {
        System.out.println("O animal está voando...");
    }

    @Override
    public void comer() {
        System.out.println("O animal aéreo está comendo...");
    }

    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Altitude de Voo: " + altVoo + "m");
    }
    
    public double getAltVoo() {
		return altVoo;
	}

	public void setAltVoo(double altVoo) {
		this.altVoo = altVoo;
	}
}

