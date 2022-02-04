package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Pizza;

@FeignClient(name="EuferUceda-Pizza", url="localhost:59325")
public interface OpenFeignClient {

	
	@GetMapping("/pizza/listar")
	public List<Pizza> listarEstudiante();
	
	
}
