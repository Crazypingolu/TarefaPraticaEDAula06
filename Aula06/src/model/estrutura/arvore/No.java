package model.estrutura.arvore;
public class No<T> {
	private T valor;
	private No<T> maior;
	private No<T> menor;
	private No<T> raiz;
	private int balanceamento;
	
	public No(T valor){
		this.maior = null;
		this.menor = null;
		this.raiz = null;
		this.balanceamento = 0;
		this.valor = valor;
	}
	
	public T getValor(){
		return valor;
	}
	
	public void setValor(T newValor){
		valor = newValor;
	}
	
	public No<T> getMaior(){
		return maior;
	}
	
	public void setMaior(No<T> newMaior){
		maior = newMaior;
	}
	
	public No<T> getMenor(){
		return menor;
	}

	public void setMenor(No<T> newMenor){
		menor = newMenor;
	}
	
	public No<T> getRaiz(){
		return raiz;
	}
	
	public void setRaiz(No<T> newRaiz){
		raiz = newRaiz;
	}
	
	public int getBalanceamento(){
		return balanceamento;
	}
	
	public void setBalanceamento(int newBalanceamento){
		balanceamento = newBalanceamento;
	}
	
	@Override
	public String toString(){
		return valor.toString();
	}
}