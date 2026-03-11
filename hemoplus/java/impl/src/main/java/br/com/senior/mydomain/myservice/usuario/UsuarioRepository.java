package br.com.senior.mydomain.myservice.usuario;

import br.com.senior.mydomain.myservice.UsuarioBaseRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends UsuarioBaseRepository {

    boolean existsByCpf(String cpf);
    boolean existsByCpfAndIdNot(String cpf, UUID id);
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, UUID id);
    boolean existsByTelefone(String telefone);
    boolean existsByTelefoneAndIdNot(String telefone, UUID id);
}
