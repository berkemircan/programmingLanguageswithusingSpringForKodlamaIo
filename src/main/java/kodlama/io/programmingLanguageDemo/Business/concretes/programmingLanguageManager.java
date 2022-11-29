package kodlama.io.programmingLanguageDemo.Business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguageDemo.Business.abstracts.programmingLanguageService;
import kodlama.io.programmingLanguageDemo.Entities.programmingLanguage;
import kodlama.io.programmingLanguageDemo.DataAccess.Abstract.programmingLanguageRepository;



@Service

public class programmingLanguageManager implements programmingLanguageService {
	
	

	private programmingLanguageRepository programmingLanguageRepository;
	

	public programmingLanguageManager(programmingLanguageRepository programmingLanguageRepository) {
		
			this.programmingLanguageRepository = programmingLanguageRepository;
		}
	
	@Override
	public void add(programmingLanguage programmingLanguage) throws Exception {
		
		if (programmingLanguage.getName().isBlank()) {
			throw new Exception("programlama dili boş geçilemez!");
		}
		
		for (programmingLanguage inDbLanguage : programmingLanguageRepository.getList()) {
			if (inDbLanguage.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimli programlama dili zaten mevcut! ");
			}
			
		}
		
		programmingLanguageRepository.save(programmingLanguage);
		System.out.println("programlama dili başarıyla eklendi :" + programmingLanguage.getName());
	}

	@Override
	public void delete(int id) throws Exception {
		
		for (programmingLanguage programmingLanguage : programmingLanguageRepository.getList()) {
			if (programmingLanguage.getId() == id ) {
				programmingLanguageRepository.delete(id);
			}
		}
		System.out.println("programlama dili silindi !" );
	}

	@Override
	public void Modify(programmingLanguage programmingLanguage) throws Exception {
		
		if (programmingLanguage.getName().isBlank()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}
		
		for (programmingLanguage inMemoryprogrammingLanguage : programmingLanguageRepository.getList()) {
			if (inMemoryprogrammingLanguage.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimli programlama dili zaten mevcut!");
			}
		}
		
			programmingLanguageRepository.modify(programmingLanguage) ;
			System.out.println("proglama dili güncellendi : " + programmingLanguage.getName());
			
			; }
	
	


	@Override
	public List<programmingLanguage> getAll() {
		
		System.out.println("programlama dilleri  listelendi ! ");
		
		return programmingLanguageRepository.getList();
	}

	@Override
	public programmingLanguage getProgrammingLanguageById(int LanguageId) {
		
		
		return programmingLanguageRepository.getById(LanguageId);
		
	}
}
