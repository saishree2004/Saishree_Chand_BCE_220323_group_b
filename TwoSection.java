package myLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.security.DomainCombiner;

public class TwoSection extends Frame {
	public TwoSection() {
		Frame frame = new Frame("two section");
		frame.setLayout(new BorderLayout());

		MenuBar mb = new MenuBar();

		Menu menu = new Menu("File");
		Menu subMenu = new Menu("More");
		Menu editMenu = new Menu("Edit");
		Menu search = new Menu("Search");
		Menu referenceSub = new Menu("References");

		MenuItem item1 = new MenuItem("New");
		MenuItem item2 = new MenuItem("Open");
		MenuItem item5 = new MenuItem("Save");
		MenuItem item6 = new MenuItem("Save As");
		MenuItem item3 = new MenuItem("Clear Cache");
		MenuItem item4 = new MenuItem("Restore Default");

		MenuItem item7 = new MenuItem("Undo");
		MenuItem item8 = new MenuItem("Redo Typing");

		MenuItem item9 = new MenuItem("Search...");
		MenuItem item10 = new MenuItem("File...");
		MenuItem item11 = new MenuItem("Java...");
		MenuItem item12 = new MenuItem("Text");
		MenuItem item14 = new MenuItem("Declarations");

		MenuItem item15 = new MenuItem("Reference 2");
		MenuItem item16 = new MenuItem("Reference 3");

		MenuItem item20 = new MenuItem("Exit");

		item20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		subMenu.add(item3);
		subMenu.add(item4);

		menu.add(item1);
		menu.add(item2);
		menu.add(item5);


		menu.add(subMenu);

		menu.add(item20);

		mb.add(menu);
		mb.add(search);
		mb.add(editMenu);

		editMenu.add(item6);
		editMenu.add(item7);
		editMenu.add(item3);
		editMenu.add(item4);
		
		search.add(referenceSub);
		
		referenceSub.add(item15);
		referenceSub.add(item16);

		menu.addSeparator();

		referenceSub.add(item15);
		referenceSub.add(item16);

		frame.setMenuBar(mb);

		Panel leftPanel = new Panel();
		leftPanel.setSize(200, 400);
		leftPanel.setBackground(Color.GRAY);

		Button btnLeft = new Button("left");
		
		leftPanel.add(btnLeft);
		leftPanel.setPreferredSize(new Dimension(200, 400));
		
		frame.add(leftPanel, BorderLayout.WEST);

		Panel rightPanel = new Panel();
		rightPanel.setSize(200, 400);
		rightPanel.setBackground(Color.WHITE);

		Label label = new Label("right");
		rightPanel.add(label);

		rightPanel.setPreferredSize(new Dimension(200, 400));
		frame.add(rightPanel, BorderLayout.CENTER);

		
		
		btnLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("hello");
				rightPanel.setBackground(Color.ORANGE);
				leftPanel.setBackground(Color.RED);

			}
		});
		frame.setSize(400, 400);
		frame.setVisible(true);

		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void main(String[] args) {
		new TwoSection();
	}

}
