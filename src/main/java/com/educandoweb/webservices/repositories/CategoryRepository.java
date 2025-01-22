package com.educandoweb.webservices.repositories;

import com.educandoweb.webservices.entities.Category;
import com.educandoweb.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
