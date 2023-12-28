package Classes;

public class principal {

	//VARIAVEIS
	
	private String name;
	private double preco;
	private int unidades;

	//CONSTRUTOR

	public principal(String name, double preco, int unidades) {
		this.name = name;
		this.preco = preco;
		this.unidades = unidades;

	}

	//ENCAPSULAMENTO

	public String getName() {
		return name;
	}

	public double getPreco() {
		return preco;
	}

	public int getUnidades() {
		return unidades;
	}

	//METODO PARA CALCULAR O VALOR TOTAL

	public double valorTotal() {
		return unidades * preco;
	}

	//METODO PARA ADCIONAR MAIS PRODUTOS NO ESTOQUE

	public void adicionarProduto(int unidades) {
		this.unidades += unidades;
	}

	//METODO PARA REMOVER PRODUTOS DO ESTOQUE

	public void removerProduto(int unidades) {
		this.unidades -= unidades;
	}




	






}
