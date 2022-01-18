import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [9];
        int acs = 0;
        int des = 0;
        for(int i = 0 ; i<8; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == i+1)
                acs++;
            else if(arr[i] == 8-i)
                des--;
        }
        if(acs == 8)
            System.out.println("ascending");
        else if(des == -8)
            System.out.println("descending");
        else
            System.out.println("mixed");


    }
}
