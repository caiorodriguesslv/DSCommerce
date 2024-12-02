package com.devilish.dscommerce.dto;


import com.devilish.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    private Long id;
    @Size(min = 2, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 10, message = "A descrição deve ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;


    public ProductDTO(Long id, String imgUrl, Double price, String description, String name) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.price = entity.getPrice();
        this.description = entity.getDescription();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
