public class PilhaPrincipalInvertida {
	public static void main(String args[]) {
		Empilhavel pilha = new PilhaEstaticaInvertida(5);
		pilha.empilhar("Claudio");
		pilha.empilhar("Rodolfo");
		pilha.empilhar("Sousa");
		String conteudo = (String) pilha.desempilhar();
		System.out.println("Pilha="+pilha.imprimir());
	}
}