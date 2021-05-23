package com.example.demo.service;

import com.example.demo.model.Player;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class PlayerService {

    private List<Player> players = new ArrayList<>();

    public PlayerService() {
        players.add(new Player(1, "Arvydas Sabonis", 39, 25000));
        players.add(new Player(2, "Robertas Javtokas", 41, 53000));
        players.add(new Player(3, "Dainius Salenga", 32, 13000));
        players.add(new Player(4, "Mindaugas Lukauskis", 22, 9000));
        players.add(new Player(5, "Gintaras Einikis", 19, 46000));
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
