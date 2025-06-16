package csc340Team10.DnDGroupFinder.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable long id) {
        Player player = playerService.getPlayerById(id);
        if (player != null) {
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        Player updated = playerService.updatePlayer(id, player);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public List<Player> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return playerService.getAllPlayers();
    }

    // Login endpoint - verify username and password
    @PostMapping("/login")
    public ResponseEntity<Player> login(@RequestBody Player loginRequest) {
        Player player = playerService.findByUsername(loginRequest.getUsername());
        if (player != null && player.getPassword().equals(loginRequest.getPassword())) {
            // Passwords match - return player info without password (password is @JsonIgnore)
            return ResponseEntity.ok(player);
        }
        return ResponseEntity.status(401).build(); // Unauthorized
    }

    // Update password endpoint
    @PutMapping("/{id}/updatePassword")
    public ResponseEntity<String> updatePassword(@PathVariable Long id, @RequestBody String newPassword) {
        boolean updated = playerService.updatePassword(id, newPassword);
        if (updated) {
            return ResponseEntity.ok("Password updated successfully.");
        }
        return ResponseEntity.notFound().build();
    }

    // Search players by username keyword
    @GetMapping("/search")
    public List<Player> searchPlayersByUsername(@RequestParam String keyword) {
        return playerService.findByUsernameContaining(keyword);
    }

    // Keep your existing JSON file methods if needed
    @PostMapping("/writeFile")
    public String writeJson(@RequestBody Player player) {
        return playerService.writeJson(player);
    }

    @GetMapping("/readFile")
    public Object readJson() {
        return playerService.readJson();
    }
}
