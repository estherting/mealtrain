package com.eting.mealtrain.repository;

import com.eting.mealtrain.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {
}
