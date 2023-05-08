package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    //필드로 di 주입(비추천)
    //@Autowired private MemberService memberService;

    // setter로 di 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    // 생성자로 di 주입 (권장)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }




}
