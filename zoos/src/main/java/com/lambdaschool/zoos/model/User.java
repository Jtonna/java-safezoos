package com.lambdaschool.zoos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "users")
// this gets called users here and users in the database
public class User extends Auditable {

    // the user class has a user id
    // user name
    // password (encrypted) with bcrypto

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Allows the server to auto generate the id (basically id++)
    private long userid;

    @Column(nullable = false, unique = true)
    // nullable = false // this means the value cant be null
    // unique = true // means that the value cant be duplicated or in use elsewhere
    private String username;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    // we need to make it so the password doesnt get printed as json
    private String password;
}
