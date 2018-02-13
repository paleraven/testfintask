package sample.data.jpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account {
    @Id
    @SequenceGenerator(name = "account_generator", sequenceName = "account_sequence", initialValue = 1000)
    @GeneratedValue(generator = "account_generator")
    private Long id;

    @Column(nullable = false)
    private String nameAccount;

    @Column
    private Date created;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
