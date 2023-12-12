package com.example.project.controller;

import com.example.project.dto.AddressDto;
import com.example.project.dto.MembersDto;
import com.example.project.mapper.MemberMapper;
import com.example.project.service.JoinService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberMapper mm;

    @Autowired
    JoinService joinService;

    @GetMapping("/signup")
    public String getSignup() {
        return "member/signup";
    }

    @PostMapping("/signup")
    @ResponseBody
    public Map<String, Object> insertMember(@ModelAttribute MembersDto membersDto, @RequestParam("memberBirth") String memberBirth) {
        Map<String, Object> map = new HashMap<>();

        LocalDate birthDate = null;
        if (memberBirth != null && !memberBirth.trim().isEmpty()) {
            try {
                birthDate = LocalDate.parse(memberBirth);
            } catch (DateTimeException e) {
                e.printStackTrace();
            }
        }

        membersDto.setMemberBirth(birthDate);

        if (membersDto != null) {

            mm.insertMember(membersDto);
            System.out.println(membersDto);
            map.put("message", "success");
        } else {
            map.put("message", "failure");
        }

        return map;

    }

    @GetMapping("/login")
    public String getLogin() {
        return "member/login";
    }


    @GetMapping("/nameCheck")
    @ResponseBody
    public Map<String, Object> getNameCheck(@RequestParam String nickName) {
        String result = joinService.nameCheck(nickName);
        System.out.println(joinService.nameCheck(nickName));
        return Map.of("msg", result);
    }

    @GetMapping("/searchEmail")
    public String getSearchEmail() {
        return "/member/searchEmail";
    }

    @GetMapping("/resultEmail")
    public String resultEmail() {
        return "/member/resultEmail";
    }

    @PostMapping("/resultEmail")
    public String getResultEmail(@ModelAttribute MembersDto mdto, Model model) {
        model.addAttribute("result", mm.resultEmail(mdto.getMemberName(), mdto.getMemberPhone()));
        return "/member/resultEmail";
    }

    @GetMapping("/searchPasswd")
    public String getSearchPasswd() {
        return "/member/searchPasswd";
    }

    @GetMapping("/resultPasswd")
    public String getResultPasswd() {
        return "/member/resultPasswd";
    }

    @PostMapping("/resultPasswd")
    public String getResultPasswd(@ModelAttribute MembersDto mdto, Model model) {
        model.addAttribute("result", mm.resultPasswd(mdto.getMemberNickName(), mdto.getMemberEmail()));
        return "/member/resultPasswd";
    }

//    @GetMapping("/emailCheck")
//    @ResponseBody
//    public Map<String, Object> getEmailCheck(@RequestParam String memberEmail) {
//        String result = joinService.emailCheck(memberEmail);
//        return Map.of("msg", result);
//    }

    @PostMapping("/emailCheck")
    @ResponseBody
    public int emailCheck(@RequestParam("memberEmail") String memberEmail) {
        int res = joinService.emailCheck(memberEmail);
        return res;
    }
}

