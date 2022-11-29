package kodlama.io.programmingLanguageDemo.DataAccess.Abstract;

import java.util.List;

import kodlama.io.programmingLanguageDemo.Entities.programmingLanguage;

public interface programmingLanguageRepository {

	void Add(programmingLanguage programmingLanguage);

	void delete(int id);

	void modify(programmingLanguage programmingLanguage) throws Exception;

	List<programmingLanguage> getList();

	programmingLanguage getById(int id);

	void save(programmingLanguage programmingLanguage);

}
