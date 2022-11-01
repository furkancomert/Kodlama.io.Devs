package kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> _languages;
	
	public InMemoryLanguageRepository() {
		_languages = new ArrayList<Language>();
		_languages.add(new Language(1, "Java"));
		_languages.add(new Language(2, "JavaScript"));
		_languages.add(new Language(3, "Python"));
	}



	@Override
	public List<Language> getAll() {
		
		return _languages;
	}



	@Override
	public void add(Language language) {
		_languages.add(language);
	}



	@Override
	public void update(Language language) {
		for (Language language2 : _languages) {
			if (language.getId()==language2.getId()) {
				language2.setName(language.getName());
			}
		}
		
	}



	@Override
	public void delete(int id) {
		_languages.remove(id);
		
	}



	@Override
	public Language getById(int id) {
		for (Language language2 : _languages) {
			if (language2.getId()==id) {
				return language2;
			}
		}
		return null;
	}

}
