package com.story.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.story.models.Structure;

@Controller
@RequestMapping({ "/", "/story" })
public class StoryController {
	Structure newStructure = new Structure("Mark", "llama", "3");
	
	
	@GetMapping("/beginning")
	public String beginning(Model model) {
	
		model.addAttribute("structure", newStructure);

		// The string index will be looked for in src/main/resources/templates
		return "beginning";
		
		
	}
	@GetMapping("/middle")
	public String middle(Model model) {
	
		model.addAttribute("structure", newStructure);
		
		// The string index will be looked for in src/main/resources/templates
		return "middle";
		
		
	}
	@GetMapping("/end")
	public String end(Model model) {
	
		model.addAttribute("structure", newStructure);

		// The string index will be looked for in src/main/resources/templates
		return "end";
		
		
	}
	
	@GetMapping("/fullstory")
	public String fullstory(Model model) {
	
		
		model.addAttribute("structure", newStructure);
		// The string index will be looked for in src/main/resources/templates
		return "fullstory";
		
		
	}
	
	
	
	

	// Remember Ctrl + Shift + O (Mac: Command + Shift + O) to auto import
	@PostMapping("/createfullstory")
	public String structureSubmit(@ModelAttribute Structure _Structure) {
		newStructure.setAnimal(_Structure.getAnimal());
		newStructure.setYears(_Structure.getYears());
		newStructure.setName(_Structure.getName());
		
		return "fullstory";
		
	}
}
// Remember Ctrl + Shift + F (Mac: Command + Shift + F) to quick format your file.