package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controle.IOuvinteBotao; //// Adicionado para IOuvinteBotao poder ser acessado 
import modelo.Pessoa;			//// Adicionado para Pessoa poder ser acessado	
public class TelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	
	private JTextField txtNome;
	private JTextField txtTelefone;
	
	private IOuvinteBotao ouvinteBotao;
	
	
	/**
	 * Launch the application.
	 */
	
	//// Trecho comentado pelo professor
	
	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}/*
	

	/**
	 * Create the frame.
	 */
	
	
	////------------construtor sem parametros criado pela UI--- 
	private TelaCadastroPessoa() { // alterado para privado e definir um proprio condtrutor isso para impedir acesso indevido
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setText("Nome");
		txtNome.setBounds(182, 24, 207, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setText("Telefone");
		txtTelefone.setBounds(182, 56, 207, 19);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(94, 58, 70, 15);
		contentPane.add(lblTelefone);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(94, 26, 70, 15);
		contentPane.add(lblNome);
		
		JButton btnCadastra = new JButton("Cadastra");
		/// este metodo foi criado apos clicar duas vezes no botao! no window builder
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/// toda a logica do envio de dados do botao poderia estar aqui dentro
				/// mas ela esta no metodo cadastra() la em baixo por isso a chamada do metodo aqui na sequencia
				cadastra();
			}
		});
		
		btnCadastra.setBounds(212, 112, 117, 25);
		contentPane.add(btnCadastra);
	
	}
	
	///contrutor proprio 
	public TelaCadastroPessoa(IOuvinteBotao ouvinteBotao) {
		this(); /// serve para pegar o construtor da UI local por isso a refercia vazia 
		this.ouvinteBotao = ouvinteBotao; /// atribuição do metodo local para IOuvinteBotao
		
	}
	/// novo metodo construtor para pegar os dados que estao na tela e enviar para a casse Pessoa
	private void cadastra() {
		String nome = txtNome.getText();
		// pega o que foi escrito em txtNome e grava  dentro variavel nome
		int telefone = Integer.parseInt(txtTelefone.getText()); 
		// pega o que foi escrito em txtTelefone e converte para int dentro variavel telefone (gera erro se colocar caracters)
		Pessoa p  = new Pessoa (nome, telefone);
		// grava as variaves de dentro de Pessoa p
		ouvinteBotao.gravaPessoa(p);
		// chamei o meto de outraclasse que grava no "bando de dados" que nao foi definido
		
		
	}
}
/**
 		Agora iremos criar a nova classe programa em < controle.Programa> 
	
		*/
	