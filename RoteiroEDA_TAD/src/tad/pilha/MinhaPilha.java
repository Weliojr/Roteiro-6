package tad.pilha;

import java.io.IOException;

public class MinhaPilha implements PilhaIF<Integer> {
	
	int tamanho = 10;
	private Integer[] meusDados = null;
	
	Integer notopo = -1;
	public MinhaPilha(int tamanho) {
		meusDados = new Integer[tamanho];
	}
	
	
	@Override
	public void empilhar(Integer item) throws PilhaCheiaException{
		//throw new UnsupportedOperationException("Implementar");
		notopo = notopo + 1;
		if(notopo == tamanho){
			throw new tad.pilha.PilhaCheiaException("Pilha cheia");
		}
		
		this.meusDados[notopo] = item;
        
	}

	@Override
	public Integer desempilhar() throws PilhaVaziaException  {
		//throw new UnsupportedOperationException("Implementar");
		int auxiliar;
        if (isEmpty() == true) {
            throw new tad.pilha.PilhaVaziaException("Pilha vazia");
        } else {
            auxiliar = meusDados[notopo];
            notopo = notopo - 1;
            return auxiliar;
        }
	}

	@Override
	public Integer topo() {
		//throw new UnsupportedOperationException("Implementar");
		if (isEmpty() == false) {
            return this.meusDados[notopo];
        } else {
			return null;
            
        }
	}

	@Override
	public PilhaIF<Integer> multitop(int k) {
		throw new UnsupportedOperationException("Implementar");
		//for(int i=0; i<k;i++){
			
	//		return desempilhar();
//		}
	}

	@Override
	public boolean isEmpty() {
		//throw new UnsupportedOperationException("Implementar");
		if (notopo == -1) {
            return true;
        } else {
            return false;
        }
	}


}
