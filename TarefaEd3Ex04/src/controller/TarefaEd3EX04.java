package controller;

public class TarefaEd3EX04 {
	
	public TarefaEd3EX04 () {
		super();
	}
		
	public String Ex04 (int num, String bi){
		if (num < 1 ) {
//			A condição de parada é quando o tamanho < 1, ou seja, quando a divisao do numero já foi feita ate chegar a 0
			
			return bi;
		}
		else {
			if (num % 2 == 1 ) {
				bi = "1" + bi;
			}
			if (num % 2 == 0 ) {
				bi = "0" + bi;
			}
		}
		
		return Ex04 (num / 2, bi);
//		já no restorno não ouve a necessidade de alteração de variavel, uma vez que o numero já esta sendo dividido dentro do metodo

	}
}
