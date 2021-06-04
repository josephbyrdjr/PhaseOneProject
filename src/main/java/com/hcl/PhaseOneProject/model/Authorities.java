package com.hcl.PhaseOneProject.model;

import javax.persistence.*;

@Entity
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

    public String getId() {
        return username;
    }

    public void setId(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
