package com.bx001.levelupsociety.api.service;

import com.bx001.levelupsociety.api.accessor.BannerAccessor;
import com.bx001.levelupsociety.api.accessor.BannerAccessorImpl;
import com.bx001.levelupsociety.api.model.Banner;

import java.util.List;

public class BannerServiceImpl implements BannerService {
  private final BannerAccessor bannerAccessor;

  public BannerServiceImpl() {
    bannerAccessor = new BannerAccessorImpl();
  }

  public List<Banner> getBanners() {
    return bannerAccessor.get();
  }
}
