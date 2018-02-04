package br.gov.ce.secult.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import br.gov.ce.secult.model.Informative;
import br.gov.ce.secult.repository.InformativeRepository;

@Controller
public class InformativeController {
	@Autowired
	private InformativeRepository informativeRepository;

	@SuppressWarnings("deprecation")
	@MessageMapping("/informative")
	@SendTo("/informative/new")
	public String newInformative(String content) throws Exception {
		/* TODO: configurar conteudo abaixo */
		Informative info = new Informative();
		info.setSubject("Test Content");
		info.setContent(content);
		info.setAuthor("nalomy.souza@secult.ce.gov.br");
		info.setCreate(new Date());
		info.setExpiration(new Date(2018, 03, 20));

		informativeRepository.save(info);
		Thread.sleep(1000); // simulated delay
		return info.getContent();
	}
}
