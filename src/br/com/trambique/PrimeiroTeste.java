package br.com.trambique;

import java.util.Scanner;

public class PrimeiroTeste {

    public static void main(String[] args) {
    	
    	/*Produtos*/
        
    	
    	Produto produto1 = new Produto();
    	produto1.codigoProduto = 1;
    	produto1.descricaoProduto = "Camisa";
    	produto1.valorProduto = 70.00f;
    	
    	Produto produto2 = new Produto();
    	produto2.codigoProduto = 2;
    	produto2.descricaoProduto = "Shorts";
    	produto2.valorProduto = 57.50f;
    	
    	Produto produto3 = new Produto();
    	produto3.codigoProduto = 3;
    	produto3.descricaoProduto = "Meia";
    	produto3.valorProduto = 9.99f;
    	
    	Produto produto4 = new Produto();
    	produto4.codigoProduto = 4;
    	produto4.descricaoProduto = "Toca";
    	produto4.valorProduto = 35.00f;
    	
    	Produto produto5 = new Produto();
    	produto5.codigoProduto = 5;
    	produto5.descricaoProduto = "Luvas";
    	produto5.valorProduto = 19.50f;
    	
    	/*Pagamentos*/
    	
    	Pagamento pagamento1 = new Pagamento();
    	pagamento1.codigoPagamento = 1;
    	pagamento1.descricaoPagamento = "A vista no dinheiro com 10% de desconto";
    	pagamento1.desconto = 10f;
    	
    	Pagamento pagamento2 = new Pagamento();
    	pagamento2.codigoPagamento = 2;
    	pagamento2.descricaoPagamento = "A vista no cartão de crédito  com 5% de desconto";
    	pagamento2.desconto = 10f;
    	
    	Pagamento pagamento3 = new Pagamento();
    	pagamento3.codigoPagamento = 3;
    	pagamento3.descricaoPagamento = "Em duas parcelas sem nenhum desconto";
    	pagamento3.desconto = 10f;
    	
    	Pagamento pagamento4 = new Pagamento();
    	pagamento4.codigoPagamento = 4;
    	pagamento4.descricaoPagamento = " Em três vezes com 10% de juros";
    	pagamento4.juros = 10f; 	
    
    	
    	/*como buscar informação em outra planilha via scan*/
    	    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Digite o código do produto:");
    	
    	int produto = scan.nextInt();
    	
    	System.out.println("Digite o código da forma de pagamento:");
    	
    	int codigoPagamento = scan.nextInt();
    	
    	/*Calculo porcentagem*/
    	
    	scan.close();
    	
    	Venda venda = new Venda();
    	
    	
    	if (produto == 1) {
    		venda.produto = produto1;
    	} else if (produto == 2) {
    		venda.produto = produto2;
    	}	else if (produto == 3){
    		venda.produto = produto3;
    	}	else if (produto == 4){
        	venda.produto = produto4;
    	}	else if (produto == 5){
    		venda.produto = produto5;
    	}	else if (produto > 6){
    		System.out.println("Produto não cadastrado");
    	} else {
    		System.out.println("Digitar um código válido");
    	}
    	
    	
    	if (codigoPagamento == 1) {
    		venda.pagamento = pagamento1;
    		venda.valorFinal = venda.produto.valorProduto - ((venda.produto.valorProduto * 10) / 100);
    	} else if (codigoPagamento == 2) {
    		venda.pagamento = pagamento2;
    		venda.valorFinal = venda.produto.valorProduto - ((venda.produto.valorProduto * 5) / 100);
    	}	else if (codigoPagamento == 3){
    		venda.pagamento = pagamento3;
    		venda.valorFinal = venda.produto.valorProduto;
    	}	else if (codigoPagamento == 4){
        	venda.pagamento = pagamento4;
    		venda.valorFinal = venda.valorFinal + ((venda.produto.valorProduto *10) /100);
    	}	else if (codigoPagamento > 5){
    		System.out.println("Meio de pagamento não cadastrado");
    	} else {
    		System.out.println("Digitar um código válido");
    	}
    	
    	System.out.println(venda.produto.descricaoProduto + " sendo pago " + venda.pagamento.descricaoPagamento + " custará " + venda.valorFinal + " reais ");

    	
    	
    }
    	
    }
