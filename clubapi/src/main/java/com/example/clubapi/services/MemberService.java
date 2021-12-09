package com.example.clubapi.services;

import com.example.clubapi.models.Member;
import com.example.clubapi.repositories.Member.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   
public class MemberService {
    
    @Autowired
    MemberRepo repo;

    public Iterable<Member> getAllMembers(){
        return repo.getAllMembers();
    }

    public Member getByDni(String dni){
        return repo.findById(dni);
    }

    public Boolean postMember(Member member){
        return repo.save(member) != null;
    }

    public Boolean deleteById(String dni){
        return repo.deleteById(dni);
    }

}
