package com.example.RestAPI.domain.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/** Todo Entity */
@Data
@Entity
@Table(name = "items")
public class ItemTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String title;
    private String description;
    private Integer price;
    private String image_path;

    @CreationTimestamp
    private LocalDateTime create_time;
    @UpdateTimestamp
    private LocalDateTime update_time;
}