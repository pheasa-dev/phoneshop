package com.pheasa.phoneshop_night.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pheasa.phoneshop_night.entity.Brand;
import com.pheasa.phoneshop_night.repository.BrandRepository;
import com.pheasa.phoneshop_night.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}
}
