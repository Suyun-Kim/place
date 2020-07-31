package kr.smartscore.gplace.domain.place.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/*
 * 연습장
 */

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(name = "place_status", nullable = false)
    private Integer placeStatus;

    @Column(name = "place_grade", nullable = false)
    private Integer placeGrade;

    @Column(name = "place_type", nullable = false)
    private Integer placeType;

    @Column(name = "place_name", nullable = false)
    private String placeName;

    @Column(name = "prez_name", nullable = false)
    private String prezName;

    @Column(name = "biz_no", nullable = false)
    private String bizNo;

    @Column(nullable = false)
    private String phone1;

    @Column
    private String phone2;

    @Column(nullable = false)
    private String email;

    @Column(name = "placeItems", nullable = false)
    private Integer place_items;

    @Column(name = "salesRate")
    private Integer sales_rate;

    @Column(nullable = false)
    private String sido;

    @Column(nullable = false)
    private String gugun;

    @Column(nullable = false)
    private String dong;

    @Column(nullable = false)
    private String postcode;

    @Column(nullable = false)
    private String addr1;

    @Column(nullable = false)
    private String addr2;

    @Column(nullable = false)
    private Double lat;

    @Column(nullable = false)
    private Double lng;

    @Column(name = "loc_point", nullable = false)
    private String locPoint;

    @Column(name = "master_image_idx")
    private BigInteger masterImageIdx;

    @Column(name = "biz_file_idx")
    private BigInteger bizFileIdx;

    @Column(name = "id_file_idx")
    private BigInteger idFileIdx;

    @Column(name = "writer_id", nullable = false)
    private String writerId;

    @Column(name = "user_count", nullable = false)
    private Integer userCount;

    @Column(name = "zzim_count", nullable = false)
    private Integer zzimCount;

    @Column(name = "view_count", nullable = false)
    private Integer viewCount;

    @Column(name = "avg_score", nullable = false)
    private BigDecimal avgScore;

    @Column(name = "show_status", nullable = false)
    private Integer showStatus;

    @Column(insertable = false, updatable = false)
    private Timestamp moddate;

    @Column(insertable = false)
    private Timestamp regdate;

}

