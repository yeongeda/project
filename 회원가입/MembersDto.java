package com.example.project.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MembersDto {
    private int memberID;
    private String memberEmail;
    private String memberPasswd;
    private String memberName;
    private String memberPhone;
    private String memberNickName;
    private LocalDate memberBirth;
    private String memberPostcode;
    private String memberAddress;
    private String memberDetailAddress;
    private String memberExtraAddress;
    private String memberInterest;
    private String regdate;
    private long memberPoint;
    private String memberRole;

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public LocalDate getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(LocalDate memberBirth) {
        this.memberBirth = memberBirth;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPasswd() {
        return memberPasswd;
    }

    public void setMemberPasswd(String memberPasswd) {
        this.memberPasswd = memberPasswd;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public String getMemberPostcode() {
        return memberPostcode;
    }

    public void setMemberPostcode(String memberPostcode) {
        this.memberPostcode = memberPostcode;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberDetailAddress() {
        return memberDetailAddress;
    }

    public void setMemberDetailAddress(String memberDetailAddress) {
        this.memberDetailAddress = memberDetailAddress;
    }

    public String getMemberExtraAddress() {
        return memberExtraAddress;
    }

    public void setMemberExtraAddress(String memberExtraAddress) {
        this.memberExtraAddress = memberExtraAddress;
    }

    public String getMemberInterest() {
        return memberInterest;
    }

    public void setMemberInterest(String memberInterest) {
        this.memberInterest = memberInterest;
    }

    public long getMemberPoint() {
        return memberPoint;
    }

    public void setMemberPoint(long memberPoint) {
        this.memberPoint = memberPoint;
    }

//    @Override
//    public String toString() {
//        return "MembersDto{" +
//                "memberID=" + memberID +
//                ", memberEmail='" + memberEmail + '\'' +
//                ", memberPasswd='" + memberPasswd + '\'' +
//                ", memberName='" + memberName + '\'' +
//                ", memberPhone='" + memberPhone + '\'' +
//                ", memberNickName='" + memberNickName + '\'' +
//                ", memberBirth='" + memberBirth + '\'' +
//                ", memberPostcode='" + memberPostcode + '\'' +
//                ", memberAddress='" + memberAddress + '\'' +
//                ", memberDetailAddress='" + memberDetailAddress + '\'' +
//                ", memberExtraAddress='" + memberExtraAddress + '\'' +
//                ", memberInterest='" + memberInterest + '\'' +
//                ", regdate='" + regdate + '\'' +
//                ", memberPoint=" + memberPoint +
//                ", memberRole='" + memberRole + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = (memberBirth != null) ? memberBirth.format(formatter) : "null";

        return "MembersDto{" +
                "memberID=" + memberID +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPasswd='" + memberPasswd + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", memberNickName='" + memberNickName + '\'' +
                ", memberBirth='" + formattedDate + '\'' +
                ", memberPostcode='" + memberPostcode + '\'' +
                ", memberAddress='" + memberAddress + '\'' +
                ", memberDetailAddress='" + memberDetailAddress + '\'' +
                ", memberExtraAddress='" + memberExtraAddress + '\'' +
                ", memberInterest='" + memberInterest + '\'' +
                ", regdate='" + regdate + '\'' +
                ", memberPoint=" + memberPoint +
                ", memberRole='" + memberRole + '\'' +
                '}';
    }

}
