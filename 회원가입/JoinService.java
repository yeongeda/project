package com.example.project.service;

import com.example.project.dto.MembersDto;
import com.example.project.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    MemberMapper memberMapper;

    public String nameCheck(String nickName) {
        int result = memberMapper.nameCheck(nickName);

        String str = "";
        if(result > 0) {
            str = "No";
        }else {
            str = "Yes";
        }
        return str;
    }

    public MembersDto resultEmail(String memberName, String memberPhone) {

        return memberMapper.resultEmail(memberName, memberPhone);
    }

    public MembersDto resultPasswd(String memberNickName, String memberEmail) {
        return memberMapper.resultPasswd(memberNickName, memberEmail);
    }

    /*
    public String emailCheck(String memberEmail) {
        int result = memberMapper.emailCheck(memberEmail);

        String str = "";
        if(result > 0) {
            str = "N";
        }else {
            str = "Y";
        }
        return str;
    }*/

    public int emailCheck(String memberEmail) {
        int res = memberMapper.emailCheck(memberEmail);
        System.out.println("res: " + res);
        return res;
    }
}

