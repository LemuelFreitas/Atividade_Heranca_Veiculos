package Atividade_Herança_Veiculos;

public class Automovel extends Veiculo{
	private int numeroPortas;
	private String Motor;
	public Automovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
		super(marca, modelo, ano, cor);
		this.numeroPortas = numeroPortas;
		Motor = motor;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getMotor() {
		return Motor;
	}
	public void setMotor(String motor) {
		Motor = motor;
	}
	
	
	}


