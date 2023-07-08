package com.backfcdev.microserviceproducts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Transient // evite tener iteración con la db, mostrar el port del microservice
    private Integer port;
}
