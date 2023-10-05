package br.com.galinhaspoedeiras.gerirgalinhas.galinhas.domain;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)

public class Galinha {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
	@NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
}

