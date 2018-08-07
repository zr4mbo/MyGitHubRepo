/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zr4mbo
 */
@Entity
@Table(name = "USERPOINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userpoints.findAll", query = "SELECT u FROM Userpoints u")
    , @NamedQuery(name = "Userpoints.findByUserpointsId", query = "SELECT u FROM Userpoints u WHERE u.userpointsId = :userpointsId")
    , @NamedQuery(name = "Userpoints.findByPoints", query = "SELECT u FROM Userpoints u WHERE u.points = :points")})
public class Userpoints implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERPOINTS_ID")
    private Integer userpointsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POINTS")
    private int points;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "USERS_ID")
    @ManyToOne(optional = false)
    private Users usersId;

    public Userpoints() {
    }

    public Userpoints(Integer userpointsId) {
        this.userpointsId = userpointsId;
    }

    public Userpoints(Integer userpointsId, int points) {
        this.userpointsId = userpointsId;
        this.points = points;
    }

    public Integer getUserpointsId() {
        return userpointsId;
    }

    public void setUserpointsId(Integer userpointsId) {
        this.userpointsId = userpointsId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userpointsId != null ? userpointsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userpoints)) {
            return false;
        }
        Userpoints other = (Userpoints) object;
        if ((this.userpointsId == null && other.userpointsId != null) || (this.userpointsId != null && !this.userpointsId.equals(other.userpointsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "training.entity.Userpoints[ userpointsId=" + userpointsId + " ]";
    }
    
}
