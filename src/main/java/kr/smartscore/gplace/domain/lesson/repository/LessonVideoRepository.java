package kr.smartscore.gplace.domain.lesson.repository;

import kr.smartscore.gplace.domain.lesson.entity.LessonVideo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonVideoRepository extends JpaRepository<LessonVideo, Long> {
}
