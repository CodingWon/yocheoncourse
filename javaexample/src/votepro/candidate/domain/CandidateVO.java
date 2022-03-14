package votepro.candidate.domain;

public class CandidateVO {
    private Integer cno;
    private String name;
    private String party;

    public CandidateVO(Integer cno, String name, String party) {
        this.cno = cno;
        this.name = name;
        this.party = party;

    }
}
