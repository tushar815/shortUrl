package com.kalbhort.shortUrl.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String longUrl;
    private String shortUrl;
    private String username;

    public Url(String longUrl, String shortUrl, String username) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        this.username = username;
    }
}
