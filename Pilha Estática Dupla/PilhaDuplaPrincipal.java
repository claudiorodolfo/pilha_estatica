public class PilhaDuplaPrincipal {
	public static void main(String args[]) {
		EmpilhavelDupla pilha = new PilhaEstaticaDupla();
		pilha.empilhar1("Claudio");
		pilha.empilhar1("Rodolfo");
		pilha.empilhar2("Sousa");
		String conteudo = (String) pilha.desempilhar1();
		System.out.println("Pilha="+pilha.imprimir2());
	}
}