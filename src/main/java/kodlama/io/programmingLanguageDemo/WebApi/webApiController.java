package kodlama.io.programmingLanguageDemo.WebApi;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.programmingLanguageDemo.Business.abstracts.programmingLanguageService;
import kodlama.io.programmingLanguageDemo.Entities.programmingLanguage;
@RestController 
@RequestMapping("api/programmingLanguages")



public class webApiController{

	
	
		private programmingLanguageService programmingLanguageService;

		public webApiController (programmingLanguageService programmingLanguageService) {
			
			this.programmingLanguageService = programmingLanguageService;
		}
		
		@PostMapping("/add")
		public void add(@RequestBody programmingLanguage programmingLanguage) throws Exception {
			programmingLanguageService.add(programmingLanguage);
		}
		
		@DeleteMapping("/delete")
		public void delete(@RequestParam int id) throws Exception {
			programmingLanguageService.delete(id);
		}
		
		@PutMapping("/update")
		public void update(@RequestBody programmingLanguage programmingLanguage) throws Exception {
			programmingLanguageService.Modify(programmingLanguage);
		}
		
		@GetMapping("/getAll")
		public List<programmingLanguage> getAll(){
			return programmingLanguageService.getAll();
		}
		
		@GetMapping("/getById")
		public programmingLanguage getById(int id) {
			return programmingLanguageService.getProgrammingLanguageById(id);
		}
		
}
