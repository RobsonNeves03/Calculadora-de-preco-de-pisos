import javax.swing.JOptionPane;

public class Piso {
	public static void main(String args []){
		double tamanho = 0;
		double pisos = 0;
		double val = 0;
		double desc = 0;
		double qpiso = 0;
		double resultf = 0;
		//variáveis
		
		piso(tamanho, pisos, val, desc, qpiso, resultf);
	}
	public static void piso(double tamanho, double pisos, double val, double desc, double qpiso, double resultf) {
		tamanho = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da superfície em m²: "));
		pisos = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho dos pisos em m²: "));
		val = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos pisos: "));
		//pede os valores
		
		qpiso = (tamanho/pisos);
		//calcula a quantidade necessária de pisos
		
		resultf = (qpiso*val);
		//preço dos pisos no total
		
		if(qpiso > 100) {
			desc = (resultf*0.1);
			resultf = (resultf-desc);
			System.out.println("Será necessário: " + qpiso + " pisos");
			System.out.println("O valor total (+10% de desconto) será de: R$" + resultf);
		}
		else {
			System.out.println("Será necessário: " + qpiso + " pisos");
			System.out.println("O valor total será de: R$" + resultf);
		}
		//confere se aplica ou não o desconto de acordo com a quantidade de pisos
		
	}
}
