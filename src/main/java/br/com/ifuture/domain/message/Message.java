package br.com.ifuture.domain.message;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    private String id;

    private String subject;
    private String recipient;

    @Column(columnDefinition = "text")
    private String content;
    private LocalDate sendAt;

    private String createdAt;
    private String updatedAt;

    @PrePersist
    public void prePersist() {
        this.id = this.id != null ? this.id : UUID.randomUUID().toString();
        this.createdAt = this.createdAt != null ? this.createdAt : LocalDate.now().toString();
        this.updatedAt = this.updatedAt != null ? this.updatedAt : LocalDate.now().toString();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now().toString();
    }
}
