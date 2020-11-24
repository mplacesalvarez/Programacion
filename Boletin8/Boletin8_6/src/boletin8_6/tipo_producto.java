
package boletin8_6;


public class tipo_producto {
    
    public void productos(int num_vendas){
    if((num_vendas>=0)&&(num_vendas<=100)){System.out.println("O artigo de consumo é baixo");}else{if((num_vendas>100)&&(num_vendas<=500)){System.out.println("O artigo de consumo é medio");}else{if((num_vendas>500)&&(num_vendas<=1000)){System.out.println("O artigo de consumo é alto");}else{if(num_vendas>1000){System.out.println("O artigo de consumo é de primeira necesidade");}}}}
    
    
}}