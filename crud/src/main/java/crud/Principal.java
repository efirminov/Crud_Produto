package crud;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		String controle = "-1";
		
		String opcoes = "1 - Cadastrar \n 2 - Editar \n 3 - Excluir \n 4 - Consultar \n 0 - Sair";
		controle = JOptionPane.showInputDialog(opcoes);
		
		switch (controle) {
		case "1":
			Produto p = new Produto();
			
			p.setDescricao(JOptionPane.showInputDialog("Informe a descriçao: "));
			p.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe a descriçao: ")));
			
			System.out.println(p.toString());
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso ...");
			break;
		case "2":
			int idProduto = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do produto: "));
			
			String produto = JOptionPane.showInputDialog("Informe a descrição", "Feijão Carioquinha");
			JOptionPane.showMessageDialog(null, "Editando ...");
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Excluindo ...");
			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Consultando ...");
			break;
		case "0":
			JOptionPane.showMessageDialog(null, "Obrigado e volte sempre ...");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida ...");
			break;
		}
	}
}
