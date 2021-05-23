package project;

import java.util.List;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Codigo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("JORGE XXX");
		names.add("JORGE XXX");
		names.add("JORGE IV");
		names.add("JORGE VII");
		names.add("JORGE XXX");
		names.add("JORGE L");
		
		ArrayList<String> namesSort = new ArrayList<>(names.size());
		
		for(int i=0;i<names.size();i++){
            
            String name = names.get(i).split(" ")[0];
            String numberStr = names.get(i).split(" ")[1];
            int number =0;
            
            for(int j=0;j<numberStr.length();j++){
                String letra=numberStr.substring(j,j+1);
                String letraPos="";
                if(numberStr.length()>=j+2) {
                	letraPos=numberStr.substring(j+1,j+2);
                }
                if(letra.equals("L")){
                    number+=50;
                }
                if(letra.equals("X")){
                    if(letraPos!="L"){
                        number+=10;                    
                    }else{
                        number-=10;  
                    }
                }
                if(letra.equals("V")){
                    number+=5;  
                }
                if(letra.equals("I")){
                    if(letraPos!="V" || letraPos!="X"){
                        number+=1;
                    }else{
                        number-=1;
                    }
                }
                
            }
            
            System.out.println(number+";"+name+" "+numberStr);
            
            NumberFormat formatter = new DecimalFormat("000");
            namesSort.add(formatter.format(number)+";"+name+" "+numberStr);
         
            
        }

		Collections.sort(namesSort);
        
		for(int i=0;i<namesSort.size();i++) {
			System.out.println(namesSort.get(i).split(";")[1]);
		}
		

	}

}
