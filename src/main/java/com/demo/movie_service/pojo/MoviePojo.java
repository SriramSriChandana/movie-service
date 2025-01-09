package com.demo.movie_service.pojo;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviePojo {
	private int movieId;
	@NotBlank
	private String movieTitle;
	@NotBlank
	private String movieLanguage;
	private LocalDate movieReleaseDate;
	private String movieImageUrl;
}