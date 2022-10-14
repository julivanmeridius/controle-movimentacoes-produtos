package br.com.controle.produtos.util;

import static br.com.controle.produtos.util.StringUtils.getMensagemPadrao;

public class ControleManualProdutosConstants {

	public ControleManualProdutosConstants() {
		super();
	}
	
	public static final String RESPONSE_200 = getMensagemPadrao("response.code200");
	public static final String RESPONSE_201 = getMensagemPadrao("response.code201");
	public static final String RESPONSE_204 = getMensagemPadrao("response.code204");

	public static final String RESPONSE_304 = getMensagemPadrao("response.code304");

	public static final String RESPONSE_400 = getMensagemPadrao("response.code400");
	public static final String RESPONSE_401 = getMensagemPadrao("response.code401");
	public static final String RESPONSE_404 = getMensagemPadrao("response.code404");

	public static final String RESPONSE_500 = getMensagemPadrao("response.code500");
	
}
