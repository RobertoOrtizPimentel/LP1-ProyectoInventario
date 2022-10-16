package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class DlgReporteDelProducto extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgReporteDelProducto frame = new DlgReporteDelProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DlgReporteDelProducto() {
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setTitle("Reporte | Reporte del producto");
		setBounds(100, 100, 647, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Código");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodigo.setBounds(10, 11, 70, 43);
		contentPane.add(lblCodigo);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.setBounds(512, 23, 109, 21);
		contentPane.add(btnReporte);
		
		JComboBox<String> cboCodigo = new JComboBox <String> ();
		cboCodigo.setModel(new DefaultComboBoxModel <String> (new String[] {"Producto A", "Producto B", "Producto C", "Producto D", "Producto E"}));
		cboCodigo.setBounds(66, 23, 188, 21);
		contentPane.add(cboCodigo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 65, 613, 341);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
}
