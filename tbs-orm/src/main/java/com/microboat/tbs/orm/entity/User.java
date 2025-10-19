package com.microboat.tbs.orm.entity;

import com.microboat.tbs.common.orm.entity.AuditEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

/**
 * 用户实体
 *
 * @author microboat
 */
@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User extends AuditEntity {

    /**
     * ID
     */
    @Comment(value = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Comment(value = "用户名")
    @Column(name = "username", length = 128, nullable = false)
    private String username;

    /**
     * 邮箱
     */
    @Comment(value = "邮箱")
    @Column(name = "email", length = 256, nullable = true)
    private String email;
}
