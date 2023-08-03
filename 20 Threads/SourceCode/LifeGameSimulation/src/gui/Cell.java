package gui;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Cell extends JPanel {

	private static final long serialVersionUID = 1L;
	private int id;
	private Board board;
	private boolean isAlive = false;

	public Cell(final int id, final Board board) {
		this.id = id;
		this.board = board;

		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				setAlive(true);
				Cell.this.board.refreshBoard(id);
			}
		});
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public String toString() {
		return "Cell" + id;
	}
}
