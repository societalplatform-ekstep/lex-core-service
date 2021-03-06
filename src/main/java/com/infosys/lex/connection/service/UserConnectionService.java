package com.infosys.lex.connection.service;

import com.infosys.lex.connection.postgresdb.UserConnections;
import com.infosys.lex.connection.postgresdb.UserConnectionsView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface UserConnectionService {
	Optional<UserConnections> getOptionalConnection(UUID connectedFrom, UUID connectedTo);

	UserConnections addConnection(UUID connectedFrom, UUID connectedTo);

	Page<UserConnectionsView> getConnections(UUID connectedFrom, UserConnections.UserConnectionStatus status, Pageable pageable);
}
