
public class TesteFuncionario {
	
		public static void main(String[] args) {
				
			Funcionario nico = new Funcionario();
			nico.setNome("Marilia Bob");
			nico.setCpf("261977777-02");
			nico.setSalario(3000.00);
			
			System.out.println(nico.getNome());
			System.out.println(nico.getBonificacao());
			
		}
}
