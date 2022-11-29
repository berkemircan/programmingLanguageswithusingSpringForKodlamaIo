package kodlama.io.programmingLanguageDemo.Business.abstracts;

import kodlama.io.programmingLanguageDemo.Entities.programmingLanguage;
import java.util.List;

public interface programmingLanguageService {

	List<programmingLanguage> getAll();
	programmingLanguage getProgrammingLanguageById(int LanguageId);
	void add(programmingLanguage programmingLanguage) throws Exception;
	void delete(int id) throws Exception;
	void Modify(programmingLanguage programmingLanguage) throws Exception;
}
