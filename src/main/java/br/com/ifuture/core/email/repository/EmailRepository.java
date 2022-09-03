package br.com.ifuture.core.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifuture.core.email.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, String> {
    
}
