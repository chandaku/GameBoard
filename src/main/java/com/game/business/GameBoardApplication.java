package com.game.business;

import com.game.business.model.GameBoard;
import com.game.business.model.PlayerCell;
import com.game.business.model.bank.Bank;
import com.game.business.model.cell.Cell;
import com.game.business.model.cell.CellType;
import com.game.business.transaction.TransactionClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.game.business.model.cell.Cell.createCell;
import static com.game.business.model.player.Player.createPlayer;

@SpringBootApplication
public class GameBoardApplication {

	public static void main(String[] args) {
		Bank bank = Bank.createBank(1, 5000);
		GameBoard gameBoard = GameBoard.create(10);
		List<PlayerCell> players = createPlayerCell(gameBoard.getStart());
		for(int i=0; i<5 ; i++){
			players.stream()
					.forEach(playerCell -> {
						Random random = new Random(3);
						random.nextInt();
						gameBoard.dice(random.nextInt(), playerCell);
						TransactionClient.getTransaction(playerCell).calculate(bank, playerCell.getPlayer());
					});
		}

	}

	private static List<PlayerCell> createPlayerCell(Cell start) {
		 return  new ArrayList() {
			 {
				 add(new PlayerCell(start,createPlayer(1, 1000)));
				 add(new PlayerCell(start,createPlayer(2, 1000)));
				 add(new PlayerCell(start,createPlayer(3, 1000)));

			 }
		 };
	}


	private static void creatGameCells(GameBoard gameBoard) {
		gameBoard.addCell(createCell(1, CellType.START));
		gameBoard.addCell(createCell(2, CellType.LOTTERY));
		gameBoard.addCell(createCell(3, CellType.HOTEL));
		gameBoard.addCell(createCell(4, CellType.JAIL));
		gameBoard.addCell(createCell(5, CellType.LOTTERY));
		gameBoard.addCell(createCell(6, CellType.JAIL));
		gameBoard.addCell(createCell(7, CellType.HOTEL));
		gameBoard.addCell(createCell(8, CellType.EMPTY));
		gameBoard.addCell(createCell(9, CellType.EMPTY));
		gameBoard.addCell(createCell(10, CellType.EMPTY));
	}
}
