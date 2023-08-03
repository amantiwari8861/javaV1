package com.minerapp.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import com.minerapp.constants.Constants;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;
	private Cell[] cells;
	private int numberOfMines;

	public Board() {
		initializeClass();
		setLayout(new GridLayout(Constants.BOARD_ROWS, Constants.BOARD_COLUMNS));
		initializeBoard();
	}

	public synchronized void incrementBombNumber() {
		this.numberOfMines++;
	}

	public synchronized void decrementBombNumber() {
		this.numberOfMines--;
	}

	private void initializeBoard() {
		for (int i = 0; i < Constants.BOARD_COLUMNS * Constants.BOARD_ROWS; i++) {

			cells[i] = new Cell(i + 1);
			add(cells[i]);

			int row = (i / Constants.BOARD_ROWS) % 2;

			if (row == 0) {
				cells[i].setBackground(i % 2 == 0 ? Color.GRAY : Color.WHITE);
			} else {
				cells[i].setBackground(i % 2 == 0 ? Color.WHITE : Color.GRAY);
			}
		}
	}

	private void initializeClass() {
		this.cells = new Cell[Constants.BOARD_ROWS * Constants.BOARD_COLUMNS];
		this.numberOfMines = 0;
	}

	public void setMine(int index){
		cells[index].lock();
		incrementBombNumber();
		cells[index].setBackground(Color.RED);
		cells[index].unlock();
		
		sleepThread(500);
	}
	
	public void sweepMine(int index){
		
		cells[index].lock();
		decrementBombNumber();
		
		int row = (index / Constants.BOARD_ROWS ) % 2;
		
		if( row == 0 ){
			cells[index].setBackground(index%2==0 ? Color.GRAY : Color.WHITE);
		}else{
			cells[index].setBackground(index%2==0 ? Color.WHITE : Color.GRAY);
		}
		
		cells[index].unlock();
		
		sleepThread(500);
		
	}
	
	public void clearBoard(){
		for (int i = 0; i < Constants.BOARD_COLUMNS * Constants.BOARD_ROWS; i++) {

			int row = (i / Constants.BOARD_ROWS) % 2;

			if (row == 0) {
				cells[i].setBackground(i % 2 == 0 ? Color.GRAY : Color.WHITE);
			} else {
				cells[i].setBackground(i % 2 == 0 ? Color.WHITE : Color.GRAY);
			}
		}
	}

	private void sleepThread(int duration) {
		try{
			Thread.sleep(duration);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public int getNumberOfMines(){
		return this.numberOfMines;
	}
}
