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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class View extends JFrame {

	private JPanel contentPane;
	private boolean pnlCotacao = false;
	private JPanel panelCotacao = new JPanel();
	private JPanel panelSolicitacao = new JPanel();
	private boolean pnlSolicitacao = false;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 650);
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(48).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panelSolicitacao, GroupLayout.PREFERRED_SIZE, 571,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnGerarSolicitao, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												566, Short.MAX_VALUE)
										.addComponent(panelCotacao, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
								.addGap(38)))));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
										.addComponent(btnNewButton).addGap(18)
										.addComponent(panelCotacao, GroupLayout.PREFERRED_SIZE, 246,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnGerarSolicitao)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(panelSolicitacao,
												GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(91, Short.MAX_VALUE)));
		panelSolicitacao.setVisible(false);
		panelSolicitacao.setLayout(null);

		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigo.setBounds(10, 24, 96, 14);
		panelSolicitacao.add(lblCdigo);

		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFornecedor.setBounds(10, 49, 96, 14);
		panelSolicitacao.add(lblFornecedor);

		JLabel lblProduto_1 = new JLabel("Produto");
		lblProduto_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduto_1.setBounds(10, 74, 96, 14);
		panelSolicitacao.add(lblProduto_1);

		JLabel lblQuantidade_1 = new JLabel("Quantidade");
		lblQuantidade_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantidade_1.setBounds(10, 99, 96, 14);
		panelSolicitacao.add(lblQuantidade_1);

		JLabel lblValorUnitrio = new JLabel("Valor unit\u00E1rio");
		lblValorUnitrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorUnitrio.setBounds(10, 124, 96, 14);
		panelSolicitacao.add(lblValorUnitrio);

		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValorTotal.setBounds(10, 152, 96, 14);
		panelSolicitacao.add(lblValorTotal);
		panelCotacao.setLayout(null);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(48, 32, 46, 14);
		panelCotacao.add(lblProduto);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 29, 180, 20);
		panelCotacao.add(comboBox);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(48, 68, 72, 14);
		panelCotacao.add(lblQuantidade);

		textField = new JTextField();
		textField.setBounds(127, 65, 180, 20);
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
		panelCotacao.setVisible(false);
		contentPane.setLayout(gl_contentPane);
	}
}
