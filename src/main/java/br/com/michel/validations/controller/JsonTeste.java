package br.com.michel.validations.controller;

import br.com.michel.validations.validation.ddd.DDD;
import br.com.michel.validations.validation.phone.Phone;
import br.com.michel.validations.validation.safestring.SafeString;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class JsonTeste {

    @JsonProperty(value = "identidade")
    public Integer id;

    @JsonProperty(value = "nome")
    @SafeString
    public String nome;

    @JsonProperty(value = "email")
    @Email
    public String email;

    @JsonProperty(value = "ddd")
    @DDD
    @SafeString
    public String ddd;

    @JsonProperty(value = "telefone")
    @Phone
    @SafeString
    public String telefone;
}
