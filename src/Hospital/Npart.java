package 병원;
// 내과
public class Npart extends Patient {
    private int waistCircumference;

    public Npart()
    {
        super(); //무조건 아래 생성자보다 위에 있어야함
        waistCircumference = 0;
    }

    // 오버로딩 생성자
    public Npart(String name,String gender,int weight,String blood,int waistCircumference)
    {
        super(name,gender,weight,blood);
        this.waistCircumference = waistCircumference;
    }

    // 게터세터
    public int getWaistCircumference() {
        return this.waistCircumference;
    }

    public void setWaistCircumference(int waistCircumference) {
        this.waistCircumference = waistCircumference;
    }


}
