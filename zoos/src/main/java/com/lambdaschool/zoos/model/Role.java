package com.lambdaschool.zoos.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends Auditable{
    // has 2 main fields (id and a name of the role)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleid;

    @Column(nullable = false, unique = true)
    // nullable should be false and it should be unique.
    private String name;
}
