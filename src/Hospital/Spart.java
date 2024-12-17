package 병원;
// 산부인과
public class Spart extends Patient {
    
    private boolean Pregnancy;

    public Spart()
    {
        super();
        Pregnancy = false;
    }

    // 오버로딩 생성자
    public Spart(String name,String gender,int weight,String blood,boolean Pregnancy)
    {
        super(name,gender,weight,blood);
        this.Pregnancy = Pregnancy;
    }

    // 게터세터
    public boolean getPregnancy() {
        return this.Pregnancy;
    }

    public void setPregnancy(boolean Pregnancy) {
        this.Pregnancy = Pregnancy;
    }
}
