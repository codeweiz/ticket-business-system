package com.microboat.tbs.common.orm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * 审计属性实体
 *
 * @author microboat
 */
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AuditEntity {

    @Comment(value = "创建人")
    @CreatedBy
    @Column(name = "created_by", length = 128)
    private String createdBy;

    @Comment(value = "创建时间")
    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Comment(value = "更新人")
    @LastModifiedBy
    @Column(name = "updated_by", length = 128)
    private String updatedBy;

    @Comment(value = "更新时间")
    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
