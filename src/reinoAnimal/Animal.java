package reinoAnimal;

public class Animal {
    private String especie;
    private String sexo;
    private String dataNascimento;
    private static int contador;

    public Animal(String especie, String sexo, String dataNascimento) {
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        setContador(contador+1);
    }


    public void comer() {
        System.out.println("O animal está comendo...");
    }

    public void perfil() {
        System.out.println("Espécie: " + especie);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
    
    public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
    public static int getContador() {
        return contador;
    }
    
	public static void setContador(int contador) {
		Animal.contador = contador;
	}
}
