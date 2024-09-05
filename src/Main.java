public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");
        for (int i = 10; i>=1;i--){
            System.out.println(i);
        }
        //Task 3
        System.out.println("Task 3");
        for(int i =0; i<=17; i = i + 2){
            System.out.println(i);
        }
        //Task 4
        System.out.println("Task 4");
        for(int i = 10; i>=-10; i--){
            System.out.println(i);
        }
        //Task 5
        System.out.println("Task 5");
        for(int i = 1904; i <=2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        //Task 6
        System.out.println("Task 6");

        for(int i =7; i<=98; i = i+7 ){
            System.out.println(i);
        }
        //Task 7
        System.out.println("Task 7");
        for(int i = 1; i<=512; i = i*2){
            System.out.println(i);
        }
        //Task 8
        System.out.println("Task 8");
        int salary = 29000;
        int total = 0;
        for(int i = 1; i <=12; i++){
            total = total + salary;
            System.out.println("Месяц "+ i + ", сумма накопления равна "+ total+ " рублей");
        }
        //Task 9
        System.out.println("Task 9");
        int salaryNew = 29000;
        int totalNew = 0;
        for(int i = 1; i <=12; i++){
            totalNew = totalNew + totalNew/100;
            totalNew = totalNew + salaryNew;
            System.out.println("Месяц "+ i + ", сумма накопления равна "+ totalNew+ " рублей");
        }
        //Task 10
        System.out.println("Task 10");

        for(int i = 2; i <= 20; i=i+2){

            System.out.println(i);
        }
    }
}
