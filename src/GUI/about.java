package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;

public class about extends JDialog {
	private static final long serialVersionUID = 5381052862136001506L;

	public about() {
		setModal(true);
		setResizable(false);
		setTitle("About Project");
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - getHeight()) / 2);
		setBounds(x, y, 516, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setAlwaysOnTop(true);
		getContentPane().setLayout(null);
		JLabel L = new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("about.png")));
		L.setHorizontalAlignment(SwingConstants.CENTER);
		L.setBounds(0, 0, 500, 500);
		getContentPane().add(L);

		JButton gitbtn = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("git.png")));
		gitbtn.setBackground(Color.WHITE);
		gitbtn.setBounds(208, 511, 100, 40);
		getContentPane().add(gitbtn);
		gitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
				if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
					try {
						desktop.browse(new URL("https://github.com/shreyask21/assetmgmt/").toURI());
						dispose();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});

	}

	public void showDialog() {
		this.setVisible(true);
	}

}