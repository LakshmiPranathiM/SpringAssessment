package com.example.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.Employee;
import com.example.assessment.Language;
import com.example.assessment.service.LanguageService;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/employee/{id}/language")
	public List<Language> getAllLanguages(@PathVariable String id){
		return languageService.getAllLanguages(id);
	}
	
	@RequestMapping("/employee/{id}/language/{languageId}")
	public Language getLanguage(@PathVariable String languageId) {
		return languageService.getLanguage(languageId);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/employee/{empId}/language")
	public void addLanguage(@RequestBody Language language, @PathVariable String empId) {
		language.setEmployee(new Employee(empId,"",""));
		languageService.addLanguage(language);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/employee/{empid}/language/{languageId}")
	public void updateLanguage(@RequestBody Language language,@PathVariable String empId, @PathVariable String languageId) {
		language.setEmployee(new Employee(empId,"",""));
		languageService.updateLanguage(language);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/employee/{empid}/language/{languageId}")
	public void deleteLanguage(@PathVariable String languageId) {
		languageService.deleteLanguage(languageId);
	}
}
