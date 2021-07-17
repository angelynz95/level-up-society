package com.bx001.levelupsociety.api.accessor;

import com.bx001.levelupsociety.api.model.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerAccessorImpl implements BannerAccessor {
  public BannerAccessorImpl() {
  }

  public List<Banner> get() {
    List<Banner> banners = new ArrayList<>();
//    ToDo mock banners
    return banners;
  }
}
