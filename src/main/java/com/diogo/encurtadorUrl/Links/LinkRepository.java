package com.diogo.encurtadorUrl.Links;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long>{

    Link findByUrlOriginal(String urlEncurtada);

}