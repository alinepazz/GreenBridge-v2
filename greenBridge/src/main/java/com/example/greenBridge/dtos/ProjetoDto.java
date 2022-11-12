package com.example.greenBridge.dtos;

import javax.validation.constraints.NotBlank;

public class ProjetoDto {

    @NotBlank
    private String image;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
