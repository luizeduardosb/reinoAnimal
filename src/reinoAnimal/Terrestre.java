package reinoAnimal;

//Herda da classe Animal
public class Terrestre extends Animal {
    private String regiao;
    private boolean pelagem;

    //Construtor da classe 
    public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelagem) {
        super(especie, sexo, dataNascimento);
        this.regiao = regiao;
        this.pelagem = pelagem;
    }

    //Método parra informar que o animal está movendo-se
	public void mover() {
        System.out.println("O animal está se movendo...");
    }

	//Está sobreescrevendo o método comer da classe Animal
    @Override
    public void comer() {
        System.out.println("O animal terrestre está comendo...");
    }

    //Método que imprime todas informações do animal
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
    
    //Abaixo todos os getter's e setter's
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
