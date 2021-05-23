package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/") // localhost:1111/api/kazkoksEndpointas
public class PlayerController {

    @Autowired //Sios anotacijos pagalba springas runtime metu priskiria sitam fieldui atitinkama instance (new)
    private PlayerService playerService;

    Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @GetMapping("/players")
    public List<Player> getPlayers() {
        logger.info("[PlayerController] fetching all players.");
        return playerService.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        logger.info("[PlayerController] Player added successfully!");
        return player;
    }

}
