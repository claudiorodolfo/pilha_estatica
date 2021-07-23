public class PilhaEstaticaInvertida implements Empilhavel {
	
	private int ponteiroTopo;
	private Object[] dados;
	private int tamanho;
	
	public PilhaEstaticaInvertida() {
		this(10);
	}

	public PilhaEstaticaInvertida(int tamanho) {
		ponteiroTopo = tamanho;
		this.tamanho = tamanho;
		dados = new Object[tamanho];
	}
	
	public void empilhar(Object elemento) {
		if(!estaCheia()) {
			ponteiroTopo--;
			dados[ponteiroTopo] = elemento;
		} else {
			System.out.println("Pilha Cheia");
		}
	}
	
	public Object desempilhar() {
		Object elementoTopo = null;
		if(!estaVazia()) {
			elementoTopo = dados[ponteiroTopo]; 
			ponteiroTopo++;
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;
	}
	
	public Object topo() {
		Object elementoTopo = null;
		if(!estaVazia()) {
			elementoTopo = dados[ponteiroTopo]; 
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;	
	}
	
	public boolean estaCheia() {
		return (ponteiroTopo == 0);
	}
	
	public boolean estaVazia(){
		return (ponteiroTopo == tamanho);
	}
	
	public String imprimir(){
		String resultado = "[";
		for(int i = tamanho-1; i>=ponteiroTopo;i--) {
			resultado += dados[i]+ " ";
		}
		return resultado+"]";
	}
}