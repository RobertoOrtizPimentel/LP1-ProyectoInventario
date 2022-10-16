package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DlgDarDeBajaProductosEnMalEstado extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnInformativo;
	private JLabel lblCodigo;
	private JComboBox <String> cboCodigo;
	private JButton btnBajaProducto;
	private JTextField txtCantidad;
	private JLabel lblCantidad;
	private JLabel lblFecha;
	private JTextField txtFecha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgDarDeBajaProductosEnMalEstado frame = new DlgDarDeBajaProductosEnMalEstado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgDarDeBajaProductosEnMalEstado() {
		setTitle("Transacción | Baja de productos de almacén");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnInformativo = new JButton("I");
		btnInformativo.setBounds(10, 22, 37, 23);
		contentPane.add(btnInformativo);
		
		lblCodigo = new JLabel("C\u00F3digo del producto");
		lblCodigo.setBounds(59, 22, 130, 23);
		contentPane.add(lblCodigo);
		
		cboCodigo = new JComboBox <String>();
		cboCodigo.setBounds(181, 21, 118, 25);
		contentPane.add(cboCodigo);
		
		btnBajaProducto = new JButton("Baja de producto");
		btnBajaProducto.setBounds(348, 22, 130, 20);
		contentPane.add(btnBajaProducto);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(77, 79, 112, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 82, 57, 17);
		contentPane.add(lblCantidad);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(238, 82, 46, 14);
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(294, 79, 112, 20);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
	}
}