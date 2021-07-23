public class PilhaEstaticaDupla implements EmpilhavelDupla {
	
	private int ponteiroTopo1;
	private int ponteiroTopo2;
	private Object[] dados;
	private int tamanho;
	
	public PilhaEstaticaDupla() {
		this(10);
	}

	public PilhaEstaticaDupla(int tamanho) {
		ponteiroTopo1 = -1;
		ponteiroTopo2 = tamanho;
		this.tamanho = tamanho;
		dados = new Object[tamanho];
	}
	
	public void empilhar1(Object elemento) {
		if(!estaCheia1()) {
			ponteiroTopo1++;
			dados[ponteiroTopo1] = elemento;
		} else {
			System.out.println("Pilha Cheia");
		}
	}
	
	public Object desempilhar1() {
		Object elementoTopo = null;
		if(!estaVazia1()) {
			elementoTopo = dados[ponteiroTopo1]; 
			ponteiroTopo1--;
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;
	}
	
	public Object topo1() {
		Object elementoTopo = null;
		if(!estaVazia1()) {
			elementoTopo = dados[ponteiroTopo1]; 
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;	
	}
	
	public boolean estaCheia1() {
		return (ponteiroTopo1 == ponteiroTopo2-1);
	}
	
	public boolean estaVazia1(){
		return (ponteiroTopo1 == -1);
	}
	
	public String imprimir1(){
		String resultado = "[";
		for(int i = 0; i<=ponteiroTopo1;i++) {
			resultado += dados[i]+ " ";
		}
		return resultado+"]";
	}
	
	public void empilhar2(Object elemento) {
		if(!estaCheia2()) {
			ponteiroTopo2--;
			dados[ponteiroTopo2] = elemento;
		} else {
			System.out.println("Pilha Cheia");
		}
	}
	
	public Object desempilhar2() {
		Object elementoTopo = null;
		if(!estaVazia2()) {
			elementoTopo = dados[ponteiroTopo2]; 
			ponteiroTopo2++;
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;
	}
	
	public Object topo2() {
		Object elementoTopo = null;
		if(!estaVazia2()) {
			elementoTopo = dados[ponteiroTopo2]; 
		} else {
			System.out.println("Pilha Vazia");
		}
		return elementoTopo;	
	}
	
	public boolean estaCheia2() {
		return estaCheia1();
	}
	
	public boolean estaVazia2(){
		return (ponteiroTopo2 == tamanho);
	}
	
	public String imprimir2(){
		String resultado = "[";
		for(int i = tamanho-1; i>=ponteiroTopo2;i--) {
			resultado += dados[i]+ " ";
		}
		return resultado+"]";
	}
}