package com.bx001.levelupsociety.api;

import com.bx001.levelupsociety.api.model.Banner;
import com.bx001.levelupsociety.api.service.BannerService;
import com.bx001.levelupsociety.api.service.BannerServiceImpl;

import java.util.List;

public class ApiImpl implements Api {
  public ApiImpl() {
  }

  public List<Banner> getHomepageBanners() {
    BannerService bannerService = new BannerServiceImpl();
    return bannerService.getBanners();
  }
}
