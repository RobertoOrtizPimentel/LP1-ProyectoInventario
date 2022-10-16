package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTable;

public class DlgConsultarProducto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnConsultar;
	private JTable tblProductos;
	private JScrollPane scrollPane;
	DefaultTableModel model = new DefaultTableModel();
	private JButton btnSalir;

	public static void main(String[] args) {
		try {
			DlgConsultarProducto dialog = new DlgConsultarProducto();
			dialog.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DlgConsultarProducto() {
		setTitle("Consulta | Consultar producto");
		setBounds(100, 100, 568, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo del Producto");
		lblCodigo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCodigo.setBounds(10, 10, 135, 32);
		contentPanel.add(lblCodigo);
		
		JComboBox<String> cboCodigo = new JComboBox<String>();
		cboCodigo.setModel(new DefaultComboBoxModel<String>(new String[] {"CP001", "CP002", "CP003", "CP004", "CP005", "CP006", "CP007", "CP008", "CP009", "CP010"}));
		cboCodigo.setBounds(159, 17, 90, 22);
		contentPanel.add(cboCodigo);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(452, 44, 90, 22);
		contentPanel.add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 532, 281);
		contentPanel.add(scrollPane);
		
		tblProductos = new JTable();
		tblProductos.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblProductos);
		
		model.addColumn("Codigo del Producto");
		model.addColumn("Nombre");
		model.addColumn("Estado");
		model.addColumn("Stock Actual");
		
		tblProductos.setModel(model);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(452, 11, 90, 22);
		contentPanel.add(btnSalir);
	}
}