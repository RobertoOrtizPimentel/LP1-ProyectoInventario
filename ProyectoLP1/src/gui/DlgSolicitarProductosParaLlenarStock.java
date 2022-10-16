package gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgSolicitarProductosParaLlenarStock extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigoProducto;
	private JButton btnInformativo;
	private JButton btnAgregar;
	private JComboBox<String> cboCodigo;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JLabel lblFecha;
	private JTextField txtFecha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgSolicitarProductosParaLlenarStock frame = new DlgSolicitarProductosParaLlenarStock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgSolicitarProductosParaLlenarStock() {
		setTitle("Transacción | Solicitar productos para llenar stock");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigoProducto = new JLabel("Codigo de producto");
		lblCodigoProducto.setBounds(62, 12, 124, 21);
		contentPane.add(lblCodigoProducto);
		
		btnInformativo = new JButton("I");
		btnInformativo.addActionListener(this);
		btnInformativo.setBounds(10, 11, 37, 23);
		contentPane.add(btnInformativo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(390, 11, 88, 21);
		contentPane.add(btnAgregar);
		
		cboCodigo = new JComboBox<String>();
		cboCodigo.setBounds(174, 11, 107, 23);
		contentPane.add(cboCodigo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 57, 59, 21);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(79, 57, 107, 21);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(235, 60, 46, 14);
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(291, 57, 107, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInformativo) {
			actionPerformedBtnInformativo(e);
		}
	}
	protected void actionPerformedBtnInformativo(ActionEvent e) {
	}
}