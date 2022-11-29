package kodlama.io.programmingLanguageDemo.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguageDemo.DataAccess.Abstract.programmingLanguageRepository;
import kodlama.io.programmingLanguageDemo.Entities.programmingLanguage;



@RestController

public class inMemoryprogrammingLanguageRepository implements programmingLanguageRepository {
	
	
	List<programmingLanguage> programmingLanguages ;
	
	
	public  inMemoryprogrammingLanguageRepository() {
		
		programmingLanguages = new ArrayList<programmingLanguage>() ;
		
		programmingLanguages.add(new programmingLanguage(1, "Java"));
		programmingLanguages.add(new programmingLanguage(2, ".net"));
		programmingLanguages.add(new programmingLanguage(3, "Phyton"));
		programmingLanguages.add(new programmingLanguage(4, "C#"));

		
		
		
		
	}       
	

	@Override
	public void Add(programmingLanguage programmingLanguage) {

		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(int id) {

		programmingLanguages.remove(programmingLanguages.get(id));
	}

	@Override
	public void modify(programmingLanguage programmingLanguage) throws Exception {
		
		for(programmingLanguage thelanguage : programmingLanguages) {
			if(thelanguage.getId() == programmingLanguage.getId()) {
				programmingLanguages.set(thelanguage.getId() +2, programmingLanguage);
				
			}
		}		
	}

	

	

	@Override
	public programmingLanguage getById(int id) {
		return programmingLanguages.get(id +2);

	}
	
	@Override
	public List<programmingLanguage> getList() {
		return programmingLanguages;
	}

	@Override
	public void save(programmingLanguage programmingLanguage) {

	
	}

}
