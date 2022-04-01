package activities.linked_list;

public class Program {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(8);
		list.add(99);
		list.add(203);
		list.add(202);
		list.add(102);
		
		System.out.println("Size: " + list.getSize());
		System.out.println("First: " + list.getFirst().getValue());
		System.out.println("Last: " + list.getLast().getValue());

		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i).getValue());
		}
	}

}
