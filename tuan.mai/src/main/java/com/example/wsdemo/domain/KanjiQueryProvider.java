package com.example.wsdemo.domain;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.wsdemo.wsdemo.Kanji;

@Component
public interface KanjiQueryProvider {
	List<Kanji> allKanji();
	List<Kanji> kanjiWidthLesson(int lessonID);
}
