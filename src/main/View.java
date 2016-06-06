package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;

import com.sun.org.apache.bcel.internal.generic.LALOAD;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class View extends JFrame {

	private JPanel contentPane;	
	private JPanel panelCotacao = new JPanel();
	private JPanel panelSolicitacao = new JPanel();
	private JPanel panelAprovacao = new JPanel();
	JPanel panelPedidos = new JPanel();
	private boolean pnlAprovacao = false;
	private boolean pnlSolicitacao = false;
	private boolean pnlCotacao = false;
	private boolean pnlPedidos = false;
	private JTextField textField;
	private JLabel lblObs = new JLabel("Material Cirúrgico");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setTitle("Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 970);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Gerar Cota\u00E7\u00E3o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (pnlCotacao == false)
					pnlCotacao = true;
				else
					pnlCotacao = false;

				panelCotacao.setVisible(pnlCotacao);
			}
		});

		panelCotacao.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cota\u00E7\u00E3o",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton btnGerarSolicitao = new JButton("Gerar Solicita\u00E7\u00E3o");
		btnGerarSolicitao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pnlSolicitacao == false)
					pnlSolicitacao = true;
				else
					pnlSolicitacao = false;

				panelSolicitacao.setVisible(pnlSolicitacao);
			}
		});

		panelSolicitacao.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Solicita\u00E7\u00E3o",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnNewButton_1 = new JButton("Gerar Aprova\u00E7\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pnlAprovacao == false)
					pnlAprovacao = true;
				else
					pnlAprovacao = false;

				panelAprovacao.setVisible(pnlAprovacao);
			}
		});
		
		
		panelAprovacao.setBorder(new TitledBorder(null, "Aprova\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnNewButton_2 = new JButton("Gerar Pedido");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pnlPedidos == false)
					pnlPedidos = true;
				else
					pnlPedidos = false;

				panelPedidos.setVisible(pnlPedidos);
			}
		});
				
		panelPedidos.setBorder(new TitledBorder(null, "Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelPedidos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(panelAprovacao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(panelSolicitacao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(btnGerarSolicitao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(panelCotacao, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
					.addGap(38))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(panelCotacao, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGerarSolicitao)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelSolicitacao, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelAprovacao, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelPedidos, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panelPedidos.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(30, 31, 509, 84);
		panelPedidos.add(textArea_1);
		panelAprovacao.setLayout(null);
		panelAprovacao.setVisible(false);
		panelPedidos.setVisible(false);
		
		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSetor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSetor.setBounds(10, 33, 103, 14);
		panelAprovacao.add(lblSetor);
		
		JLabel lblGestor = new JLabel("Gestor");
		lblGestor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGestor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGestor.setBounds(10, 58, 103, 14);
		panelAprovacao.add(lblGestor);
		
		JLabel lblSuperintendente = new JLabel("Superintendente");
		lblSuperintendente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSuperintendente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuperintendente.setBounds(10, 83, 103, 14);
		panelAprovacao.add(lblSuperintendente);
		
		JLabel lblDiretor = new JLabel("Diretor");
		lblDiretor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiretor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDiretor.setBounds(10, 108, 103, 14);
		panelAprovacao.add(lblDiretor);
		
		JComboBox comboBoxSetor = new JComboBox();
		comboBoxSetor.setBounds(123, 30, 155, 20);
		panelAprovacao.add(comboBoxSetor);
		
		JComboBox comboBoxGestor = new JComboBox();
		comboBoxGestor.setBounds(123, 55, 155, 20);
		panelAprovacao.add(comboBoxGestor);
		
		JComboBox comboBoxSuprimento = new JComboBox();
		comboBoxSuprimento.setBounds(123, 80, 155, 20);
		panelAprovacao.add(comboBoxSuprimento);
		
		JComboBox comboBoxDiretor = new JComboBox();
		comboBoxDiretor.setBounds(123, 105, 155, 20);
		panelAprovacao.add(comboBoxDiretor);
		panelSolicitacao.setVisible(false);
		panelSolicitacao.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigo.setBounds(10, 24, 96, 14);
		panelSolicitacao.add(lblCdigo);

		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFornecedor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFornecedor.setBounds(10, 49, 96, 14);
		panelSolicitacao.add(lblFornecedor);

		JLabel lblProduto_1 = new JLabel("Produto");
		lblProduto_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProduto_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduto_1.setBounds(10, 74, 96, 14);
		panelSolicitacao.add(lblProduto_1);

		JLabel lblQuantidade_1 = new JLabel("Quantidade");
		lblQuantidade_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantidade_1.setBounds(10, 99, 96, 14);
		panelSolicitacao.add(lblQuantidade_1);

		JLabel lblValorUnitrio = new JLabel("Valor unit\u00E1rio");
		lblValorUnitrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorUnitrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorUnitrio.setBounds(10, 124, 96, 14);
		panelSolicitacao.add(lblValorUnitrio);

		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorTotal.setBounds(10, 152, 96, 14);
		panelSolicitacao.add(lblValorTotal);
		panelCotacao.setLayout(null);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(10, 32, 46, 14);
		panelCotacao.add(lblProduto);

		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String item = (String) arg0.getItem();
				System.out.println(item);
				if(item.equals("Material Cirúrgico"))
					lblObs.setText("Comprado por Unidade");
				if(item.equals("Medicamentos "))
					lblObs.setText("Comprado por caixa de 30 comprimidos");
				if(item.equals("Gaze"))
					lblObs.setText("Comprado por caixa de 100 pacotes");
				if(item.equals("Stent"))
					lblObs.setText("Comprado por Unidade");
				if(item.equals("Algodão"))
					lblObs.setText("Comprado por caixa com 50 pacotes – cada um com 5 metros");
				if(item.equals("Copos Plásticos"))
					lblObs.setText("Comprados por cento");
				if(item.equals("Materiais Oncologia"))
					lblObs.setText("Comprados por Unidade");
				if(item.equals("Avental médico"))
					lblObs.setText("Comprados por Dezena");
				if(item.equals("Máscara para uso na Cirurgia")){
					lblObs.setText("Comprados por Dezena");
				}				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Material Cir\u00FArgico", "Medicamentos", "Gaze", "Papel Higi\u00EAnico", "Stent", "Algod\u00E3o", "Copos Pl\u00E1sticos", "Materiais Oncologia", "Avental m\u00E9dico", "M\u00E1scara para uso na Cirurgia"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(82, 29, 180, 20);
		panelCotacao.add(comboBox);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 68, 72, 14);
		panelCotacao.add(lblQuantidade);

		textField = new JTextField();
		textField.setBounds(82, 65, 180, 20);
		panelCotacao.add(textField);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Fornecedores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 104, 546, 131);
		panelCotacao.add(panel);
		panel.setLayout(null);

		JButton btnAdicionarFornecedor = new JButton("Adicionar Fornecedor");
		btnAdicionarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add add = new Add();
				add.setVisible(true);
			}
		});
		btnAdicionarFornecedor.setBounds(10, 25, 159, 23);
		panel.add(btnAdicionarFornecedor);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(86, 59, 450, 61);
		panel.add(textArea);

		JLabel lblCotaes = new JLabel("Cota\u00E7\u00F5es");
		lblCotaes.setBounds(10, 81, 66, 14);
		panel.add(lblCotaes);
		lblObs.setFont(new Font("Tahoma", Font.PLAIN, 10));
				
		lblObs.setBounds(272, 68, 284, 14);
		panelCotacao.add(lblObs);
		panelCotacao.setVisible(false);
		contentPane.setLayout(gl_contentPane);
	}
}
