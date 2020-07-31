package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

/*
 * 연습장 관리자
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place_admin")
public class PlaceAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "account_idx", nullable = false)
    private int accountIdx;

    @Column(name = "place_idx", nullable = false)
    private Long placeIdx;

    @Column(name = "lesson_idx")
    private Long lessonIdx;

    @Column(name = "admin_type")
    private String adminType;

    @Column(insertable = false)
    private Timestamp regdate;

}
