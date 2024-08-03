//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i<5; i++){
            if ((i%2)==0){
                total+=10;
            }else {
                total-=5;
            }
        }
        System.out.println(total);

        int a=2, b=5, c=7;
        for(;;){
            if(a>2*b){
                break;
            }
            a+=(c-b);
            b--;
            c++;
        }
        System.out.println(c-a);

        int j = 5;
        while (j > 0) {
            System.out.print(j);
            j--;
        }
        char[] ch = {'Z', 'X', 'C'};
        char tmp;
        for(int r=0; r<5; r++){
            tmp=ch[0];
            ch[0]=ch[2];
            ch[1]=tmp;
            ch[2]=ch[1];
        }
        System.out.println(" ");
        System.out.println(ch);

        int[] ammount = {0,0,0,0,0,0,0,0,0,0};
        int[] numbers = {1,2,3,4,2,9,3};
        for (int h = 0; h < numbers.length; h++){
            ammount[numbers[h]]++;
        }
        System.out.println(ammount[1]);
    }
//    public static int countXY(int x, int y){
//        return x+y;
//    }
}

//SELECT sum(CITY.POPULATION) FROM CITY JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE WHERE CONTINENT = 'Europe'

//SELECT sum(CITY.POPULATION)
//FROM CITY
//JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE
//WHERE CONTINENT = 'Europe'
// CDE
// C