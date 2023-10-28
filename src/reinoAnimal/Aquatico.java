package reinoAnimal;

//Herda da classe Animal
public class Aquatico extends Animal {
    private String tipoAgua;
    private boolean escamas;

    //Construtor da classe 
    public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean escamas) {
        super(especie, sexo, dataNascimento);
        this.tipoAgua = tipoAgua;
        this.escamas = escamas;
    }

    //Método parra informar que o animal está nadando
	public void nadar() {
        System.out.println("O animal está nadando...");
    }

	//Está sobreescrevendo o método comer da classe Animal
    @Override
    public void comer() {
        System.out.println("O animal aquático está comendo...");
    }

    //Método que imprime todas informações do animal
    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Tipo de Água: " + tipoAgua);
        if (escamas) {
        	System.out.println("O animal possui escamas!");
        } else {
        	System.out.println("O animal não possui escamas!");
        }
    }
    
    //Abaixo todos os getter's e setter's
    public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
}

