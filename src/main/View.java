package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class View extends JFrame {

	private JPanel contentPane;
	private boolean pnlCotacao = false;
	private JPanel panelCotacao = new JPanel();
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
		setBounds(100, 100, 678, 500);
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
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
					.addContainerGap(129, Short.MAX_VALUE))
		);
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
