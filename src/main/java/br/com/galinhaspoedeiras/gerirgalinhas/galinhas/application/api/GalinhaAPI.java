package br.com.galinhaspoedeiras.gerirgalinhas.galinhas.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/galinhas")
public interface GalinhaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	GalinhaResponse postGalinha(GalinhaRequest galinhaRequest);

}
