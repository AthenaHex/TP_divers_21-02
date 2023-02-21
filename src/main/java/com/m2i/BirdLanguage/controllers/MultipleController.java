package com.m2i.BirdLanguage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.BirdLanguage.services.MultiService;


@RestController
@RequestMapping("/multi")
public class MultipleController {
	@Autowired
	MultiService Service;
	
	
	@GetMapping("/reverse")
	private String CodeReverse(@RequestParam ("code") String code ){
		return Service.CodeReverse(code);
	}
	
	@GetMapping("/rwx")
	private String RWXCounter(@RequestParam ("code") String code ){
		return Service.RWXCounter(code);
	}
	
	//--miss one
	
	@GetMapping("/bird")
	private String BirdLanguageTranslatation(@RequestParam ("sentence") String sentence ){
		return Service.BirdLanguageTranslatation(sentence);
	}
	
	
	@GetMapping("/ATCG")
	private String nucleoCounter(@RequestParam ("nucleotide") String nucleotide ){
		return Service.nucleoCounter(nucleotide);
	}
	
	
	@GetMapping("/triangle/area")
	private Double areaOfEquilateralTriangle(@RequestParam ("side") int side ){
		return Service.areaOfEquilateralTriangle(side);
	}
	
	
	@GetMapping("/duel")
	private String duel1Vs1(@RequestParam ("hp1") int hp1, @RequestParam ("hp2") int hp2, @RequestParam ("dgt1") int dgt1, @RequestParam ("dgt2") int dgt2) {
		return Service.duel1Vs1(hp1, hp2, dgt1, dgt2);
	}
	
}
