package com.example.project.mapper;

import com.example.project.dto.AddressDto;
import com.example.project.dto.MembersDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.Member;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO member_join VALUES (NULL, #{memberEmail}, #{memberPasswd}, #{memberName}, #{memberPhone}, #{memberNickName}, #{memberBirth}, #{memberPostcode}, #{memberAddress}, #{memberDetailAddress}, #{memberExtraAddress}, #{memberInterest}, now(), #{memberPoint}, '회원')")
    public void insertMember(MembersDto membersDto);

    @Select("SELECT COUNT(*) FROM member_join WHERE memberNickName = #{memberNickName}")
    int nameCheck(String memberNickName);

    @Select("SELECT memberEmail, regdate FROM member_join WHERE memberName = #{memberName} AND memberPhone = #{memberPhone}")
    public MembersDto resultEmail(String memberName, String memberPhone);

    @Select("SELECT memberPasswd FROM member_join WHERE memberNickName = #{memberNickName} AND memberEmail = #{memberEmail}")
    public MembersDto resultPasswd(String memberNickName, String memberEmail);

    @Select("SELECT COUNT(*) FROM member_join WHERE memberEmail = #{memberEmail}")
    public int emailCheck(String memberEmail);

}