package kr.hs.dgsw.java.c2.tryCatch;

public class MyList {
	
	private Node head;
	
	public void insert(String value) {
		Node node = new Node();
		node.setData(value);
		
		if (head == null) {
			head = node;
		}
		else {
			Node trace = head;
			while (ture) {
				
			}
		}
	}
	
	public String read(int index) {
		return null;
	}
	
	public void delete(int index) {
		
	}
	
	public int length() {
		return 0;
	}
	
	public static void main(String[] args) {
		MyList list = new MyList();
		
		System.out.println("리스트의 길이: " + list.length());   // 0
		
		list.insert("자바");
		list.insert("네트워크");
		list.insert("데이터베이스");
		
		System.out.println("리스트의 길이: " + list.length());   // 3
		
		System.out.println(list.read(1));    // 네트워크
		
		list.delete(2);
		
		System.out.println(list.read(2));    // ArrayIndexOutOfBoundsException 발생
		System.out.println(list.read(-1));   // ArrayIndexOutOfBoundsException 발생
		
	}
}
