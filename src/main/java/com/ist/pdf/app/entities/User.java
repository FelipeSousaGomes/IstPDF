package com.ist.pdf.app.entities;

import jakarta.persistence.*;
import org.hibernate.service.spi.InjectService;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String email;
    private String senha;

    public User(){}

    public User(Long id, String email, String senha) {
        Id = id;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
