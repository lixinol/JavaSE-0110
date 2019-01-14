package day04;

public class Car {
    private String color;
    private String hao;
    public Car(){

    }
    public Car(String color,String hao)
    {
        this.color=color;
        this.hao=hao;
    }
    public void car()
    {
        System.out.println("颜色:"+color+" 型号:"+hao);
    }
    public void car2()
    {
        System.out.println("颜色:"+color+" 型号:"+hao);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHao() {
        return hao;
    }

    public void setHao(String hao) {
        this.hao = hao;
    }
}
