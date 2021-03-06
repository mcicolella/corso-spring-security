package net.emmecilab.players.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.emmecilab.players.model.Player;
import net.emmecilab.players.service.PlayerServiceDB;

@RestController
public class PlayersController {

	@Autowired
	private PlayerServiceDB playerService;

	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}

	@GetMapping("/players/{id}")
	public Player getPlayer(@PathVariable Long id) {
		return playerService.getPlayer(id);
	}

	@PostMapping("/players")
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}

	@PutMapping("/players/{id}")
	public void updatePlayer(@PathVariable Long id, @RequestBody Player player) {
		playerService.updatePlayer(id, player);
	}

	@DeleteMapping("/players/{id}")
	public void deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
}
