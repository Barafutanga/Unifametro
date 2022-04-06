package activities.teacher.lista_ligada;
public class Programa {

	public static void main(String[] args) {
		ListaLigada<Double> lista = new ListaLigada<>();
		lista.adicionar(12.22);
		lista.adicionar(21.1);
		lista.adicionar(33.0);
		lista.adicionar(55.32);
		lista.adicionar(67.87);
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro: "+ lista.getPrimeiro().getValor());
		System.out.println("Último: " + lista.getUltimo().getValor());
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}

}
