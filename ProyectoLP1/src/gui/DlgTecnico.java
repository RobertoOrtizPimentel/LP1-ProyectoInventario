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

public class DlgTecnico extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDNI;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTable tblTecnico;
	private JScrollPane scrollPane;
	private JButton btnIngresar;
	private JButton btnAdicionar;
	private JButton btnActualizar;
	private JButton btnEliminar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgTecnico frame = new DlgTecnico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgTecnico() {
		setTitle("Técnico");
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 649, 169);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 60, 20);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 42, 60, 20);
		panel.add(lblApellido);
		
		lblDNI = new JLabel("DNI");
		lblDNI.setBounds(10, 73, 60, 20);
		panel.add(lblDNI);
		
		lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(10, 132, 50, 20);
		panel.add(lblTelefono);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 104, 50, 17);
		panel.add(lblCorreo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(80, 11, 160, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(80, 42, 160, 20);
		panel.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(80, 73, 160, 20);
		panel.add(txtDni);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(80, 132, 160, 20);
		panel.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(80, 102, 160, 20);
		panel.add(txtCorreo);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(543, 10, 96, 23);
		panel.add(btnIngresar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(543, 41, 96, 23);
		panel.add(btnAdicionar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(543, 72, 96, 23);
		panel.add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(543, 101, 96, 23);
		panel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 191, 649, 251);
		contentPane.add(scrollPane);
		
		tblTecnico = new JTable();
		tblTecnico.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "DNI", "Telefono", "Correo"
			}
		));
		scrollPane.setViewportView(tblTecnico);
	}
}