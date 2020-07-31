package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 연습장 계약신청 등록 - 회원/제휴
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_regis")
public class PlaceRegis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_idx", nullable = false)
    private Long placeIdx;

    @Column(name = "place_grade", nullable = false)
    private Integer placeGrade;

    @Column(name = "place_items", nullable = false)
    private Integer placeItems;

    @Column(name = "is_last")
    private String isLast;

    @Column(name = "regis_status", nullable = false)
    private Integer regisStatus;

    @Column(name = "status_date")
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
