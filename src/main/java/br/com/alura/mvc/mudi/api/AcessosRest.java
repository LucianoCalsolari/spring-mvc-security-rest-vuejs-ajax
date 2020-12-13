package br.com.alura.mvc.mudi.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.interceptor.InterceptadorDeAcesso;
import br.com.alura.mvc.mudi.interceptor.InterceptadorDeAcesso.Acesso;

@RequestMapping("acessos")
@RestController
public class AcessosRest {

	public List<Acesso> getAcessos() {

		return InterceptadorDeAcesso.acessos;

	}
}
