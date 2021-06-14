package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BiodataDiri {

	private JFrame frame;
	private JTextField nama1;
	private JTextField ttl1;
	private JTextField jk1;
	private JTextField email1;
	private JTextField alamat1;
	private JTextField nim1;
	
	ArrayList<DataDiri> Biodata = new ArrayList<DataDiri>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BiodataDiri window = new BiodataDiri();
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
	public BiodataDiri() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIODATA DIRI");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(245, 11, 248, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Nama_1 = new JLabel("Nama :");
		Nama_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Nama_1.setBounds(10, 93, 46, 14);
		frame.getContentPane().add(Nama_1);
		
		JLabel TTL_1 = new JLabel("TTL :");
		TTL_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		TTL_1.setBounds(10, 118, 46, 14);
		frame.getContentPane().add(TTL_1);
		
		JLabel JK_1 = new JLabel("JenisKelamin :");
		JK_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		JK_1.setBounds(10, 149, 90, 14);
		frame.getContentPane().add(JK_1);
		
		JLabel Agama_1 = new JLabel("Agama :");
		Agama_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Agama_1.setBounds(10, 181, 46, 14);
		frame.getContentPane().add(Agama_1);
		
		JLabel Email_1 = new JLabel("Email :");
		Email_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Email_1.setBounds(10, 214, 46, 14);
		frame.getContentPane().add(Email_1);
		
		JLabel Alamat_1 = new JLabel("Alamat :");
		Alamat_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Alamat_1.setBounds(10, 245, 46, 14);
		frame.getContentPane().add(Alamat_1);
		
		JLabel Prodi_1 = new JLabel("Prodi :");
		Prodi_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Prodi_1.setBounds(10, 277, 46, 14);
		frame.getContentPane().add(Prodi_1);
		
		nama1 = new JTextField();
		nama1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		nama1.setBackground(new Color(216, 191, 216));
		nama1.setBounds(130, 88, 180, 20);
		frame.getContentPane().add(nama1);
		nama1.setColumns(10);
		
		ttl1 = new JTextField();
		ttl1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ttl1.setBackground(new Color(255, 192, 203));
		ttl1.setBounds(130, 115, 180, 20);
		frame.getContentPane().add(ttl1);
		ttl1.setColumns(10);
		
		jk1 = new JTextField();
		jk1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		jk1.setBackground(new Color(255, 228, 196));
		jk1.setBounds(130, 146, 180, 20);
		frame.getContentPane().add(jk1);
		jk1.setColumns(10);
		
		JComboBox agama1 = new JComboBox();
		agama1.setModel(new DefaultComboBoxModel(new String[] {"-- Pilih --", "Islam", "Katolik", "Pretestan", "Buddha", "Hindu", "Konghucu"}));
		agama1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		agama1.setBounds(130, 177, 180, 22);
		frame.getContentPane().add(agama1);
		
		JLabel Nim_1 = new JLabel("NIM :");
		Nim_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Nim_1.setBounds(10, 309, 46, 14);
		frame.getContentPane().add(Nim_1);
		
		email1 = new JTextField();
		email1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		email1.setBackground(new Color(240, 230, 140));
		email1.setBounds(130, 211, 180, 20);
		frame.getContentPane().add(email1);
		email1.setColumns(10);
		
		alamat1 = new JTextField();
		alamat1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		alamat1.setBackground(new Color(127, 255, 212));
		alamat1.setBounds(130, 242, 180, 20);
		frame.getContentPane().add(alamat1);
		alamat1.setColumns(10);
		
		JComboBox prodi1 = new JComboBox();
		prodi1.setModel(new DefaultComboBoxModel(new String[] {"-- Pilih --", "Teknik Mesin", "Statistika", "Ilmu Tanah", "Peternakan", "Sistem Informasi", "Ilmu Politik", "Kehutanan", "Manajemen", "Rekayasa Sistem Komputer", "Pendidikan Bimbingan dan Konseling", "Ilmu Administrasi ", "Teknik Informatika", "Pertanian", "Ilmu Pemerintahan", "Hukum"}));
		prodi1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		prodi1.setBounds(130, 273, 180, 22);
		frame.getContentPane().add(prodi1);
		
		nim1 = new JTextField();
		nim1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		nim1.setBackground(new Color(255, 140, 0));
		nim1.setBounds(130, 306, 180, 20);
		frame.getContentPane().add(nim1);
		nim1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 14));
		textArea.setBackground(new Color(219, 112, 147));
		textArea.setBounds(257, 355, 395, 145);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("SHOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nama = nama1.getText();
				String TTL = ttl1.getText();
				String JenisKelamin = jk1.getText();
				String Agama = (String) agama1.getSelectedItem();
				String Email = email1.getText();
				String Alamat = alamat1.getText();
				String Prodi = (String) prodi1.getSelectedItem();
				String NIM = nim1.getText();
				Biodata.add(new DataDiri(Nama, TTL, JenisKelamin, Agama, Email, Alamat, Prodi, NIM)); {
					textArea.setText("Nama\t:"+Nama+"\nTTL\t:"+TTL+"\nJenisKelamin\t:"+JenisKelamin+"\nAgama\t:"+Agama+"\nEmail\t:"+Email+"\nAlamat\t:"+Alamat+"\nProdi\t:"+Prodi+"\nNIM\t:"+NIM);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(104, 373, 102, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nama = " " ;
				String TTL = " " ;
				String JenisKelamin = " " ;
				String Agama = " " ;
				String Email = " " ;
				String Alamat = " " ;
				String Prodi = " " ;
				String NIM = " " ;
				textArea.setText(Nama + " " + TTL + " " + JenisKelamin + " " + Agama + " " + Email + " " + Alamat + " " + Prodi + " " + NIM + " ");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(104, 414, 102, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit (0);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBounds(104, 448, 102, 23);
		frame.getContentPane().add(btnNewButton_2);
		
	}
}
