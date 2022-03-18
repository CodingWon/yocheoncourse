package com.jiwon.c9_0316.game.ui;

import com.jiwon.c9_0316.game.domain.Player;
import com.jiwon.c9_0316.game.domain.Tile;
import com.jiwon.c9_0316.game.service.PlayerService;
import com.jiwon.c9_0316.game.service.TileService;

import java.util.Scanner;

public class GameUI {
    private PlayerService playerService;
    private TileService tileService;
    private Scanner scanner;

    public GameUI(PlayerService playerService, TileService tileService, Scanner scanner) {
        this.playerService = playerService;
        this.tileService = tileService;
        this.scanner = scanner;
    }

    public void play(){
        System.out.println("플레이어의 차례입니다.");
        Player player = playerService.getNextPlayer();

        scanner.nextLine();
        int value = (int)(Math.random()*6)+1;

        int current = player.getCurrent();
        Tile targetTile = tileService.getTile(current + value);
    }
}
