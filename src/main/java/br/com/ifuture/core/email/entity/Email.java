package br.com.ifuture.core.email.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Email {
    
    @Id
    @Column
    private String id;
    
    @Column
    private String recipientName;
    
    @Column
    private String recipientEmail;
    
    @Column
    private String subject;

    @Lob
    @Column
    private String text;

    @Column
    private LocalDateTime createdAt;
    
    @Column
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist(){
        if(createdAt == null) createdAt = LocalDateTime.now();
        if(updatedAt == null) updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        updatedAt = LocalDateTime.now();
    }

}
