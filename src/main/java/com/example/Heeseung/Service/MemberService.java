package com.example.Heeseung.Service;

import com.example.Heeseung.Entity.Member;
import com.example.Heeseung.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired MemberRepository memberRepository;

    public void save(Member member){
        memberRepository.save(member);
    }

    public Optional<Member> findById(Long id){
        return memberRepository.findById(id);
    }

    public void delete(Long id){
        memberRepository.deleteById(id);
    }

    public boolean checkMember(String userid){
        return memberRepository.existsByuserid(userid);
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }
}
