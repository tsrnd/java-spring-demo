package com.thinhung.restful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinhung.restful.model.domain.Goods;
import com.thinhung.restful.repository.GoodsRepository;

@RestController
@RequestMapping(path = "/goods")
public class GoodsController  {
	@Autowired
	GoodsRepository goodsRepository;
	
	@GetMapping(path = "/all")
	public @ResponseBody List<Goods> all() {
		List<Goods> goods = goodsRepository.findAll();
		return goods;
	}
	
	@PostMapping(path = "/id")
	public @ResponseBody Optional<Goods> byId(@RequestParam Long id) {
		Optional<Goods> goods =  goodsRepository.findById(id);	
		return goods;
	}
}
