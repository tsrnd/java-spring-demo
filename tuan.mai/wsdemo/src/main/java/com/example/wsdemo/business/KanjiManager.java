package com.example.wsdemo.business;

import static org.hamcrest.CoreMatchers.nullValue;

import java.net.PortUnreachableException;
import java.util.List;

import javax.naming.directory.SearchResult;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.wsdemo.wsdemo.Kanji;

public class KanjiManager {
	@Autowired KanjiQueryManage kanjiQueryManage;
	
	public List<Kanji> allKanji() {
		return kanjiQueryManage.allKanji();
	}
}
