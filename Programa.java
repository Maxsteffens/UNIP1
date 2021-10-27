package controle;

import visao.TelaCadastroPessoa;
import modelo.Pessoa;
import javax.swing.*;

public class Programa implements IOuvinteBotao {
	/// assim a classe implementa o metodo IOuvinteBotao diretamente
	
	public static void main (String[] args) {
		TelaCadastroPessoa tela = new TelaCadastroPessoa (new Programa());
		
		///torna a tela visivel
		tela.setVisible(true);
	}
	/// metodo definido na interface para isso importa pessoa
	
	public void gravaPessoa (Pessoa p) {
		
		/// nesta parte iria o acesso e gravaçao na DB
		/// cria uma tela de dialodo para mostrar a informação
		JOptionPane.showMessageDialog(null, "A pessoa " + p.getNome() + " de Telefone " + p.getTelefone() + " Foi cadastrada.");
	}
 
}

/// progrma finalizado porem sem correçoes de erro de entrada de dados ( faltam metodos correçõ de entrada)
