package com.example.Heeseung.Repository;

import com.example.Heeseung.Entity.Member;
import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    @Override
    void deleteById(Long aLong);
    boolean existsByuserid(String userId);
}
