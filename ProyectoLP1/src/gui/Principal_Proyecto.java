package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Principal_Proyecto extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenu mnConsulta;
	private JMenu mnTransaccion;
	private JMenu mnReporte;
	private JMenuItem mntmProducto;
	private JMenuItem mntmTecnico;
	private JMenuItem mntmProveedor;
	private JMenuItem mntmConsultarProducto;
	private JMenuItem mntmSolicitarProductosParaLlenarStock;
	private JMenuItem mntmDarDeBajaProductosEnMalEstado;
	private JMenuItem mntmReporteDelProducto;
	private JDesktopPane escritorio;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_Proyecto frame = new Principal_Proyecto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal_Proyecto() {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} catch (Exception e){ 
			
		}
		setTitle("Gestión de inventario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 40);
		contentPane.add(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Archivo.png")));
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Salir.png")));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Mantenimiento.png")));
		menuBar.add(mnMantenimiento);
		
		mntmProducto = new JMenuItem("Producto");
		mntmProducto.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Producto.png")));
		mntmProducto.addActionListener(this);
		mnMantenimiento.add(mntmProducto);
		
		mntmTecnico = new JMenuItem("Técnico");
		mntmTecnico.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Tecnico.png")));
		mntmTecnico.addActionListener(this);
		mnMantenimiento.add(mntmTecnico);
		
		mntmProveedor = new JMenuItem("Proveedor");
		mntmProveedor.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Proveedor.png")));
		mntmProveedor.addActionListener(this);
		mnMantenimiento.add(mntmProveedor);
		
		mnConsulta = new JMenu("Consulta");
		mnConsulta.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Consulta.png")));
		menuBar.add(mnConsulta);
		
		mntmConsultarProducto = new JMenuItem("Consultar producto");
		mntmConsultarProducto.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/ConsultarProducto.png")));
		mntmConsultarProducto.addActionListener(this);
		mnConsulta.add(mntmConsultarProducto);
		
		mnTransaccion = new JMenu("Transacción");
		mnTransaccion.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Transaccion.png")));
		menuBar.add(mnTransaccion);
		
		mntmSolicitarProductosParaLlenarStock = new JMenuItem("Solicitar productos para llenar stock");
		mntmSolicitarProductosParaLlenarStock.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/LlenarStock.png")));
		mntmSolicitarProductosParaLlenarStock.addActionListener(this);
		mnTransaccion.add(mntmSolicitarProductosParaLlenarStock);
		
		mntmDarDeBajaProductosEnMalEstado = new JMenuItem("Dar de baja productos en mal estado");
		mntmDarDeBajaProductosEnMalEstado.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/BajaProductos.png")));
		mntmDarDeBajaProductosEnMalEstado.addActionListener(this);
		mnTransaccion.add(mntmDarDeBajaProductosEnMalEstado);
		
		mnReporte = new JMenu("Reporte");
		mnReporte.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/Reporte.png")));
		menuBar.add(mnReporte);
		
		mntmReporteDelProducto = new JMenuItem("Reporte del producto");
		mntmReporteDelProducto.setIcon(new ImageIcon(Principal_Proyecto.class.getResource("/imagenes/ReporteProductos.png")));
		mntmReporteDelProducto.addActionListener(this);
		mnReporte.add(mntmReporteDelProducto);
		
		escritorio = new JDesktopPane();
		escritorio.setBounds(0, 39, 684, 522);
		contentPane.add(escritorio);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmReporteDelProducto) {
			actionPerformedMntmReporteDelProducto(e);
		}
		if (e.getSource() == mntmDarDeBajaProductosEnMalEstado) {
			actionPerformedMntmDarDeBajaProductosEnMalEstado(e);
		}
		if (e.getSource() == mntmSolicitarProductosParaLlenarStock) {
			actionPerformedMntmSolicitarProductosParaLlenarStock(e);
		}
		if (e.getSource() == mntmConsultarProducto) {
			actionPerformedMntmConsultarProducto(e);
		}
		if (e.getSource() == mntmProveedor) {
			actionPerformedMntmProveedor(e);
		}
		if (e.getSource() == mntmTecnico) {
			actionPerformedMntmTecnico(e);
		}
		if (e.getSource() == mntmProducto) {
			actionPerformedMntmProducto(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmProducto(ActionEvent e) {
		DlgProducto dp = new DlgProducto();
		 dp.setVisible(true);
		 //dp.setLocationRelativeTo(this);
		 escritorio.add(dp);
	}
	protected void actionPerformedMntmTecnico(ActionEvent e) {
		DlgTecnico dt = new DlgTecnico();
		 dt.setVisible(true);
		 //dt.setLocationRelativeTo(this);
		 escritorio.add(dt);
	}
	protected void actionPerformedMntmProveedor(ActionEvent e) {
		DlgProveedor dpr = new DlgProveedor();
		 dpr.setVisible(true);
		 //dpr.setLocationRelativeTo(this);
		 escritorio.add(dpr);
	}
	protected void actionPerformedMntmConsultarProducto(ActionEvent e) {
		DlgConsultarProducto dc = new DlgConsultarProducto();
		 dc.setVisible(true);
		 //dc.setLocationRelativeTo(this);
		 escritorio.add(dc);
	}
	protected void actionPerformedMntmSolicitarProductosParaLlenarStock(ActionEvent e) {
		DlgSolicitarProductosParaLlenarStock ds = new DlgSolicitarProductosParaLlenarStock();
		 ds.setVisible(true);
		 //ds.setLocationRelativeTo(this);
		 escritorio.add(ds);
	}
	protected void actionPerformedMntmDarDeBajaProductosEnMalEstado(ActionEvent e) {
		DlgDarDeBajaProductosEnMalEstado dd = new DlgDarDeBajaProductosEnMalEstado();
		 dd.setVisible(true);
		 //dd.setLocationRelativeTo(this);
		 escritorio.add(dd);
	}
	protected void actionPerformedMntmReporteDelProducto(ActionEvent e) {
		DlgReporteDelProducto dr = new DlgReporteDelProducto();
		 dr.setVisible(true);
		 //dr.setLocationRelativeTo(this);
		 escritorio.add(dr);
	}
}
