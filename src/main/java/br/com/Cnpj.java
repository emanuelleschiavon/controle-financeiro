package br.com;

public class Cnpj {
	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
	}
	
    public String getCnpj() {
		return valor;
	}

	public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }
    
    private int primeiroDigitoCorreto() {
        // Calcula o primeiro dígito verificador correto para o CNPJ armazenado no atributo valor
        return 0;
    }
    private int primeiroDigitoVerificador() {
        // Extrai o primeiro dígito verificador do CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoCorreto() {
        // Calcula o segundo dígito verificador correto para o CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoVerificador() {
        // Extrai o segundo dígito verificador do CNPJ armazenado no atributo valor
        return 0;
    }
    
    @Override
    public int hashCode() {
    	return this.valor.hashCode(); // delegamos a geracao do hashCode da classe Cnpj para seu atributo String valor
    }
        
    @Override
    public boolean equals(Object obj) {
    	if(!(obj instanceof Cnpj)) {
    		return false;
        } 
        Cnpj outro = (Cnpj) obj;
        return this.valor.equals(outro.valor);
    }
}
