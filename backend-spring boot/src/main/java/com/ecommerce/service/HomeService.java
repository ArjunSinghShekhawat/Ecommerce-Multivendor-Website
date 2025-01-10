package com.ecommerce.service;

import com.ecommerce.model.Home;
import com.ecommerce.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
