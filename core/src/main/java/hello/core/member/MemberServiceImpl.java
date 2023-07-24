package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 가입을 하고 회원을 찾으려면 MemberRepository 인터페이스가 필요하다.
    private final MemberRepository memberRepository;
    
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
