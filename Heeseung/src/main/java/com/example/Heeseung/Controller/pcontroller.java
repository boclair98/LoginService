package com.example.Heeseung.Controller;

import com.example.Heeseung.DTO.MemberDto;
import com.example.Heeseung.Entity.Board;
import com.example.Heeseung.Entity.Member;
import com.example.Heeseung.Service.BoardService;
import com.example.Heeseung.Service.MemberService;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/member")
public class pcontroller {
    @Autowired private MemberService memberService;
    @Autowired private BoardService boardService;

    @GetMapping("/join")
    public String memberJoin(Model model){
        return "index";
    }

    @PostMapping("/join")
    public String memberJoin(@Valid @ModelAttribute("memberDto") MemberDto memberDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "index";
        }
//        System.out.println(name+" "+password+" "+age);
        if(!memberService.checkMember(memberDto.getUserid())){
            Member member = new Member();
            member.setUsername(memberDto.getUsername());
            member.setUserid(memberDto.getUserid());
            member.setPassword(memberDto.getPassword());
            member.setAge(Integer.parseInt(String.valueOf(memberDto.getAge())));
            member.setAddress(memberDto.getAddress());
            member.setPhonenumber(memberDto.getPhonenumber());
            memberService.save(member);
        }
        return "home";
    }
    @GetMapping("/login")
    public String memberLogin(){
        return "login.html";
    }
    @PostMapping("/login")
    public String memberLogins(@Valid @ModelAttribute MemberDto memberDto,BindingResult bindingResult,
                               HttpServletResponse response,
                               Model model,HttpServletRequest request){
        if(memberService.checkMember(memberDto.getUserid())){
            List<Member> members = memberService.findAll();
            for (Member member : members) {
                if(member.getPassword().equals(memberDto.getPassword())){
                    model.addAttribute("username",member.getUsername());
//                    Cookie cookie = new Cookie("memberId", String.valueOf(member.getId()));
//                    response.addCookie(cookie);

                    //로그인 성공시 쿠키 -> 세션으로 추가
                    //생성시 true , 생성 거부 false -> 디폴트 true
                    HttpSession session = request.getSession();
                    session.setAttribute("member",member);
                    return "home";
                }
            }
            model.addAttribute("error","Password 오류");
            return "login.html";
        }
        model.addAttribute("error","아이디가 존재하지않습니다.");

        return"login.html";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session!=null){
            session.invalidate();
        }
        return "redirect:/member/join";
    }
}
