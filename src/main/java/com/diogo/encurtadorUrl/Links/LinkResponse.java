package com.diogo.encurtadorUrl.Links;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LinkResponse {

    private Long id;
    private String urlLong;
    private String urlEncurtada;
    private String urlQrCode;
    private LocalDateTime UrlCriadaEm;

}
