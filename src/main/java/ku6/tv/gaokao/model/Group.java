package ku6.tv.gaokao.model;

import java.io.Serializable;

/**
 * group
 * @author 
 */
public class Group implements Serializable {
    private Integer id;

    private String groupAdd;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupAdd() {
        return groupAdd;
    }

    public void setGroupAdd(String groupAdd) {
        this.groupAdd = groupAdd;
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
        Group other = (Group) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupAdd() == null ? other.getGroupAdd() == null : this.getGroupAdd().equals(other.getGroupAdd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupAdd() == null) ? 0 : getGroupAdd().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupAdd=").append(groupAdd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}