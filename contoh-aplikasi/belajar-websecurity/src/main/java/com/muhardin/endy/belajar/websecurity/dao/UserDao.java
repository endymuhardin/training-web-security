package com.muhardin.endy.belajar.websecurity.dao;

import com.muhardin.endy.belajar.websecurity.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, Integer>{

}
