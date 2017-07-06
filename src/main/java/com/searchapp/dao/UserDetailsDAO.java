package com.searchapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
@Component
public interface UserDetailsDAO extends CrudRepository<UserDetails, Long> {

}
