package kr.smartscore.gplace.domain.user.entity;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findById(String id);
}
