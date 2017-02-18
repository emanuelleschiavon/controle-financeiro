package br.com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pagamentos{
	
	private double valorPago;
	private List<Pagamento> pagamentos = new ArrayList<>();
	
    public double getValorPago() {
        return this.valorPago;
    }
	
    public void paga(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
            valor = valor - 8;
        }
        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
    	this.pagamentos.add(pagamento);
    	this.paga(pagamento.getValor());
    }

    public List<Pagamento> pagamentosAntesDe(Calendar data) {
    	List<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    
	public List<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		List<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
 
    public List<Pagamento> pagamentosDo(String cnpjPagador) {
    	List<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}