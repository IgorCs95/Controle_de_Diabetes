package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

import com.jtattoo.plaf.fast.FastLookAndFeel;

import controller.Control;
import model.Pessoa;
import view.utils.JtextFieldSomenteNumeros;

public class Home extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 928741288749725301L;

	public Home() {
	}

	private JPanel contentPane;
	private JtextFieldSomenteNumeros txtCorrida;
	private JtextFieldSomenteNumeros txtCarb;
	private JtextFieldSomenteNumeros txtNatacao;
	private JtextFieldSomenteNumeros txtBike;
	private JtextFieldSomenteNumeros txtPedal;
	private JtextFieldSomenteNumeros txtTenis;
	private JtextFieldSomenteNumeros txtVoleiPraia;
	private JtextFieldSomenteNumeros txtAtividade;
	private JtextFieldSomenteNumeros txtMusculacao;
	private JtextFieldSomenteNumeros txtEliptco;
	
	private JtextFieldSomenteNumeros txtcaminhada;
	private JtextFieldSomenteNumeros txtsono;
	private JtextFieldSomenteNumeros txtpilates;
	
	
	JLabel resultado = new JLabel("");
	
	JButton btLimpar = new JButton("Limpar");
	JButton btCalcular = new JButton("Calcular");
	
	public static void main(String args[]) {  
	     try {  
	       //Configura o logo String dos JMenu's  
	       Properties props = new Properties();  
	       props.put("logoString", "Seu Nome");  
	       FastLookAndFeel.setCurrentTheme(props);  
	       //Configura o Look que deseja usar da Biblioteca JTattoo  
	       UIManager.setLookAndFeel(new FastLookAndFeel());  
	       //Chama a interface do seu programa  
	       new Home().janela();
	     } catch (Exception erro) {  
	       erro.printStackTrace();  
	     }  
	   } 
	
	
	public JLabel addLabel(String nome) {
		JLabel result = new JLabel(nome);
		result.setHorizontalAlignment(SwingConstants.RIGHT);
		result.setFont(new Font("Tahoma", Font.BOLD, 17));
		return result;
	}

	
	public void janela() {
		ouvintes();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 582);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblControleDeDiabetes = new JLabel("Controle de Diabetes");
		lblControleDeDiabetes.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblControleDeDiabetes.setHorizontalAlignment(SwingConstants.CENTER);
		lblControleDeDiabetes.setBounds(10, 11, 290, 52);
		contentPane.add(lblControleDeDiabetes);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(100, 100,0)));
		panel.setBounds(10, 74, 300, 355);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 10, 5));
		
		JLabel lblEliptico = addLabel("Eliptco: ");
		panel.add(lblEliptico);
		
		txtEliptco = new JtextFieldSomenteNumeros();
		panel.add(txtEliptco);
		txtEliptco.setColumns(10);
		
		JLabel lblCorrida = addLabel("Corrida: ");
		panel.add(lblCorrida);
		
		txtCorrida = new JtextFieldSomenteNumeros();
		panel.add(txtCorrida);
		txtCorrida.setColumns(10);
		
		JLabel lblNewLabel = addLabel("Carboidratos: ");
		panel.add(lblNewLabel);
		
		txtCarb = new JtextFieldSomenteNumeros();
		panel.add(txtCarb);
		txtCarb.setColumns(10);
		
		JLabel lblNatao = addLabel("Natação: ");
		panel.add(lblNatao);
		
		txtNatacao = new JtextFieldSomenteNumeros();
		panel.add(txtNatacao);
		txtNatacao.setColumns(10);
		
		JLabel lblBike =addLabel("Bike: ");
		panel.add(lblBike);
		
		txtBike = new JtextFieldSomenteNumeros();
		panel.add(txtBike);
		txtBike.setColumns(10);
		
		JLabel lblPedal =addLabel("Pedal: ");
		panel.add(lblPedal);
		
		txtPedal = new JtextFieldSomenteNumeros();
		panel.add(txtPedal);
		txtPedal.setColumns(10);
		
		JLabel lblTenis =addLabel("Tenis: ");
		panel.add(lblTenis);
		
		txtTenis = new JtextFieldSomenteNumeros();
		panel.add(txtTenis);
		txtTenis.setColumns(10);
		
		JLabel lblVoleiDePraia =addLabel("Volei de Praia: ");
		panel.add(lblVoleiDePraia);
		
		txtVoleiPraia = new JtextFieldSomenteNumeros();
		panel.add(txtVoleiPraia);
		txtVoleiPraia.setColumns(10);
		
		JLabel lblAtividade =addLabel("Atividade: ");
		panel.add(lblAtividade);
		
		txtAtividade = new JtextFieldSomenteNumeros();
		panel.add(txtAtividade);
		txtAtividade.setColumns(10);
		
		JLabel lblMusculao =addLabel("Musculação: ");
		panel.add(lblMusculao);
		
		txtMusculacao = new JtextFieldSomenteNumeros();
		panel.add(txtMusculacao);
		txtMusculacao.setColumns(10);
		
		
		JLabel lblsono =addLabel("Sono: ");
		panel.add(lblsono);
		
		txtsono = new JtextFieldSomenteNumeros();
		panel.add(txtsono);
		txtsono.setColumns(10);
		
		JLabel lblpilates =addLabel("Pilates: ");
		panel.add(lblpilates);
		
		txtpilates = new JtextFieldSomenteNumeros();
		panel.add(txtpilates);
		txtpilates.setColumns(10);
		
		JLabel lblcaminhada =addLabel("Caminhada: ");
		panel.add(lblcaminhada);
		
		txtcaminhada = new JtextFieldSomenteNumeros();
		panel.add(txtcaminhada);
		txtcaminhada.setColumns(10);
		
		
		
		
		JLabel lbresultado = new JLabel("Resultado:");
		lbresultado.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lbresultado.setForeground(Color.BLACK);
		lbresultado.setBounds(10, 440, 91, 35);
		contentPane.add(lbresultado);
		
		
		resultado.setForeground(Color.RED);
		resultado.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		resultado.setBounds(111, 440, 199, 35);
		contentPane.add(resultado);
		
		
		
		btLimpar.setBounds(10, 513, 113, 29);
		contentPane.add(btLimpar);
		
		
		btCalcular.setBounds(197, 513, 113, 29);
		contentPane.add(btCalcular);
		
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	
	
	public void ouvintes(){
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa a = new Pessoa();
				a.setCorrida(txtCorrida.recuperarInteiro());
				a.setEliptco(txtEliptco.recuperarInteiro());
				a.setCarb(txtCarb.recuperarInteiro());
				a.setNatacao(txtNatacao.recuperarInteiro());
				a.setBike(txtBike.recuperarInteiro());
				a.setPedal(txtPedal.recuperarInteiro());
				a.setTenis(txtTenis.recuperarInteiro());
				a.setVoleiAreia(txtVoleiPraia.recuperarInteiro());
				a.setAtividade(txtAtividade.recuperarInteiro());
				a.setMusculacao(txtMusculacao.recuperarInteiro());
				
				a.setCaminhada(txtcaminhada.recuperarInteiro());
				a.setPilates(txtpilates.recuperarInteiro());
				a.setSono(txtsono.recuperarInteiro());
				
				Control c = new Control();
				
				resultado.setText(c.calcular(a));
				
				contentPane.repaint();
				
				
			}
		});;
		
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCorrida.limpar();
				txtEliptco.limpar();
				txtCarb.limpar();
				txtNatacao.limpar();
				txtBike.limpar();
				txtPedal.limpar();
				txtTenis.limpar();
				txtVoleiPraia.limpar();
				txtAtividade.limpar();
				txtMusculacao.limpar();
				txtcaminhada.limpar();
				txtpilates.limpar();
				txtsono.limpar();
				
				
				resultado.setText("");
				
				contentPane.repaint();
				
				
			}
		});;
		
	}

}
