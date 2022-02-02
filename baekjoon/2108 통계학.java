import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();

        int N = sc.nextInt();

        int [] arr = new int[N];
        int [] index = new int[8001];

        double sum = 0;
        int max = 0;

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            index[arr[i] + 4000] ++;    //아래 반복문의 범위를 위해 음수도 계산할수 있게끔 4000을 더해준다 .
        }

        Arrays.sort(arr);

        for(int i = 0; i<=8000; i++){
            if(max <=index[i]){       //만약 index[i]값이 max 보다 크거나 같다면 max = index[i] 가 된다.  
                max = index[i];
            }
        }
        for(int i =0 ;i<=8000; i++){
            if(index[i] == max){    //위 반복문을 통해 가장 많이 나온 값인 max와 index[i]와 같다면
                li.add(i-4000);     // li에 (i-4000)값을 다 추가해준다.
            }
        }
        int mod = 0;
        if(li.size() == 1){     //max 값이 하나 밖에 없다면 
            mod = li.get(0);    //max값 출력 
        }
        else {                 //max가 여러개 있으면 
            Collections.sort(li); //li를 sort를 해준다.
            mod = li.get(1);      // sort한 값의 2번째에 해당하는 값을 출력한다. 
        }
        System.out.println(Math.round(sum/N));   //산술평균
        System.out.println(arr[(N/2)]);          //중앙값(홀수이기 때문에 )
        System.out.println(mod);                 //최빈값
        System.out.println(arr[N-1] - arr[0]);   //범위


    }
}

