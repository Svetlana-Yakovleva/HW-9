public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] ledger = {10342, 54673, 27438, 45331, 12395};
        int amountSpent =0;
        for (int element : ledger) {
            amountSpent += element;
        }
        System.out.println("Сумма трат за месяц составила "+ amountSpent+ " рублей.");
        System.out.println("Задача 2");
        int maxAmount = 0;
        int minAmount = ledger[0];
        for (final int current: ledger){
            if (current>maxAmount){
                maxAmount=current;
            }
            if (current < minAmount){
                minAmount=current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minAmount+ " рублей. Максимальная сумма трат за неделю составила "+maxAmount+ "рублей.");
        System.out.println("Задача 3");

            float average = (float) amountSpent/ledger.length ;

        System.out.println("Средняя сумма трат за месяц составила "+ average +" рублей.");
        System.out.println("Задача 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i= reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }


    }


}