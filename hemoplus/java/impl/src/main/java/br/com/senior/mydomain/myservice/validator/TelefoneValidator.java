package br.com.senior.mydomain.myservice.validator;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

// utilitario pra padronizar telefone!

public final class TelefoneValidator {

    private TelefoneValidator() {
    }

    public static String validarEPadronizar(String telefone,
                                            TranslationHubApi translationHubApi,
                                            String keyObrigatorio,
                                            String keyFormato) {

        if (telefone == null || telefone.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyObrigatorio));
        }

        String digits = telefone.replaceAll("\\D", "");

        if (digits.startsWith("55") && digits.length() > 11) {
            digits = digits.substring(2);
        }

        if (!(digits.length() == 10 || digits.length() == 11)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyFormato));
        }

        if (digits.charAt(0) == '0' || digits.charAt(1) == '0') {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage(keyFormato));
        }

        return digits;
    }
}