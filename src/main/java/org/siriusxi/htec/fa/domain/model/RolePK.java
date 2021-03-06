package org.siriusxi.htec.fa.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class RolePK implements Serializable {
    
    @NonNull
    @Basic(optional = false)
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    
    @NonNull
    @Basic(optional = false)
    @Column(nullable = false)
    private String authority;
    
}
