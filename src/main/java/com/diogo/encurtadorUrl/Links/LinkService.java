package com.diogo.encurtadorUrl.Links;
import org.apache.commons.lang3.RandomStringUtils;


import java.time.LocalDateTime;

public class LinkService {

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    private LinkRepository linkRepository;


    public String gerarUrlAleatorio() {
        return RandomStringUtils.randomAlphanumeric(5, 10);
    }

    public Link encurtarUrl(String urlOriginal){
        Link link = new Link();
        link.setUrlLonga(urlOriginal);
        link.setUrlEncurtada(gerarUrlAleatorio());
        link.setUrlCriadaEm(LocalDateTime.now());
        link.setUrlQrCode("QR Code no indisponivel no momento!");

        return linkRepository.save(link);
    }

    public String obterUrkOriginal(String urlEncurtada){

        try {
            return linkRepository.findByUrlOriginal(urlEncurtada);
        }catch (Exception erro){
            throw new RuntimeException("Url nao existe em nossos registros", erro);
        }

    }

}
