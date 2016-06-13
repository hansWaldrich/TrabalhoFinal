package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add extends View {

	private JPanel contentPane;
	private JTextField textFieldFornecedor;
	private JTextField textFieldValorUnitario;
	private JTextField textFieldValorTotal;
	private JTextField textFieldPrazo;
	private JButton btnOk;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		setTitle("Adicionar Cota\u00E7\u00E3o Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldFornecedor = new JTextField();
		textFieldFornecedor.setBounds(142, 25, 236, 20);
		contentPane.add(textFieldFornecedor);
		textFieldFornecedor.setColumns(10);
		
		JLabel lblNomeFornecedor = new JLabel("Nome Fornecedor");
		lblNomeFornecedor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFornecedor.setBounds(10, 28, 122, 14);
		contentPane.add(lblNomeFornecedor);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unit\u00E1rio");
		lblValorUnitrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorUnitrio.setBounds(10, 70, 122, 14);
		contentPane.add(lblValorUnitrio);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorTotal.setBounds(10, 112, 122, 14);
		contentPane.add(lblValorTotal);
		
		JLabel lblPrazo = new JLabel("Prazo");
		lblPrazo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrazo.setBounds(10, 154, 122, 14);
		contentPane.add(lblPrazo);
		
		textFieldValorUnitario = new JTextField();
		textFieldValorUnitario.setBounds(142, 67, 236, 20);
		contentPane.add(textFieldValorUnitario);
		textFieldValorUnitario.setColumns(10);
		
		textFieldValorUnitario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textFieldValorUnitario.getText() != null || !textFieldValorUnitario.getText().equals("")) {
					//int qtdProd = Integer.parseInt(textFieldQtd.getText()); alterar esta função.
					int vlrUnit = Integer.parseInt(textFieldValorUnitario.getText());
					//textFieldValorTotal.setText(String.valueOf((qtdProd*vlrUnit)));
				}
				
			}
		});
		
		textFieldValorTotal = new JTextField();
		textFieldValorTotal.setEnabled(false);
		textFieldValorTotal.setBounds(142, 109, 236, 20);
		contentPane.add(textFieldValorTotal);
		textFieldValorTotal.setColumns(10);
		
		textFieldPrazo = new JTextField();
		textFieldPrazo.setBounds(142, 151, 236, 20);
		contentPane.add(textFieldPrazo);
		textFieldPrazo.setColumns(10);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {												
				setVisible(false);
			}
		});
		btnOk.setBounds(152, 182, 89, 23);
		contentPane.add(btnOk);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				setVisible(false);
			}
		});
		btnCancelar.setBounds(251, 182, 89, 23);
		contentPane.add(btnCancelar);
	}

}
