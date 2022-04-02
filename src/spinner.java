import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class spinner extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					spinner frame = new spinner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	int r,g,b,x,y,width,height;
	public spinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(155, 137, 369, 334);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("");
		button.setBounds(140, 140, 65, 65);
		panel.add(button);
		
		JSpinner widthSpinner = new JSpinner();
		widthSpinner.setModel(new SpinnerNumberModel(65, 0, 250, 5));
		widthSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		widthSpinner.setBounds(212, 11, 92, 36);
		contentPane.add(widthSpinner);
		
		JLabel widthLbl = new JLabel("Width:");
		widthLbl.setForeground(Color.WHITE);
		widthLbl.setBackground(Color.WHITE);
		widthLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		widthLbl.setBounds(121, 11, 81, 36);
		contentPane.add(widthLbl);
		
		JLabel heightLbl = new JLabel("Height:");
		heightLbl.setForeground(Color.WHITE);
		heightLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		heightLbl.setBounds(121, 65, 81, 36);
		contentPane.add(heightLbl);
		
		JSpinner heightSpinner = new JSpinner();
		heightSpinner.setModel(new SpinnerNumberModel(65, 0, 250, 5));
		heightSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		heightSpinner.setBounds(212, 65, 92, 36);
		contentPane.add(heightSpinner);
		
		JLabel xLbl = new JLabel("X-Duzlemi:");
		xLbl.setForeground(Color.WHITE);
		xLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		xLbl.setBounds(341, 11, 96, 36);
		contentPane.add(xLbl);
		
		JLabel yLbl = new JLabel("Y-Duzlemi");
		yLbl.setForeground(Color.WHITE);
		yLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		yLbl.setBounds(341, 65, 96, 36);
		contentPane.add(yLbl);
		
		JSpinner xSpinner = new JSpinner();
		xSpinner.setModel(new SpinnerNumberModel(140, 0, 250, 5));
		xSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		xSpinner.setBounds(447, 11, 92, 36);
		contentPane.add(xSpinner);
		
		JSpinner ySpinner = new JSpinner();
		ySpinner.setModel(new SpinnerNumberModel(140, 0, 250, 5));
		ySpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ySpinner.setBounds(447, 65, 92, 36);
		contentPane.add(ySpinner);
		
		JLabel redLbl = new JLabel("RED:");
		redLbl.setForeground(Color.WHITE);
		redLbl.setHorizontalAlignment(SwingConstants.CENTER);
		redLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		redLbl.setBounds(165, 489, 81, 36);
		contentPane.add(redLbl);
		
		JLabel greenLbl = new JLabel("GREEN:");
		greenLbl.setForeground(Color.WHITE);
		greenLbl.setHorizontalAlignment(SwingConstants.CENTER);
		greenLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		greenLbl.setBounds(300, 489, 81, 36);
		contentPane.add(greenLbl);
		
		JLabel blueLbl = new JLabel("BLUE:");
		blueLbl.setForeground(Color.WHITE);
		blueLbl.setHorizontalAlignment(SwingConstants.CENTER);
		blueLbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		blueLbl.setBounds(432, 489, 81, 36);
		contentPane.add(blueLbl);
		
		JSpinner redSpinner = new JSpinner();
		redSpinner.setBackground(Color.RED);
		redSpinner.setModel(new SpinnerNumberModel(240, 0, 255, 5));
		redSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		redSpinner.setBounds(154, 536, 92, 36);
		contentPane.add(redSpinner);
		
		JSpinner greenSpinner = new JSpinner();
		greenSpinner.setBackground(Color.GREEN);
		greenSpinner.setModel(new SpinnerNumberModel(240, 0, 255, 5));
		greenSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		greenSpinner.setBounds(300, 536, 92, 36);
		contentPane.add(greenSpinner);
		
		JSpinner blueSpinner = new JSpinner();
		blueSpinner.setBackground(Color.BLUE);
		blueSpinner.setModel(new SpinnerNumberModel(240, 0, 255, 5));
		blueSpinner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		blueSpinner.setBounds(432, 536, 92, 36);
		contentPane.add(blueSpinner);
		
		JLabel lblNewLabel = new JLabel("MUSTAFA ERCAN");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(212, 594, 268, 44);
		contentPane.add(lblNewLabel);
		
		
		
		// EVENTLER
		width = height = 65;
		x=y=140;
		r=g=b=240;
		widthSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				width = (int) widthSpinner.getValue();
				button.setBounds(x, y, width, height);
			}
		});
		
		heightSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				height = (int) heightSpinner.getValue();
				button.setBounds(x, y, width, height);
			}
		});
		
		xSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				x = (int) xSpinner.getValue();
				button.setBounds(x, y, width, height);
			}
		});
		
		ySpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				y = (int) ySpinner.getValue();
				button.setBounds(x, y, width, height);
			}
		});
		
		
		redSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r = (int) redSpinner.getValue();
				button.setBackground(new Color(r,g,b));
			}
		});
		
		greenSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				g = (int) greenSpinner.getValue();
				button.setBackground(new Color(r,g,b));
			}
		});
		
		blueSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				b = (int) blueSpinner.getValue();
				button.setBackground(new Color(r,g,b));
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
