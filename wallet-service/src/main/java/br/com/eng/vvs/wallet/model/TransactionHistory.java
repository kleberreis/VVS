package br.com.eng.vvs.wallet.model;

import br.com.eng.vvs.commons.interfaces.BaseModel;

import javax.persistence.*;

@Entity
public class TransactionHistory implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CITY_SEQ")
    @SequenceGenerator(sequenceName = "seq_city", name = "CITY_SEQ", allocationSize = 1)
    private Integer id;

    @ManyToOne
    private Transaction transaction;

    private String request;

    private String response;

    private String returnCode;

    private Status status;

    private Integer retry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getRetry() {
        return retry;
    }

    public void setRetry(Integer retry) {
        this.retry = retry;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "id=" + id +
                ", transaction=" + transaction +
                ", request='" + request + '\'' +
                ", response='" + response + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", status=" + status +
                ", retry=" + retry +
                '}';
    }
}
