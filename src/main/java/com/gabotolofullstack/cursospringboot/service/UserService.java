package com.gabotolofullstack.cursospringboot.service;

import com.gabotolofullstack.cursospringboot.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface UserService {

    //metodo q devuelve un iterable de objetos usuario
    public Iterable<User> findAll();

    //metodo donde se va usar paginacion
    public Page<User> findAll(Pageable pageable);

    //metodo devuelve un optional "java8"  q encuentre usuarios por id
    public Optional<User> findById(Long id);

    //metodo para guardar una entidad o actualizarla y devuelve el usuario
    public User save(User user);

    //metoodo q no devuelve nada para borrar un usuario por id
    public void deleteById(Long id);
}
