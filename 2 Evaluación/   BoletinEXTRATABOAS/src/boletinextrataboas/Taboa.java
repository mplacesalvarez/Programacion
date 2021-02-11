
package boletinextrataboas;

import javax.swing.JOptionPane;

public class Taboa {
    String[][]resultados= {{"Equipo/xornada","X1","X2","X3"},{"Celta","3","4","2"},{"Bilbao","1","2","1"},{"Malaga","3","0","1"}};
  int golescelta;
      int golesbilbao;
       int golesmalaga;
       
       
   public void mostrararray(){
   for(int i=0;i<resultados.length;i++){for(int j=0;j<resultados[i].length;j++){System.out.print(resultados[i][j]+"\t");}
   
 
   System.out.println("");
   }
   }
   
   
   public void pasarint(){
       int celtax1=Integer.parseInt(resultados[1][1]);
int celtax2=Integer.parseInt(resultados[1][2]);
int celtax3=Integer.parseInt(resultados[1][3]);
int bilbaox1=Integer.parseInt(resultados[2][1]);
int bilbaox2=Integer.parseInt(resultados[2][2]);
int bilbaox3=Integer.parseInt(resultados[2][3]);
int malagax1=Integer.parseInt(resultados[3][1]);
int malagax2=Integer.parseInt(resultados[3][2]);
int malagax3=Integer.parseInt(resultados[3][3]);

int gcelta= celtax1+celtax2+celtax3;
        int gbilbao=bilbaox1+bilbaox2+bilbaox3;
              int gmalaga= malagax1+malagax2+malagax3;
      
  golescelta=gcelta;
           gbilbao=gbilbao;
           gmalaga=gmalaga;
   
   }
public void ordendecre(){

              System.out.println("\nPOSICIONES DE LOS EQUIPOS SEGÚN MENOR NÚMERO DE GOLES: ");
if(golesmalaga<golescelta){System.out.println(resultados[3][0]);if(golescelta<golesbilbao){System.out.println(resultados[1][0]+"\n"+resultados[2][0]);}else{System.out.println(resultados[2][0]+"\n"+resultados[1][0]);}}
     else if(golescelta<golesbilbao){System.out.println(resultados[1][0]);if(golesbilbao<golesmalaga){System.out.println(resultados[2][0]+"\n"+resultados[3][0]);}else{System.out.println(resultados[3][0]+"\n"+resultados[2][0]);}}
              else{System.out.println(resultados[2][0]);if(golescelta<golesmalaga){System.out.println(resultados[1][0]+"\n"+resultados[3][0]);}else{System.out.println(resultados[3][0]+"\n"+resultados[1][0]);}}
}
   public void equipoconmasgoles(){
           int celtax1=Integer.parseInt(resultados[1][1]);
int celtax2=Integer.parseInt(resultados[1][2]);
int celtax3=Integer.parseInt(resultados[1][3]);
int bilbaox1=Integer.parseInt(resultados[2][1]);
int bilbaox2=Integer.parseInt(resultados[2][2]);
int bilbaox3=Integer.parseInt(resultados[2][3]);
int malagax1=Integer.parseInt(resultados[3][1]);
int malagax2=Integer.parseInt(resultados[3][2]);
int malagax3=Integer.parseInt(resultados[3][3]);

System.out.println("\n");
       System.out.println("XORNADA 1");
   if(celtax1>bilbaox1){if(celtax1>malagax1){System.out.println("El equipo Celta marcó más goles");}else{System.out.println("El equipo Málaga marcó más goles");}}
   else{if(bilbaox1>malagax1){System.out.println("El equipo Bilbao marcó más goles");}}
       
   System.out.println("XORNADA 2");
    if(celtax2>bilbaox2){if(celtax2>malagax2){System.out.println("El equipo Celta marcó más goles");}else{System.out.println("El equipo Málaga marcó más goles");}}
   else{if(bilbaox2>malagax2){System.out.println("El equipo Bilbao marcó más goles");}}
   System.out.println("XORNADA 3");
   
    if(celtax3>bilbaox3){if(celtax3>malagax3){System.out.println("El equipo Celta marcó más goles");}else{System.out.println("El equipo Málaga marcó más goles");}}
   else{if(bilbaox3>malagax3){System.out.println("El equipo Bilbao marcó más goles");}}
   
   }
   
   
   public void consultas(){
   String equipo=JOptionPane.showInputDialog("Introduce el nombre del equipo (celta, bilbao, malaga): ");
   int xornada=Integer.parseInt(JOptionPane.showInputDialog("Introduce a xornada (1, 2, 3): "));
  
   System.out.println("\n");
   switch(equipo){
       case "celta":if(xornada==1){System.out.println("El celta consiguió "+resultados[1][1]+" goles");}else if(xornada==2){System.out.println("El celta consiguió "+resultados[1][2]+" goles");}if(xornada==3){System.out.println("El celta consiguió "+resultados[1][3]+" goles");}
               break;
   case "bilbao":if(xornada==1){System.out.println("El bilbao consiguió "+resultados[2][1]+" goles");}else if(xornada==2){System.out.println("El bilbao consiguió "+resultados[2][2]+" goles");}if(xornada==3){System.out.println("El bilbao consiguió "+resultados[2][3]+" goles");}
               break;
   case "malaga":if(xornada==1){System.out.println("El málaga consiguió "+resultados[3][1]+" goles");}else if(xornada==2){System.out.println("El málaga consiguió "+resultados[3][2]+" goles");}if(xornada==3){System.out.println("El málaga consiguió "+resultados[3][3]+" goles");}
               break;
   
 
   }
   
   
  
   
   
   }     
    }     
   
 

