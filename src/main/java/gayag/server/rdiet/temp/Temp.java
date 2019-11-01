package gayag.server.rdiet.temp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Temp {

    @Id
    @GeneratedValue
    private Long tempId;

    private String subject;

    private String contents;


    public Temp(String subject, String contents) {
        this.tempId = null;
        this.subject = subject;
        this.contents = contents;
    }

    public long getTempId() {
        return tempId;
    }

    public void setTempId(long tempId) {
        this.tempId = tempId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temp temp = (Temp) o;
        return tempId == temp.tempId &&
                Objects.equals(subject, temp.subject) &&
                Objects.equals(contents, temp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tempId, subject, contents);
    }

    @Override
    public String toString() {
        return "Temp{" +
                "tempId=" + tempId +
                ", subject='" + subject + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
