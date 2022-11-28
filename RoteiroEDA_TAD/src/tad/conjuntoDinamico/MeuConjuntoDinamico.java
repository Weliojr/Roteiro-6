package tad.conjuntoDinamico;


public class MeuConjuntoDinamico implements ConjuntoDinamicoIF<Integer>{

	
	private Integer[] meusDados = null;
	private int posInsercao = 0;
	public void iniciar(){
		meusDados = new Integer[0];
	}
	
	@Override
	public void inserir(Integer item) {
		//throw new UnsupportedOperationException("Implementar");
		aumentarArray();
		meusDados[posInsercao] = item;
		posInsercao = posInsercao+1;
		
	}
	
	private Integer[] aumentarArray() {
		// criar um array maior (arrayMaior)
		// Qual é a taxa de aumento desse array?
		// copiar os dados de meusDados (array cheio)
		// colar os dados para o novo array (arrayMaior)
		int tamanho = 1;
		if((meusDados.length+1)>=posInsercao){
			Integer copy[] = meusDados.clone(); 
			meusDados = new Integer[tamanho];
			for(int i=0; i<copy.length;i++){
				meusDados[i] = copy[i];
			}
			tamanho = tamanho *2;
		}
		return null;
	}

	@Override
	public Integer remover(Integer item) {
		//throw new UnsupportedOperationException("Implementar");
		int aux =0;
		aux = meusDados[posInsercao];
		posInsercao = posInsercao -1;
		return aux;
		
	}

	@Override
	public Integer predecessor(Integer item) {
		//throw new UnsupportedOperationException("Implementar");
		return meusDados[item -1];

	}

	@Override
	public Integer sucessor(Integer item) {
		//throw new UnsupportedOperationException("Implementar");
		return meusDados[item +1];
	}

	@Override
	public int tamanho() {
		//throw new UnsupportedOperationException("Implementar");
		return meusDados.length;
	}

	@Override
	public Integer buscar(Integer item) {
		//throw new UnsupportedOperationException("Implementar");
		int  aux=0;
		for (int i = 1; i < meusDados.length; i++) {
            if(meusDados[i] == item){
				aux = meusDados[i];
			}
        }
		return aux;
		

	}

	@Override
	public Integer minimum() {
		//throw new UnsupportedOperationException("Implementar");
		for (int i = 1; i < meusDados.length; i++) {
            int pivo = meusDados[i];
            int j = i - 1;
            while (j >= 0 && meusDados[j] > pivo) {
               // vetor0[j+1] = vetor0[j];
               // vetor2[j+1] = vetor2[j];
                meusDados[j+1] = meusDados[j];
               // vetor3[j+1] = vetor3[j];
                j = j - 1;
            }
        	meusDados[j + 1] = pivo;
        }
		return meusDados[0];
	}

	@Override
	public Integer maximum() {
		//throw new UnsupportedOperationException("Implementar");
		for (int i = 1; i < meusDados.length; i++) {
            int pivo = meusDados[i];
            int j = i - 1;
            while (j >= 0 && meusDados[j] < pivo) {
               // vetor0[j+1] = vetor0[j];
               // vetor2[j+1] = vetor2[j];
                meusDados[j+1] = meusDados[j];
               // vetor3[j+1] = vetor3[j];
                j = j - 1;
            }
        	meusDados[j + 1] = pivo;
        }
		return meusDados[0];
	}

}
