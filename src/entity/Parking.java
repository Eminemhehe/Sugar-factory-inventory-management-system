/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Parking {
    private int id;
    private int sequenceId;
    private String plateNumber;
    private String ownerName;
    private String idCard;
    private String telephone;
    private String entrance;
    private String exit;
    private double consumption;
    private double balanceOfCard;
    private String remarks;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sequenceId
     */
    public int getSequenceId() {
        return sequenceId;
    }

    /**
     * @param sequenceId the sequenceId to set
     */
    public void setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard the idCard to set
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the entrance
     */
    public String getEntrance() {
        return entrance;
    }

    /**
     * @param entrance the entrance to set
     */
    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    /**
     * @return the exit
     */
    public String getExit() {
        return exit;
    }

    /**
     * @param exit the exit to set
     */
    public void setExit(String exit) {
        this.exit = exit;
    }

    /**
     * @return the consumption
     */
    public double getConsumption() {
        return consumption;
    }

    /**
     * @param consumption the consumption to set
     */
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    /**
     * @return the balanceOfCard
     */
    public double getBalanceOfCard() {
        return balanceOfCard;
    }

    /**
     * @param balanceOfCard the balanceOfCard to set
     */
    public void setBalanceOfCard(double balanceOfCard) {
        this.balanceOfCard = balanceOfCard;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    
}
