package com.example.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.Language;
import com.example.assessment.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public List<Language> getAllLanguages(String empId){
		List<Language> langList = new ArrayList<>();
		languageRepository.findByEmployeeId(empId);
		return langList;
	}
	
	public Language getLanguage(String id) {
		return languageRepository.findById(id).get();
	}
	
	public void addLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public void updateLanguage(Language language) {
		languageRepository.save(language);
	}
	
	public void deleteLanguage(String id) {
		languageRepository.deleteById(id);
	}
	
}
