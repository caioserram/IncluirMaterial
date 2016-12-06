package visão;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import modelo.Gerente;
import modelo.Material;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JEditorPane;

public class MenuInicial {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtprecoUnitario;
	private final Action action = new SwingAction();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuInicial window = new MenuInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setAction(action);
		btnConfirmar.setBounds(280, 398, 98, 26);
		frame.getContentPane().add(btnConfirmar);
		
		JPanel panel = new JPanel();
		panel.setBounds(136, 26, 421, 329);
		frame.getContentPane().add(panel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 12, 383, 30);
		
		txtNome = new JTextField();
		txtNome.setBounds(12, 42, 383, 30);
		txtNome.setColumns(10);
		
		JLabel lblPrecoUnitario = new JLabel("Pre\u00E7o Unit\u00E1rio");
		lblPrecoUnitario.setBounds(12, 74, 383, 30);
		
		txtprecoUnitario = new JTextField();
		txtprecoUnitario.setBounds(12, 106, 383, 30);
		txtprecoUnitario.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(12, 136, 383, 30);
		
		panel.setLayout(null);
		panel.add(lblNome);
		panel.add(txtNome);
		panel.add(lblPrecoUnitario);
		panel.add(txtprecoUnitario);
		panel.add(lblDescricao);
		
		textField = new JTextField();
		textField.setBounds(12, 178, 397, 139);
		panel.add(textField);
		textField.setColumns(10);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String pacote = txtNome +","+ txtprecoUnitario + "," + textField;
			Gerente.insereMaterial(pacote);
		}
	}
}
