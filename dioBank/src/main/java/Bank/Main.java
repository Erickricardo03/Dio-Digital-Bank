package Bank;

public class Main {
	

	
		

		public static void main(String[] args) {
	        Banco bancoInicial = new Banco(); 

	        bancoInicial.setNome("First Bank"); 

	        Cliente carla = new Cliente("Erick", bancoInicial); 
	        carla.setNome("Erick Ricardo"); 

	        Conta ccorrente = new ContaCorrente(carla); 

	        ccorrente.depositar(100); 

	       Cliente gabriela = new Cliente("Gabriela", bancoInicial); 
	    
			Conta cpoupanca = new ContaPoupanca(gabriela); 

	        ccorrente.imprimirExtrato();  
	        cpoupanca.imprimirExtrato();  

	        ccorrente.transferir(48, cpoupanca);  

	        ccorrente.imprimirExtrato(); 
	        cpoupanca.imprimirExtrato(); 
	        bancoInicial.mostrarClientes(); 

	        Cliente erick = new Cliente("Erick", bancoInicial);  
	    
			Conta ccorrente2 = new ContaCorrente(erick);
	        ccorrente2.imprimirExtrato();  
	        bancoInicial.mostrarClientes(); 

	}
}
