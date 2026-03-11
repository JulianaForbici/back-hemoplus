package br.com.senior.mydomain.myservice.usuario;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.mydomain.myservice.Usuario;
import br.com.senior.mydomain.myservice.UsuarioCrudValidator;
import br.com.senior.mydomain.myservice.UsuarioEntity;
import br.com.senior.platform.translationhub.api.TranslationHubApi;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Service
public class UsuarioCrudValidatorImpl implements UsuarioCrudValidator {

    @Inject
    private TranslationHubApi translationHubApi;

    @Inject
    private UsuarioRepository usuarioRepository;

    @Override
    public void beforeCreate(UsuarioEntity entity) {
        validarEPadronizarNome(entity);
        validarDataNascimento(entity);
        validarEPadronizarCpf(entity);
        validarEPadronizarEmail(entity);
        validarEPadronizarTelefone(entity);
        validarTipoSanguineoEFatorRh(entity);
        validarUnicidadeCpf(entity, null);
        validarUnicidadeEmail(entity, null);
        validarUnicidadeTelefone(entity, null);
    }

    @Override
    public void beforeUpdate(UsuarioEntity entity) {
        validarEPadronizarNome(entity);
        validarDataNascimento(entity);
        validarEPadronizarCpf(entity);
        validarEPadronizarEmail(entity);
        validarEPadronizarTelefone(entity);
        validarTipoSanguineoEFatorRh(entity);
        validarUnicidadeCpf(entity, entity.getId());
        validarUnicidadeEmail(entity, entity.getId());
        validarUnicidadeTelefone(entity, entity.getId());
    }

    @Override
    public void beforeDelete(Usuario.Id id) {
    }

    private void validarEPadronizarNome(UsuarioEntity entity) {
        String nome = entity.getNomeCompleto();

        if (nome == null || nome.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.NOME.obrigatorio"));
        }

        nome = nome.trim().replaceAll("\\s{2,}", " ");
        if (nome.length() < 3) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.NOME.tamanho"));
        }

        entity.setNomeCompleto(nome);
    }

    private void validarDataNascimento(UsuarioEntity entity) {
        if (entity.getDataNascimento() == null) {
            return;
        }

        LocalDate hoje = LocalDate.now();

        if (entity.getDataNascimento().isAfter(hoje)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.DATA_NASCIMENTO.futuro"));
        }

        int idade = Period.between(entity.getDataNascimento(), hoje).getYears();
        if (idade < 16) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.DATA_NASCIMENTO.idadeMinima"));
        }
    }

    private void validarTipoSanguineoEFatorRh(UsuarioEntity entity) {
        if (entity.getTipoSangue() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.tipoSangue.obrigatorio"));
        }

        if (entity.getFatorRh() == null) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.common.fatorRh.obrigatorio"));
        }
    }

    private void validarEPadronizarCpf(UsuarioEntity entity) {
        String cpf = entity.getCpf();

        if (cpf == null || cpf.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.CPF.obrigatorio"));
        }

        String digits = cpf.replaceAll("\\D", "");

        if (!digits.matches("\\d{11}")) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.CPF.formato"));
        }

        if (!isValidCPF(digits)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.CPF.invalido"));
        }

        entity.setCpf(digits);
    }

    private boolean isValidCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) return false;

        boolean allEqual = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return false;

        int d1 = calcDigit(cpf, 9, 10);
        int d2 = calcDigit(cpf, 10, 11);

        return d1 == (cpf.charAt(9) - '0') && d2 == (cpf.charAt(10) - '0');
    }

    private int calcDigit(String cpf, int len, int weightStart) {
        int sum = 0;
        int weight = weightStart;
        for (int i = 0; i < len; i++) {
            sum += (cpf.charAt(i) - '0') * weight--;
        }
        int mod = (sum * 10) % 11;
        return (mod == 10) ? 0 : mod;
    }

    private void validarUnicidadeCpf(UsuarioEntity entity, UUID idAtual) {
        String cpf = entity.getCpf();

        boolean existe;
        if (idAtual == null) {
            existe = usuarioRepository.existsByCpf(cpf);
        } else {
            existe = usuarioRepository.existsByCpfAndIdNot(cpf, idAtual);
        }

        if (existe) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.CPF.jaExiste"));
        }
    }

    private void validarEPadronizarEmail(UsuarioEntity entity) {
        String email = entity.getEmail();

        if (email == null || email.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.EMAIL.obrigatorio"));
        }

        email = email.trim().toLowerCase();

        if (!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.EMAIL.formato"));
        }

        entity.setEmail(email);
    }

    private void validarUnicidadeEmail(UsuarioEntity entity, UUID idAtual) {
        String email = entity.getEmail();

        boolean existe;
        if (idAtual == null) {
            existe = usuarioRepository.existsByEmail(email);
        } else {
            existe = usuarioRepository.existsByEmailAndIdNot(email, idAtual);
        }

        if (existe) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.EMAIL.jaExiste"));
        }
    }

    private void validarEPadronizarTelefone(UsuarioEntity entity) {
        String tel = entity.getTelefone();

        if (tel == null || tel.isBlank()) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.TELEFONE.obrigatorio"));
        }

        String digits = tel.replaceAll("\\D", "");

        if (digits.startsWith("55") && digits.length() > 11) {
            digits = digits.substring(2);
        }

        if (!(digits.length() == 10 || digits.length() == 11)) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato"));
        }

        if (digits.charAt(0) == '0' || digits.charAt(1) == '0') {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.TELEFONE.formato"));
        }

        entity.setTelefone(digits);
    }

    private void validarUnicidadeTelefone(UsuarioEntity entity, UUID idAtual) {
        String tel = entity.getTelefone();

        boolean existe;
        if (idAtual == null) {
            existe = usuarioRepository.existsByTelefone(tel);
        } else {
            existe = usuarioRepository.existsByTelefoneAndIdNot(tel, idAtual);
        }

        if (existe) {
            throw new ServiceException(ErrorCategory.BAD_REQUEST, translationHubApi.getMessage("br.com.senior.my_domain.my_service.usuario.TELEFONE.jaExiste"));
        }
    }
}