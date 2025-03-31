package com.inkrom.rom.controllers;

import com.inkrom.rom.models.Player;
import com.inkrom.rom.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
@CrossOrigin(origins = "http://localhost:3000") // Permitir solicitudes desde React
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> listarJugadores() {
        return playerService.listarJugadores();
    }

    @PostMapping
    public Player guardarJugador(@RequestBody Player jugador) {
        return playerService.guardarJugador(jugador);
    }

    @PutMapping("/{id}")
    public Player actualizarJugador(@PathVariable Long id, @RequestBody Player jugador) {
        return playerService.actualizarJugador(id, jugador);
    }

    @GetMapping("/{id}")
    public Player obtenerJugadorPorId(@PathVariable Long id) {
        return playerService.obtenerJugadorPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarJugador(@PathVariable Long id) {
        playerService.eliminarJugador(id);
    }
}
