import java.util.ArrayList;
import java.util.Scanner;


public class dfafafa {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("암호 문자열을 입력하시오");
        String str = scan.nextLine(); 

        System.out.println("key를 입력하시오");
        String key = scan.nextLine();

        String[] test = str.split("", str.length());
        String[] keytest = key.split("", key.length()); 

        int idx = 0;

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {
            list.add(test[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(keytest[0])) {
                idx = i;
            }

        }
        for (int i = idx; i < key.length(); i++) {
            list.remove(keytest[i-1]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

    }
}
}
