package com.senai.eli.Validator.Usuario;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = UsuarioValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface Usuario {

    String message() default "Usuário inválido: deve ter entre 8 e 16 caracteres, sem espaços e sem caracteres especiais";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
