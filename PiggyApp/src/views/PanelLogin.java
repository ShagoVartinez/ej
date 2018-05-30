package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.Actions;

public class PanelLogin extends JPanel {

	private static final String PASSWORD = "Password";
	private static final String USERNAME = "Username";
	private static final String FONT = "Ebrima";
	private static final Font FONT_GET_INFO_LABEL = new Font(FONT, 4, 18);
	private static final Color BACKGROUN_COLOR_SELECTION = Color.decode("#98DFFE");
	private static final Color BACKGROUND_COLOR_SEPARATOR = new Color(0, 0, 0, 0);
	private static final Color BACKGROUD_COLOR_PANEL = Color.decode("#e64354");
	private static final long serialVersionUID = 1L;
	private JTextField textFieldUsername;
	private JPasswordField textFieldPassword;

	public PanelLogin(ActionListener actionListener) {
		setBackground(BACKGROUD_COLOR_PANEL);
		setLayout(new BorderLayout());

		JPanel pnTop = new JPanel();
		pnTop.setOpaque(false);
		pnTop.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
		pnTop.setLayout(new BorderLayout());
		JLabel lbTitle = new JLabel("PIGGY", SwingConstants.CENTER);
		lbTitle.setForeground(Color.WHITE);
		lbTitle.setFont(new Font("Arial", Font.PLAIN, 30));
		pnTop.add(lbTitle, BorderLayout.CENTER);
		add(pnTop, BorderLayout.PAGE_START);

		JPanel pnCenter = new JPanel();
		pnCenter.setOpaque(false);
		pnCenter.setLayout(new GridLayout(2, 1));
		pnCenter.setBorder(BorderFactory.createEmptyBorder(70, 50, 10, 50));

		JPanel panelUsername = new JPanel();
		panelUsername.setLayout(new GridLayout(3, 1));
		panelUsername.setBackground(BACKGROUD_COLOR_PANEL);
		JLabel labelUsername = new JLabel(USERNAME);
		labelUsername.setForeground(Color.WHITE);
		labelUsername.setFont(FONT_GET_INFO_LABEL);
		panelUsername.add(labelUsername);
		textFieldUsername = new JTextField();
		textFieldUsername.setBackground(BACKGROUD_COLOR_PANEL);
		textFieldUsername.setForeground(Color.WHITE);
		textFieldUsername.setSelectedTextColor(Color.WHITE);
		textFieldUsername.setSelectionColor(BACKGROUN_COLOR_SELECTION);
		textFieldUsername.setCaretColor(Color.WHITE);
		textFieldUsername.setFont(new Font("Arial", 4, 15));
		textFieldUsername.setBorder(null);
		panelUsername.add(textFieldUsername);
		JSeparator separatorUsername = new JSeparator();
		separatorUsername.setBackground(BACKGROUND_COLOR_SEPARATOR);
		separatorUsername.setForeground(Color.WHITE);
		panelUsername.add(separatorUsername);
		pnCenter.add(panelUsername);

		JPanel panelPassword = new JPanel();
		panelPassword.setLayout(new GridLayout(3, 1));
		panelPassword.setBackground(BACKGROUD_COLOR_PANEL);
		JLabel labelPassword = new JLabel(PASSWORD);
		labelPassword.setForeground(Color.WHITE);
		labelPassword.setFont(FONT_GET_INFO_LABEL);
		panelPassword.add(labelPassword);
		textFieldPassword = new JPasswordField();
		textFieldPassword.setBackground(BACKGROUD_COLOR_PANEL);
		textFieldPassword.setForeground(Color.WHITE);
		textFieldPassword.setSelectionColor(BACKGROUN_COLOR_SELECTION);
		textFieldPassword.setSelectedTextColor(Color.WHITE);
		textFieldPassword.setCaretColor(Color.WHITE);
		textFieldPassword.setBorder(null);
		panelPassword.add(textFieldPassword);
		JSeparator separatorPassword = new JSeparator();
		separatorPassword.setBackground(BACKGROUND_COLOR_SEPARATOR);
		separatorPassword.setForeground(Color.WHITE);
		panelPassword.add(separatorPassword);
		pnCenter.add(panelPassword);

		add(pnCenter, BorderLayout.CENTER);

		JPanel pnBot = new JPanel();
		pnBot.setOpaque(false);
		pnBot.setBorder(BorderFactory.createEmptyBorder(80, 0, 80, 0));
		pnBot.setLayout(new BorderLayout());
		JPanel pnButtonLogin = new JPanel();
		pnButtonLogin.setOpaque(false);
		JButton btnLogin = new JButton("Login");
		btnLogin.setFocusable(false);
		btnLogin.setBackground(Color.decode("#00c166"));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(actionListener);
		btnLogin.setActionCommand(Actions.LOGIN.toString());
		pnButtonLogin.add(btnLogin);
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFocusable(false);
		btnSignUp.setBackground(Color.decode("#00a0c1"));
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.addActionListener(actionListener);
		btnSignUp.setActionCommand(Actions.SIGN_UP.toString());
		pnButtonLogin.add(btnSignUp);
		pnBot.add(pnButtonLogin, BorderLayout.PAGE_END);
		add(pnBot, BorderLayout.PAGE_END);
	}

	public String getUsername() {
		return textFieldUsername.getText();
	}

	public String getPassword() {
		return String.valueOf(textFieldPassword.getPassword());
	}
}