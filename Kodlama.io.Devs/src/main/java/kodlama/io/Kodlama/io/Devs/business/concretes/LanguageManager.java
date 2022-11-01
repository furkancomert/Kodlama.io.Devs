package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		List<Language> languages = languageRepository.getAll();
		for (Language language2 : languages) {
			if (language2.getId() == language.getId() || language2.getName().equals("")) {
				throw new Exception("Boş veya aynı isimde bilgi girdiniz.");
			}
		}

	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

}
