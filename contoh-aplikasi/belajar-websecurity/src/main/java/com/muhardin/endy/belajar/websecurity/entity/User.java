package com.muhardin.endy.belajar.websecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="s_users")
public class User {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotNull @NotEmpty
    @Column(nullable = false, unique = true)
    private String username;
    
    @NotNull @NotEmpty
    @Column(nullable = false, unique = true)
    private String email;
    
    @NotNull @NotEmpty
    @Column(nullable = false, name = "hashed_password")
    private String hashedPassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
    
    
}
