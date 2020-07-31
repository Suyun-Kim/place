package kr.smartscore.gplace.domain.lesson.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 연습장 소속 레슨프로
 */

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_idx", nullable = false)
    private Long placeIdx;

    @Column(name = "lesson_status", nullable = false)
    private Integer lessonStatus;

    @Column(name = "pro_grade", nullable = false)
    private Integer proGrade;

    @Column(name = "is_online")
    private Integer isOnline;

    @Column(name = "pro_name", nullable = false)
    private String proName;

    @Column(nullable = false)
    private String phone1;

    @Column
    private String phone2;

    @Column(nullable = false)
    private String email;

    @Column(name = "pro_years")
    private Integer proYears;

    @Column(nullable = false)
    private String gender;

    @Column(name = "certificate_file_idx")
    private BigInteger certificateFileIdx;

    @Column(name = "is_certificate")
    private Integer isCertificate;

    @Column(name = "lesson_info")
    private String lessonInfo;

    @Column
    private String careers;

    @Column(name = "lesson_times")
    private String lessonTimes;

    @Column(name = "profile_img_idx", nullable = false)
    private BigInteger profileImgIdx;

    @Column(name = "promotion_str", nullable = false)
    private String promotionStr;

    @Column(name = "pr_memo", nullable = false)
    private String prMemo;

    @Column(name = "zzim_count", nullable = false)
    private Integer zzimCount;

    @Column(name = "view_count", nullable = false)
    private Integer viewCount;

    @Column(name = "avg_score", nullable = false)
    private BigDecimal avgScore;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false)
    private Timestamp moddate;

    @Column(insertable = false, updatable = false)
    private Timestamp regDate;


}
