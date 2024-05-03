package com.ITTAxMED.hackathonTeam3.Repository.User;

import com.ITTAxMED.hackathonTeam3.domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);
}
