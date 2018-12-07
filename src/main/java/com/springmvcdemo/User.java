package com.springmvcdemo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User {

	// can't be empty; there must be at least one.
	 @NotEmpty(message="Debe escribir al menos uno")
	private String[] hobbies;
	// value between 50 and 300
	 @Range(min=100, max=215, message="Su altura debe estar entre 1m y 2,15m")
	private Integer height;
	// required, min is 15 and max is 100
	@NotNull(message="Su edad es requerida")
	@Min(value=5, message="Su edad no puede ser menor que 5") 
	@Max(value=100, message="Su edad no puede ser mayor que 6")
	private Integer age;
	// required, date in the past
	@NotNull(message="birth date can't left blank")
	@Past
	private Date birth;
	// required, a valid email format
	@NotBlank(message="email can’t left blank")
	@Email(message="please enter a valid email", regexp=".+@.+\\..+")
	private String email;
	// required, strong password, min length
	@NotBlank(message="password can't left blank")
	@Size(min=8, message="password can't be less than 8 chars")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).+$", message="password must contain at least one digit, one lower char and one upper char, one special char, and doesn't contain spaces")
	private String password;
	// required, max & min length, alphaNumWithSpaces
	@NotBlank(message="name can't left blank")
	@Size(min=2, max=20, message="name must have min length of 2, and max of 20")
	@Pattern(regexp = "^[\\p{Alnum}\\s]+$", message="name can only contain alpha numeric characters and spaces")
	private String name;
	private Integer id;

	public User() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}