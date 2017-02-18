package br.com;

public class Divida {
    private double total;
    private String credor;
    private Cnpj cnpjCredor;
    private Pagamentos pagamentos;

    public Cnpj getCnpjCredor() {
        return this.cnpjCredor;
    }
    public void setCnpjCredor(Cnpj cnpjCredor) {
    	this.cnpjCredor = cnpjCredor;
    }

    public String getCredor() {
        return this.credor;
    }
    public void setCredor(String credor) {
    	this.credor = credor;
    }

    public double getTotal() {
        return this.total;
    }
    public void setTotal(double total) {
    	this.total = total;
    }
	
    public Pagamentos getPagamentos() {
		return pagamentos;
	}
			
    public void registra(Pagamento pagamento) {
        pagamentos.registra(pagamento);
    }
		
			
}