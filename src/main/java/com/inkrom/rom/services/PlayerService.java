package com.inkrom.rom.services;

import com.inkrom.rom.models.Player;
import com.inkrom.rom.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> listarJugadores() {
        return playerRepository.findAll();
    }

    public Player guardarJugador(Player jugador) {
        return playerRepository.save(jugador);
    }

    public Player obtenerJugadorPorId(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public void eliminarJugador(Long id) {
        playerRepository.deleteById(id);
    }
}