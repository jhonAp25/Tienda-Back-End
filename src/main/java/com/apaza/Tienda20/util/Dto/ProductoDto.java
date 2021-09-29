package com.apaza.Tienda20.util.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Long id;
    private String modelo;
    private String color;
    private String talla;
    private int stock;


}
