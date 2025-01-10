package com.ecommerce.model;

import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricCategories;

    private List<HomeCategory> dealCategories;

    private List<Deal> deals;

}
