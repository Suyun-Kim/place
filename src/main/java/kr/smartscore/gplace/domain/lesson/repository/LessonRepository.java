package kr.smartscore.gplace.domain.lesson.repository;

import kr.smartscore.gplace.domain.lesson.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
