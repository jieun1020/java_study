package 병원;
public class Patient {
    // 이름성별몸무게혈액형
    private String name;
    private String gender;
    private int weight;
    private String blood;

    // 기본생성자
    public Patient()
    {
      name = "";
      gender = "";
      weight = 0;
      blood = "";
      System.out.println("Patient() - constructor");

    }

    // 오버로딩 생성자
    public Patient(String name,String gender,int weight,String blood)
    {
      this.name = name;
      this.gender = gender;
      this.weight = weight;
      this.blood = blood;
    }


    // 게터세터
    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getGender() {
      return this.gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }

    public int getWeight() {
      return this.weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public String getBlood() {
      return this.blood;
    }

    public void setBlood(String blood) {
      this.blood = blood;
    }



  public void checkMedical()
  {
    System.out.println("혈액형을 검사합니다");
    System.out.println("체중을 검사합니다");
  }

}
