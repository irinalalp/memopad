package memopad.memo.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="memos")
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "desciption")
    private String description;

    @Column(name = "status")
    private boolean status;

    @Column(name = "target_date")
    private Date targetDate;

    public Memo(){
        super();
    }

    public Memo(long id, String description, boolean status, Date targetDate) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.targetDate = targetDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
