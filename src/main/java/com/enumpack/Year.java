package com.enumpack;

interface  Interf1 {
    public void m1();
}
public enum Year implements Interf1
{
    JANUARY(2025){
        public  void  greet()
        {
            System.out.println(this.name()+" Year:"+this.year);
        }
        public void m1()
        {
            System.out.println("Inside M1 method of January");
        }
    },FEBRUARY(2025){
    public  void  greet()
    {
        System.out.println(this.name()+" Year:"+this.year);
    }
    public void m1()
    {
        System.out.println("Inside M1 method of February");
    }
},MARCH(2025,true){
    public  void  greet()
    {
        System.out.println(this.name()+" Year:"+this.year);
    }
    public void m1()
    {
        System.out.println("Inside M1 method of March");
    }
};

    public  final  int year;
    private Year(int year)
    {
        this.year=year;
    }
    public   boolean birthdayMonth;
    Year(int year,boolean birthdayMonth)
    {
        this.year=year;
        this.birthdayMonth=birthdayMonth;
    }
    public  abstract  void greet();
}
