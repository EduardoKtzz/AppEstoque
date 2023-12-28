package principal;

import java.util.Locale;
import java.util.Scanner;

import Classes.principal;

public class aplicação {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PERGUNTAS PARA DEFINIR AS VARIAVEIS

		System.out.println("Coloque os dados do produto abaixo: ");
		System.out.println("Nome do produto: ");
		String name = sc.nextLine();

		System.out.println("Preço do produto: ");
		Double preco = sc.nextDouble();

		System.out.println("Quantas unidades em estoque: ");
		int unidades = sc.nextInt();

		//CONSTRUTOR

		principal produtos = new principal(name, preco, unidades);

		//RESULTADO DOS DADOS EM ESTOQUE

		System.out.println("Produto em estoque: " + produtos.getName() + ", $" + produtos.getPreco() + ", " + produtos.getUnidades() + " Unidades, Valor Total: " + produtos.valorTotal());

		//ADICIONAR PRODUTOS EM ESTOQUE

		System.out.println();
		System.out.println("Você deseja adicionar produtos em estoque?(1/0)");
		int pergunta = sc.nextInt();

		if (pergunta >= 1) {

			System.out.println("Digite o número de produtos a adicionar em estoque: ");
			int quantidade = sc.nextInt();
			produtos.adicionarProduto(quantidade);
			System.out.println("Dados atualizados: " + produtos.getName() + ", $" + produtos.getPreco() + ", " + produtos.getUnidades() + " Unidades, Valor Total: " + produtos.valorTotal());
		} else {
			System.out.println("Prossiga com a próxima operação");
		}


		//REMOVER PRODUTOS EM ESTOQUE

		System.out.println();
		System.out.println("Você deseja remover produtos em estoque?(1/0)");
		int pergunta2 = sc.nextInt();

		if (pergunta2 >= 1) {

			System.out.println("Digite o número de produtos a remover do estoque: ");
			int retirados = sc.nextInt();
			produtos.removerProduto(retirados);
			System.out.println("Dados atualizados: " + produtos.getName() + ", $" + produtos.getPreco() + ", " + produtos.getUnidades() + " Unidades, Valor Total: " + produtos.valorTotal());

		} else {
			System.out.println("Confira os dados antes de fechar o programa!");
		}

	
		sc.close();

	}
}
