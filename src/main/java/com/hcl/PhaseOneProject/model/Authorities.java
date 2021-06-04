package com.hcl.PhaseOneProject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="authorities")
public class Authorities {
    @Id
    String username;
    String authority;



    public Authorities() {
    }

    public Authorities(String username) {
        this.username = username;
        this.authority = "ROLE_USER";
    }
}
