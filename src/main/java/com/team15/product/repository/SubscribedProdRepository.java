package com.team15.product.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team15.product.entity.SubscribedProd;

	public interface SubscribedProdRepository extends JpaRepository<SubscribedProd, String>{
		List<SubscribedProd> findByBuyerid(String buyerid);
	}

