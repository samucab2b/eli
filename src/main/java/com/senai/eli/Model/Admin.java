package com.senai.eli.Model;

import java.time.LocalDate;

import com.senai.eli.Validator.Usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Table(name = "admin", uniqueConstraints = {
    @UniqueConstraint(columnNames = "email"),
    @UniqueConstraint(columnNames = "usuario")
})
@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ultimo_acesso")
    private LocalDate ultimoAcesso;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;
    
    @Column(name = "senha", length = 256, nullable = false)
    private String senha;

    @Column(name = "usuario", nullable = false, unique = true)
    @Usuario
    private String usuario;

}
