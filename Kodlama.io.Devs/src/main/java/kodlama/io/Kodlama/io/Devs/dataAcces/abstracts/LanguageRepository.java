package kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void add(Language language);
	void update(Language language);
	void delete(int id);
	Language getById(int id);
	
}
