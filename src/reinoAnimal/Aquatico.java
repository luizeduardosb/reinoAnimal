package reinoAnimal;

public class Aquatico extends Animal {
    private String tipoAgua;
    private boolean escamas;

    public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean escamas) {
        super(especie, sexo, dataNascimento);
        this.tipoAgua = tipoAgua;
        this.escamas = escamas;
    }


	public void nadar() {
        System.out.println("O animal está nadando...");
    }

    @Override
    public void comer() {
        System.out.println("O animal aquático está comendo...");
    }

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

