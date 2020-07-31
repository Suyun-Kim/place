package kr.smartscore.gplace.domain.lesson.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 온라인 레슨 동영상
 */

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "lesson_video")
public class LessonVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "lesson_idx", nullable = false)
    private Long lessonIdx;

    @Column(name = "video_file_idx", nullable = false)
    private BigInteger videoFileIdx;

    @Column(nullable = false)
    private String title;

    @Column
    private Integer category;

    @Column
    private String contents;

    @Column
    private String tags;

    @Column(name = "view_count", nullable = false)
    private Integer viewCount;

    @Column(name = "likes_count", nullable = false)
    private Integer likesCount;

    @Column(name = "reply_count", nullable = false)
    private Integer replyCount;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;

}
