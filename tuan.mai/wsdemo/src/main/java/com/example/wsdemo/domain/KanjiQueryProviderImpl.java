package com.example.wsdemo.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.wsdemo.wsdemo.Kanji;
import com.example.wsdemo.wsdemo.KanjiRepository;

public class KanjiQueryProviderImpl implements KanjiQueryProvider {
	
	@Autowired
	private KanjiRepository kanjiRepository;

	@Override
	public List<Kanji> allKanji() {
		return kanjiRepository.findAll();
	}

	@Override
	public List<Kanji> kanjiWidthLesson(int lessonID) {
		return kanjiRepository.findAll();
	}
	
}
 