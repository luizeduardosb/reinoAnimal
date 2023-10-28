package reinoAnimal;

public class Terrestre extends Animal {
    private String regiao;
    private boolean pelagem;

    public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelagem) {
        super(especie, sexo, dataNascimento);
        this.regiao = regiao;
        this.pelagem = pelagem;
    }

	public void mover() {
        System.out.println("O animal está se movendo...");
    }

    @Override
    public void comer() {
        System.out.println("O animal terrestre está comendo...");
    }

    @Override
    public void perfil() {
        super.perfil();
        System.out.println("Região: " + regiao);
        if (pelagem) {
        	System.out.println("O animal possui pelos!");
        } else {
        	System.out.println("O animal não possui pelos!");
        }
    }
    
    public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
}
