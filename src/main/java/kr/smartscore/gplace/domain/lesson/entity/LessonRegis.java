package kr.smartscore.gplace.domain.lesson.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 레슨프로 변경신청 등록
 */

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "lesson_regis")
public class LessonRegis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "lesson_idx", nullable = false)
    private Long lessonIdx;

    @Column(name = "change_place_idx", nullable = false)
    private Long changePlaceIdx;

    @Column
    private String comments;

    @Column(name = "regis_status", nullable = false)
    private Integer regisStatus;

    @Column(name = "status_date", nullable = false)
    private Timestamp statusDate;

    @Column(name = "status_reason")
    private String statusReason;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(insertable = false, updatable = false)
    private Timestamp regdate;


}
