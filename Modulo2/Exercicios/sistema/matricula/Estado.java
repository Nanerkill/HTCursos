package sistema.matricula;

public class Estado {
	private String nome;
	private String uf;
	
	//constructor
	public Estado(String nome) {
		this.nome = nome;
		
		switch (nome.toLowerCase()) {
		
		case "acre" :
			uf = "AC";
			break;
			
		case "alagoas" :
			uf = "AL";
			break;
			
		case "amapa" :
			uf = "AM";
			break;
			
		case "amazonas" :
			uf = "AM";
			break;
			
		case "bahia" :
			uf = "BA";
			break;
			
		case "ceara" :
			uf = "CE";
			break;
			
		case "distritto federal" :
			uf = "DF";
			break;
			
		case "espirito santo" :
			uf = "ES";
			break;
			
		case "goias" :
			uf = "GO";
			break;
			
		case "maranhao" :
			uf = "MA";
			break;
			
		case "mato grosso" :
			uf = "MT";
			break;
			
		case "mato grosso do sul" :
			uf = "MS";
			break;
			
		case "minas gerais" :
			uf = "MG";
			break;
			
		case "para" :
			uf = "PA";
			break;
			
		case "paraiba" :
			uf = "PB";
			break;
			
		case "pernambuco" :
			uf = "PE";
			break;
			
		case "piaui" :
			uf = "PI";
			break;
			
		case "rio de janeiro" :
			uf = "RJ";
			break;
			
		case "rio grande do norte" :
			uf = "RN";
			break;
			
		case "rio grande do sul" :
			uf = "RS";
			break;
			
		case "rondonia" :
			uf = "RO";
			break;
			
		case "roraima" :
			uf = "RR";
			break;
			
		case "santa catarina" :
			uf = "SC";
			break;
			
		case "sao paulo" :
			uf = "SP";
			break;
			
		case "sergipe" :
			uf = "SE";
			break;
			
		case "tocantins" :
			uf = "TO";
			break;
			
		default :
			uf = "Estado invalido";
			break;
		}
	}
	
	//get & set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return nome + "\n" + uf;
	}
	

}
