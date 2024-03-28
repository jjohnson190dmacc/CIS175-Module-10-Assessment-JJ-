package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import dmacc.model.Tool;
import dmacc.repo.IToolRepo;

/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Mar 26, 2024
 */

@Controller
public class ToolController {

	@Autowired
	IToolRepo repo;
	
	@GetMapping("/")
	public String getForm(Tool tool) {
		return "index";
	}
	
	@GetMapping({"/viewAll"})
	public String viewAllTools(Model model) {
	
		if(repo.findAll().isEmpty()) {
			return addNewTool(model);
		}
		model.addAttribute("tools", repo.findAll());
		
		return "results";
		
}
	
	@GetMapping("/addTool")
		public String addNewTool(Model model) {
		
			Tool t = new Tool();
			model.addAttribute("newTool", t);
			
			return "input";
	}
	
    @PostMapping("/addTool")
	public String addNewTool(@ModelAttribute Tool t, Model model) {
		repo.save(t);
	
	return viewAllTools(model);
        }
    
	@GetMapping("/edit/{id}")
	public String showUpdateTool(@PathVariable("id") int id, Model model) {
		Tool t = repo.findById(id).orElse(null);
		model.addAttribute("newTool", t);
		
		return "input";
		
}
	
	@PostMapping("/update/{id}")
	public String reviseTool(Tool t, Model model) {
		repo.save(t);
		
		return viewAllTools(model);

}
	
	@GetMapping("/delete/{id}")
	public String deleteTool(@PathVariable("id") int id, Model model) {
		Tool t = repo.findById(id).orElse(null);
		repo.delete(t);
		
		return viewAllTools(model);

}
	
}
