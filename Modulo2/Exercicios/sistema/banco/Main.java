package sistema.banco;

public class Main {
	public static void main(String[] args) {
		
		//Primeiro Correntista
		Estado estado1 = new Estado(); 
		estado1.setNome("Mato Grosso do Sul");
		estado1.setUf("MS");
		
		Cidade cidade1 = new Cidade();
		cidade1.setEstado(estado1);
		cidade1.setNome("Campo Grande");
		
		Logadouro logadouro1 = new Logadouro();
		logadouro1.setRua("Rua do Orvalho");
		logadouro1.setCep("79040-470");
		logadouro1.setBairro("Chacara Cachoeira");
		logadouro1.setCidade(cidade1);
		
		Banco banco1 = new Banco();
		banco1.setCodigo(1010);
		banco1.setNome("Banco meh");
		
		Agencia agencia1 = new Agencia();
		agencia1.setCodigo(1010);
		agencia1.setNome("Meh, inc");
		agencia1.setLogadouro(logadouro1);
		agencia1.setNumero(937);
		agencia1.setBanco(banco1);
		
		Correntista correntista1 = new Correntista();
		correntista1.setCodigo(902409);
		correntista1.setNome("Renan");
		correntista1.setCpf("03555529178");
		
		Conta conta1 = new Conta();
		conta1.setNumero(939349);
		conta1.setAgencia(agencia1);
		conta1.setCorrentista(correntista1);
		
		//Segundo correntista
		Estado estado2 = new Estado();
		estado2.setNome("Mato Grosso do Sul");
		estado2.setUf("MS");
		
		Cidade cidade2 = new Cidade();
		cidade2.setEstado(estado2);
		cidade2.setNome("Campo Grande");
		
		Logadouro logadouro2 = new Logadouro();
		logadouro2.setRua("Rua Augusto Antonio Mira");
		logadouro2.setCep("79040-470");
		logadouro2.setBairro("Chacara Cachoeira");
		logadouro2.setCidade(cidade2);
		
		Banco banco2 = new Banco();
		banco2.setCodigo(1010);
		banco2.setNome("Banco Itah");
		
		Agencia agencia2 = new Agencia();
		agencia2.setCodigo(1000);
		agencia2.setNome("Meh, inc"); //Mesma agencia
		agencia2.setLogadouro(logadouro2);
		agencia2.setNumero(940);
		agencia2.setBanco(banco2);
		
		Correntista correntista2 = new Correntista();
		correntista2.setCodigo(90390);
		correntista2.setNome("Naner");
		correntista2.setCpf("035555i483");
		
		Conta conta2 = new Conta();
		conta2.setNumero(939950);
		conta2.setAgencia(agencia2);
		conta2.setCorrentista(correntista2);
		
		
		//Terceiro Correntista
		Estado estado3 = new Estado(); 
		estado3.setNome("Mato Grosso do Sul");
		estado3.setUf("MS");
		
		Cidade cidade3 = new Cidade();
		cidade3.setEstado(estado3);
		cidade3.setNome("Campo Grande");
		
		Logadouro logadouro3 = new Logadouro();
		logadouro3.setRua("Rua Itapaia");
		logadouro3.setCep("79040-489");
		logadouro3.setBairro("Chacara Cachoeira");
		logadouro3.setCidade(cidade3);
		
		Banco banco3 = new Banco();
		banco3.setCodigo(1110);
		banco3.setNome("Banco Uha");
		
		Agencia agencia3 = new Agencia();
		agencia3.setCodigo(1001);
		agencia3.setNome("Meh, inc");
		agencia3.setLogadouro(logadouro3);
		agencia3.setNumero(900);
		agencia3.setBanco(banco3);
		
		Correntista correntista3 = new Correntista();
		correntista3.setCodigo(902499);
		correntista3.setNome("Deadpool");
		correntista3.setCpf("03555899178");
		
		Conta conta3 = new Conta();
		conta3.setNumero(939349);
		conta3.setAgencia(agencia3);
		conta3.setCorrentista(correntista3);
		
		System.out.println("Conta 1:");
		System.out.println(conta1.toString());
		
		System.out.println("Conta 2:");
		System.out.println(conta2.toString());
		
		System.out.println("Conta 3:");
		System.out.println(conta3.toString());
		
	}

}
