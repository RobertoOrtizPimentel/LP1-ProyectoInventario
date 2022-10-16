package gui;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class DlgProducto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblMarca;
	private JLabel lblLote;
	private JLabel lblidProveedor;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField txtLote;
	private JTextField txtIdProveedor;
	private JTable tblProducto;
	private JScrollPane scrollPane;
	private JButton btnIngresar;
	private JButton btnActualizar;
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JLabel lblPrecio;
	private JTextField txtPrecio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgProducto frame = new DlgProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgProducto() {
		setTitle("Mantenimiento | Producto");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 142, 608, 286);
		contentPane.add(scrollPane);
		
		tblProducto = new JTable();
		tblProducto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C\u00F3digo", "Nombre", "Marca", "Lote", "IdProveedor", "Precio"
			}
		));
		scrollPane.setViewportView(tblProducto);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(10, 439, 117, 23);
		contentPane.add(btnIngresar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(336, 439, 117, 23);
		contentPane.add(btnActualizar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(177, 439, 117, 23);
		contentPane.add(btnAdicionar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(501, 439, 117, 23);
		contentPane.add(btnEliminar);
		
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(22, 26, 46, 14);
		contentPane.add(lblCodigo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 66, 46, 14);
		contentPane.add(lblNombre);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(22, 102, 46, 14);
		contentPane.add(lblMarca);
		
		textField = new JTextField();
		textField.setBounds(78, 99, 145, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(78, 63, 145, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(78, 23, 145, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblLote = new JLabel("Lote");
		lblLote.setBounds(313, 26, 95, 14);
		contentPane.add(lblLote);
		
		lblidProveedor = new JLabel("IdProveedor");
		lblidProveedor.setBounds(313, 66, 95, 14);
		contentPane.add(lblidProveedor);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(313, 102, 95, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(418, 99, 136, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtIdProveedor = new JTextField();
		txtIdProveedor.setBounds(418, 63, 136, 20);
		contentPane.add(txtIdProveedor);
		txtIdProveedor.setColumns(10);
		
		txtLote = new JTextField();
		txtLote.setBounds(418, 23, 136, 20);
		contentPane.add(txtLote);
		txtLote.setColumns(10);
	}
}