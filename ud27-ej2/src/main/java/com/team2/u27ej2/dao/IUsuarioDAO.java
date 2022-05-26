package com.team2.u27ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.team2.u27ej2.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}