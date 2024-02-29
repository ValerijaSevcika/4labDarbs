// 231RDB245 Valerija Ševčika 4

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("31RDB245 Valerija Ševčika 4. grupa");
		
		
		String fileName;
		System.out.println("input file name:");
		fileName = sc.nextLine();
		sc.close();

        try(FileReader reader = new FileReader(fileName); Scanner scanner = new Scanner(reader)){
            System.out.println("result:");
            while(scanner.hasNextLine()){
                String a = scanner.nextLine();
                String [] part = a.split(" ");
                String name = part[0];
                String surname = part[1];
                int atzime = Integer.parseInt(part[2]);

                int atzimes = 0;
                int count = 0;


                for(int i =2; i<=part.length ; i++);{
                    atzimes += atzime;
                    count++;
                }

                double avarage = (double) atzimes/count;

                if(avarage <=5 ){
                    int d = 5 - (int) Math.round(avarage);
                    System.out.println(name + " " + surname + " " + d);
                }
            }
            reader.close();
            scanner.close();
		
        }

	}

}