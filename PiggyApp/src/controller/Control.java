package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import models.Manager;
import models.User;
import views.MainFrame;

public class Control implements ActionListener {

	private Manager manager;
	private MainFrame mainFrame;

	public Control() {
		manager = new Manager();
		mainFrame = new MainFrame(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Actions.valueOf(e.getActionCommand())) {
		case LOGIN:
			login();
			break;
		case SIGN_UP:
			signUp();
			break;
		case CREATE_USER:
			createUser();
			break;
		}
	}

	private void login() {
		if (manager.isUserInDataBase(mainFrame.getUsername(), mainFrame.getPassword())) {
			mainFrame.changePanel(mainFrame.getPanelUserProfile());
			try {
				mainFrame.repaint();
				mainFrame.revalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(mainFrame, "Incorrect username or password", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void signUp() {
		mainFrame.changePanel(mainFrame.getPanelSignUp());
	}

	private void createUser() {
		User user = mainFrame.getUser();
		manager.addUser(user);
		JOptionPane.showMessageDialog(mainFrame, "User " + user.getUsername() +  " was created.", "User created", JOptionPane.INFORMATION_MESSAGE);
		mainFrame.changePanel(mainFrame.getPanelLogin());
	}
}