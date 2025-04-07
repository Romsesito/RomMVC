package com.inkrom.rom.repositories;

import com.inkrom.rom.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Método para buscar por nombre de usuario
}
