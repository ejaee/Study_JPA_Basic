package hellojpa;

import java.util.Date;
import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name")
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    // varchar 보다 큰 컨텐츠를 넣고 싶을 때 사용
    @Lob
    private String description;

    // JPA 는 동적 생성을 위해 기본 생성자가 있어야 한다.
    public Member() {
    }

}
