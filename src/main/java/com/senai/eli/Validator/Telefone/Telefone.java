package com.senai.eli.Validator.Telefone;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = TelefoneValidator.class) // Lógica da classe validadora
@Target({ElementType.FIELD, ElementType.PARAMETER}) // Onde a anotação pode ser usada
@Retention(RetentionPolicy.RUNTIME) // Mantém a anotação em tempo de execução
public @interface Telefone {

    String message() default "Telefone inválido"; // Mensagem padrão

    Class<?>[] groups() default {}; // Para agrupamento de validações

    Class<? extends Payload>[] payload() default {}; // Para informações adicionais sobre a falha

    // Opcional: Adicione parâmetros customizáveis, se necessário.
    boolean apenasCelular() default false; // Exemplo de parâmetro opcional
    boolean required() default false;
}
