# LoginService
로그인 기본 구현 

## 🚀 주요 기능

- ✅ 사용자 회원가입
- 🔐 로그인 및 로그아웃 처리
- 🍪 세션 + 쿠키 기반 인증 처리
- 🛡️ 비밀번호 암호화 (BCrypt)
- ❌ 인증 예외 및 예외 처리
- 📂 계층별 구조를 갖춘 깔끔한 설계
---

## 🛠️ 사용 기술 스택

| 구분 | 기술 |
|------|------|
| Language | Java 17 |
| IDE | IntelliJ IDEA |
| Framework | Spring Boot |
| ORM | JPA (Hibernate) |
| Database | MySQL |
| 인증 방식 | Session + Cookie |
---

## 📁 프로젝트 구조
com.example.Heeseung
  ├── HeeseungApplication.java
    └── Controller 
      ├── pcontoller.java
    └── DTO
      ├── MemberDTO
    ├── Entity
      ├──Member
      ├──Board
    ├──Repository
      ├──BoardRepository
      ├──MemberRepository
    ├──Service
      ├──BoardService
      ├──MemberService
