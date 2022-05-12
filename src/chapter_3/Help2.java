package chapter_3;

public class Help2 {
	public static void main(String[] args) throws java.io.IOException {
		char choice;
		char ignore;
		
		do {
			System.out.println("Справка:");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while\n");
			System.out.print("Выберите: ");
			
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
			
		} while (choice < '1' | choice > '5');
		
		switch (choice) {
			case '1':
				System.out.println("инструкция if:\n");
				System.out.println("if (условие) инструкция");
				System.out.println("else инструкция");
				break;
			case '2':
				System.out.println("инструкция switch:\n");
				System.out.println("switch (выражение) {");
				System.out.println(" case константа:");
				System.out.println("  последовательность инструкций");
				System.out.println("  break;");
				System.out.println("  // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("цикл for:\n");
				System.out.println("for  (инициализация; условие; итерация)");
				System.out.println(" инструкция;");
				break;
			case '4':
				System.out.println("цикл while:\n");
				System.out.println("while (условие) инструкция");
				break;
			case '5':
				System.out.println("цикл do-while:\n");
				System.out.println("do {");
				System.out.println(" инструкция;");
				System.out.println("} while (условие)");
				break;
		}
	}
}
