package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX04;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX04 m = new TarefaEd3EX04();
		String binario;
		int num = 0;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para ser convertido em binario"));
		
		
		
		binario = m.Ex04(num, "");
		System.out.println(binario);
	}
}