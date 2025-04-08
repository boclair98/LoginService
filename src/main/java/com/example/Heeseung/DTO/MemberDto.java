package com.example.Heeseung.DTO;

import com.example.Heeseung.Entity.Member;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    @NotBlank(message = "이름 입력 필수.")
    private String username;
    @NotBlank(message = "ID 입력 필수.")
    private String userid;
    @NotBlank(message = "Password 입력 필수.")
    private String password;
    @NotNull(message = "나이 입력 필수.")
    @Min(value = 1,message = "나이는 음수가 될 수 없습니다.")
    private int age;
    @NotBlank(message = "주소 입력 필수.")
    private String address;
    @NotBlank(message = "핸드폰 번호 입력 필수.")
    private String phonenumber;

}
