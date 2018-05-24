package ku6.tv.gaokao.model;

import java.io.Serializable;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Integer id;

    private String idno;

    private String stuName;

    private Double fenshu;

    private Integer tid;

    private Integer gid;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Double getFenshu() {
        return fenshu;
    }

    public void setFenshu(Double fenshu) {
        this.fenshu = fenshu;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdno() == null ? other.getIdno() == null : this.getIdno().equals(other.getIdno()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()))
            && (this.getFenshu() == null ? other.getFenshu() == null : this.getFenshu().equals(other.getFenshu()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdno() == null) ? 0 : getIdno().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        result = prime * result + ((getFenshu() == null) ? 0 : getFenshu().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idno=").append(idno);
        sb.append(", stuName=").append(stuName);
        sb.append(", fenshu=").append(fenshu);
        sb.append(", tid=").append(tid);
        sb.append(", gid=").append(gid);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}