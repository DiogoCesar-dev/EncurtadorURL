package com.diogo.encurtadorUrl.Links;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "links")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlLonga;
    private String urlEncurtada;
    private String urlQrCode;
    private LocalDateTime UrlCriadaEm;



