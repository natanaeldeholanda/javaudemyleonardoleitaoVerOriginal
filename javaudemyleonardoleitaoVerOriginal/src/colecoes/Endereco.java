package colecoes;

import java.util.Objects;

public class Endereco {
    String logradouro;
    String complemento;
    int numero;

    public Endereco(String logradouro, String complemento, int numero) {
        this.complemento = complemento;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(complemento, endereco.complemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, complemento, numero);
    }
}
