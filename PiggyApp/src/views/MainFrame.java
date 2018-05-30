package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import models.User;

public class MainFrame extends JFrame {

	private static final String APP_TITLE = "Piggy - App";
	private static final String ICON = "/icon_image/piggy-bank.png";
	private static final long serialVersionUID = 1L;
	private JPanel pnMain;
	private PanelLogin panelLogin;
	private PanelSignUp panelSignUp;
	private PanelUserProfile panelUserProfile;

	public MainFrame(ActionListener actionListener) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 680);
		setResizable(false);
		setLocationRelativeTo(this);
		setIconImage(new ImageIcon(getClass().getResource(ICON)).getImage());
		setTitle(APP_TITLE);
		getContentPane().setBackground(Color.WHITE);

		panelLogin = new PanelLogin(actionListener);
		panelSignUp = new PanelSignUp(actionListener);
		panelUserProfile = new PanelUserProfile();
		pnMain = panelLogin;

		add(pnMain, BorderLayout.CENTER);

		setVisible(true);
	}

	public JPanel changePanel(JPanel panel) {
		remove(pnMain);
		pnMain = panel;
		add(pnMain, BorderLayout.CENTER);
		getContentPane().revalidate();
		getContentPane().repaint();
		return panel;
	}

	public JPanel getPanelLogin() {
		return panelLogin;
	}

	public JPanel getPanelSignUp() {
		return panelSignUp;
	}

	public JPanel getPanelUserProfile() {
		return panelUserProfile;
	}

	public User getUser() {
		return panelSignUp.getUser();
	}

	public String getUsername() {
		return panelLogin.getUsername();
	}

	public String getPassword() {
		return panelLogin.getPassword();
	}
}