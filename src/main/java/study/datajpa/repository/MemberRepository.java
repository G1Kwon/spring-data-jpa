package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    List<Member> findTop3HelloBy();

    //@Query 없어도 돌아간다. 메서드 명을 가지고 1차로 찾기 때문이다.
//    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
