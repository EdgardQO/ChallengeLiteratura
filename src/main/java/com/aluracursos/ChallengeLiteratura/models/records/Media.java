package com.aluracursos.ChallengeLiteratura.models.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Media(
    @JsonAlias("image/jpeg") String imagen
){}
