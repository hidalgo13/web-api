package com.finalproject.webapi.repositories;

import com.finalproject.webapi.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Long> {
}
