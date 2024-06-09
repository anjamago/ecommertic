package com.linktic.ecommer.ecommerback.infrastructure.Entitys;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(
        name = "Categorys",
        schema = "catalogo"
)
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID IdCategoy;
    @Column(unique = true)
    private String Name;

    public CategoryEntity(UUID idCategoy, String name) {
        IdCategoy = idCategoy;
        Name = name;
    }

    public CategoryEntity( String name) {

        Name = name;
    }

    public CategoryEntity() {

    }


    public UUID getIdCategoy() {
        return IdCategoy;
    }

    public void setIdCategoy(UUID idCategoy) {
        IdCategoy = idCategoy;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
