package com.example.wsdemo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.wsdemo.domain.KanjiQueryProvider;
import com.example.wsdemo.wsdemo.Kanji;

public class KanjiQueryManage {
	
	@Autowired
	private KanjiQueryProvider kanjiQueryProvider;
	public List<Kanji>allKanji() {
		return kanjiQueryProvider.allKanji();
	}
}
