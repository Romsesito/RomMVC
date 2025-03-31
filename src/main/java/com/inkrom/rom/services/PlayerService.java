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

    public Player actualizarJugador(Long id, Player jugador) {
        Player jugadorExistente = playerRepository.findById(id).orElse(null);
        if (jugadorExistente != null) {
            jugadorExistente.setNombre(jugador.getNombre());
            jugadorExistente.setGeneroJuegoFavorito(jugador.getGeneroJuegoFavorito());
            jugadorExistente.setUltimoVideojuegoTerminado(jugador.getUltimoVideojuegoTerminado());
            jugadorExistente.setJuegosPlatinados(jugador.getJuegosPlatinados());
            return playerRepository.save(jugadorExistente);
        }
        return null;
    }

    public void eliminarJugador(Long id) {
        playerRepository.deleteById(id);
    }
}