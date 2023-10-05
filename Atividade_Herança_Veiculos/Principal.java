package Atividade_Herança_Veiculos;

public class Principal {
	public static void main(String[]args){
		Veiculo veiculo = new Veiculo("Fiat", "Uno", 2010, "Preto");
		System.out.println("marca: "+ veiculo.getMarca());
		System.out.println("modelo: "+ veiculo.getModelo());
		System.out.println("ano: "+ veiculo.getAno());
		System.out.println("cor: "+ veiculo.getCor());
		
		Automovel automovel = new Automovel("Fiat", "Uno", 2010, "Preto", 2, "V8");
		System.out.println("\nmarca: "+ automovel.getMarca());
		System.out.println("modelo: "+ automovel.getModelo());
		System.out.println("ano: "+ automovel.getAno());
		System.out.println("cor: "+ automovel.getCor());
		System.out.println("numero de portas: "+ automovel.getNumeroPortas());
		System.out.println("motor: "+ automovel.getMotor());
		
		Moto moto = new Moto("Honda", "Fan", 2022, "Preto", 1629);
		System.out.println("\nmarca: "+ moto.getMarca());
		System.out.println("modelo: "+ moto.getModelo());
		System.out.println("ano: "+ moto.getAno());
		System.out.println("cor: "+ moto.getCor());
		System.out.println("cilindrada: "+ moto.getCilindrada());
		
	}
	
}
