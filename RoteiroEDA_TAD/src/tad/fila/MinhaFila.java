package tad.fila;

/**
 * Fila deve ser implementada com array fixo e estratégia circular
 * de gerenciamento de apontadores de cauda e cabeça.
 * @author fabioleite
 *
 */
public class MinhaFila implements FilaIF<Integer> {
	
	private int tamanho = 10;
	
	private int cauda = 1;
	private int cabeca = 0;
	
	private Integer[] meusDados = null;

	public MinhaFila(int tamanho){
		meusDados = new Integer[tamanho];
	}
	

	@Override
	public void enfileirar(Integer item) throws FilaCheiaException {
		//throw new UnsupportedOperationException("Implementar");
		if(isEmpty() == true){
			this.meusDados[cabeca] = item;
		}else{
			if(isFull() ==true){
				throw new tad.fila.FilaCheiaException();
			}
			this.meusDados[cauda] = item;
			cauda = cauda+1;

		}
	}

	@Override
	public Integer desenfileirar() {
		if(isEmpty()==true){
			cabeca = cabeca +1;
		}
		return this.meusDados[cabeca];
		//throw new UnsupportedOperationException("Implementar");
	}

	@Override
	public Integer verificarCauda()throws FilaVaziaException  {
		//throw new UnsupportedOperationException("Implementar");
		if(isEmpty() == true){
			throw new tad.fila.FilaVaziaException("Vazio");
		}else{
			return meusDados[cauda];
		}
		
	}

	@Override
	public Integer verificarCabeca() throws FilaVaziaException{
		//throw new UnsupportedOperationException("Implementar");
		if(isEmpty()==true){
			throw new tad.fila.FilaVaziaException();
		}
		return this.meusDados[cabeca];
	}

	@Override
	public boolean isEmpty() {
		//throw new UnsupportedOperationException("Implementar");
		if(meusDados ==null){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean isFull() {
		//throw new UnsupportedOperationException("Implementar");
		if(meusDados.length == tamanho-1){
			return true;
		}else{
			return false;
		}
	}

}
