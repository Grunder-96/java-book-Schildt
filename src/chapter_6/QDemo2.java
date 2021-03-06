package chapter_6;

class Queue1 {
	char[] q;
	int putloc;
	int getloc;
	
	Queue1(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	Queue1(Queue1 ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		for (int i = getloc; i < putloc; i++) {
			q[i] = ob.q[i];
		}
	}
	
	Queue1(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for (int i = 0; i < a.length; i++) {
			put(a[i]);
		}
	}
	
	// помещение символа в очередь
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println( " - очередь заполнена");
			return;
		}
		q[putloc++] = ch;
	}
	
	// помещение символа в очередь
	char get() {
		if (getloc == putloc) {
			System.out.println( " - очередь пуста");
			return (char) 0;
		}
		
		return q[getloc++];
		
	}
}

public class QDemo2 {
	public static void main(String[] args) {
		Queue1 q1 = new Queue1(10);
		
		char[] name = {'T', 'O', 'M'};
		Queue1 q2 = new Queue1(name);
		char ch;
		int i;
		
		for (i = 0; i < 10; i++) {
			q1.put((char) ('A' + i));
		}
		
		Queue1 q3 = new Queue1(q1);
		
		System.out.print("Содержимое q1: ");
		for (i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Содержимое q2: ");
		for (i = 0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Содержимое q3: ");
		for (i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
}
