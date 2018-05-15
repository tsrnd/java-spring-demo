package com.example.wsdemo.wsdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.wsdemo.business.KanjiManager;


@RestController
@RequestMapping("/kanji")
public class KanjiController {
	
	@Autowired
	private KanjiManager kanjiManager;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Kanji>> getAllKanji() {
		List<Kanji> kanjis = kanjiManager.allKanji();
		return new ResponseEntity<List<Kanji>>(kanjis, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String test() {
		return "test";
	}
}
