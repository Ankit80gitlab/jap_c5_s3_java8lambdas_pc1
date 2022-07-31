package com.jap.ticketing;

public class TicketingData {

    // Declare all the attributes of the ticketing data here other than travelledKM

    private String schedule_no;
    private String routeNo;
    private String ticketFromStopId;
    private String ticketFromStopSeqNo;
    private String ticketTillStopId;
    private String ticketTillStopSeqNo;
    private String ticketDate;
    private String ticketTime;
    private int totalTicketAmount;
    private float travelledKM;


    // constructor

    public TicketingData(String schedule_no, String routeNo, String ticketFromStopId, String ticketFromStopSeqNo, String ticketTillStopId, String ticketTillStopSeqNo, String ticketDate, String ticketTime, int totalTicketAmount, float travelledKM) {

        this.schedule_no = schedule_no;
        this.routeNo = routeNo;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKM = travelledKM;
    }


    // getter - setter

    public String getSchedule_no() {
        return schedule_no;
    }

    public void setSchedule_no(String schedule_no) {
        this.schedule_no = schedule_no;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(String ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public String getTicketFromStopSeqNo() {
        return ticketFromStopSeqNo;
    }

    public void setTicketFromStopSeqNo(String ticketFromStopSeqNo) {
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
    }

    public String getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(String ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public String getTicketTillStopSeqNo() {
        return ticketTillStopSeqNo;
    }

    public void setTicketTillStopSeqNo(String ticketTillStopSeqNo) {
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public int getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public void setTotalTicketAmount(int totalTicketAmount) {
        this.totalTicketAmount = totalTicketAmount;
    }

    public float getTravelledKM() {
        return travelledKM;
    }

    public void setTravelledKM(float travelledKM) {
        this.travelledKM = travelledKM;
    }


    // Override the toString method

    @Override
    public String toString() {
        return "TicketingData{" +
                "schedule_no='" + schedule_no + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", ticketFromStopId='" + ticketFromStopId + '\'' +
                ", ticketFromStopSeqNo='" + ticketFromStopSeqNo + '\'' +
                ", ticketTillStopId='" + ticketTillStopId + '\'' +
                ", ticketTillStopSeqNo='" + ticketTillStopSeqNo + '\'' +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketTime='" + ticketTime + '\'' +
                ", totalTicketAmount=" + totalTicketAmount +
                ", travelledKM=" + travelledKM +
                '}';
    }

}
