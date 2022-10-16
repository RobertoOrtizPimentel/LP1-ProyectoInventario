package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgProveedor extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblRuc;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtRuc;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JButton btnIngresar;
	private JButton btnAdicionar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JScrollPane scrollPane_1;
	private JTable tblProveedor;
	private JLabel lblCodigo;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgProveedor frame = new DlgProveedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgProveedor() {
		setTitle("Mantenimiento | Proveedor");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 496, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(178, 8, 42, 20);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(338, 8, 60, 20);
		panel.add(lblApellido);
		
		lblRuc = new JLabel("N\u00B0 RUC");
		lblRuc.setBounds(338, 39, 60, 20);
		panel.add(lblRuc);
		
		lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(178, 39, 50, 20);
		panel.add(lblTelefono);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 41, 50, 17);
		panel.add(lblCorreo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(240, 8, 88, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(398, 8, 88, 20);
		panel.add(txtApellido);
		
		txtRuc = new JTextField();
		txtRuc.setColumns(10);
		txtRuc.setBounds(398, 39, 88, 20);
		panel.add(txtRuc);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(240, 39, 88, 20);
		panel.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(69, 39, 86, 20);
		panel.add(txtCorreo);
		
		lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setBounds(10, 70, 71, 20);
		panel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(67, 70, 419, 20);
		panel.add(txtDireccion);
		
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 11, 46, 14);
		panel.add(lblCodigo);
		
		lblNewLabel = new JLabel("Autogenerado");
		lblNewLabel.setBounds(69, 11, 74, 14);
		panel.add(lblNewLabel);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(666, 70, 96, 27);
		contentPane.add(btnIngresar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(666, 24, 96, 27);
		contentPane.add(btnAdicionar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(546, 70, 96, 27);
		contentPane.add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(546, 24, 96, 27);
		contentPane.add(btnEliminar);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 123, 752, 278);
		contentPane.add(scrollPane_1);
		
		tblProveedor = new JTable();
		scrollPane_1.setViewportView(tblProveedor);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
	}
}