public class PilhaEstaticaInvertida implements Empilhavel {
	
	private int ponteiroTopo;
	private Object[] dados;
	
	public PilhaEstaticaInvertida() {
		this(10);
	}

	public PilhaEstaticaInvertida(int tamanho) {
		ponteiroTopo = tamanho;
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
		return (ponteiroTopo == dados.length);
	}
	
	public String imprimir(){
		String resultado = "[";
		for(int i = ponteiroTopo; i <= dados.length-1; i++) {
			if (i == dados.length-1) {
				resultado += dados[i];
			}
			else {
				resultado += dados[i]+ " ";
			}
		}
		return resultado+"]";
	}
}