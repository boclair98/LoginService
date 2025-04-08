package com.example.Heeseung;

import com.example.Heeseung.Entity.Member;
import com.example.Heeseung.Repository.MemberRepository;
import com.example.Heeseung.Service.MemberService;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HeeseungApplicationTests {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private MemberService memberService;

	@BeforeEach
	void setup(){

	}

	@Test
	void contextLoads() {
	}

//	@Test
//	public void save(){
//		Member member1 = new Member("aaa", 20);
//		Member member2 = new Member("bbb", 30);
//		memberService.save(member1);
//		memberService.save(member2);
//		Optional<Member> member = memberService.findById(member1.getId());
//		Assertions.assertThat(member.get().getName()).isEqualTo(member1.getName());
//		Assertions.assertThat(member.get().getAge()).isEqualTo(member1.getAge());
//
//	}
//	@Test
//	public void delete(){
//		Member member1 = new Member("aaa", 20);
//		memberRepository.save(member1);
//		memberService.delete(member1.getId());
//		Optional<Member> byId = memberService.findById(member1.getId());
//		Assertions.assertThat(byId.isEmpty()).isEqualTo(true);
//	}


}
