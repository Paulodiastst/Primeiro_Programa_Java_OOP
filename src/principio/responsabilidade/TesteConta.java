package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Paulo");
		
		System.out.println(bancaria);
		

		bancaria.diminui100reais();
		bancaria.diminui100reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100reais();
		
		System.out.println(bancaria);
	}

}
